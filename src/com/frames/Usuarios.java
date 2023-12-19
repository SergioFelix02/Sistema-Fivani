package com.frames;

import com.classes.MyCellRenderer;
import com.classes.MyConnection;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Usuarios {
    MainUI main = new MainUI();
    public void Insertar(String usuario, String contrasena, int permisos) {
        int estatus = 1;
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call agregarUsuario(?,?,?,?)}");
            cst.setString(1, usuario);
            cst.setString(2, contrasena);
            cst.setInt(3, permisos);
            cst.setInt(4, estatus);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Modificar(int id, String usuario, String contrasena, int permisos) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call modificarUsuario(?,?,?,?)}");
            cst.setInt(1, id);
            cst.setString(2, usuario);
            cst.setString(3, contrasena);
            cst.setInt(4, permisos);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call estatusUsuario(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, 1);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Desactivar(int id) {
        int temp = 0;
        int estatus;
        try {
            ResultSet rs;
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select * from Usuarios where idUsuario = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                temp = rs.getInt("estatus");
            }
            if (temp == 1) {
                estatus = 0;
            } else {
                estatus = 1;
            }
            CallableStatement cst = cn.prepareCall("{call estatusUsuario(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, estatus);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void CrearTabla(JTable table, JCheckBox cb) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            if (cb.isSelected()) {
                dfm.addColumn("ID");
                dfm.addColumn("Usuario");
                dfm.addColumn("Contraseña");
                dfm.addColumn("Permisos");
                dfm.addColumn("Estatus");
                assert cn != null;
                PreparedStatement pst = cn.prepareStatement("select * from Usuarios");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int permisos = rs.getInt("permisos");
                    String permiso;
                    if (permisos == 1) {
                        permiso = "Admin";
                    } else {
                        permiso = "Default";
                    }
                    dfm.addRow(new Object[]{rs.getInt("idUsuario"), rs.getString("usuario"), rs.getString("contrasena"), permiso, rs.getInt("estatus")});
                }
                table.setModel(dfm);
                if (main != null){
                    main.DisenarTabla(table, 5);
                }
                //Poner en rojo los inactivos
                for (int i = 0; i < table.getColumnCount(); i++) {
                    //System.out.println(i);
                    table.getColumnModel().getColumn(i).setCellRenderer(new MyCellRenderer());
                }
            } else {
                dfm.addColumn("ID");
                dfm.addColumn("Usuario");
                dfm.addColumn("Contraseña");
                dfm.addColumn("Permisos");
                assert cn != null;
                PreparedStatement pst = cn.prepareStatement("select * from Usuarios where estatus = 1");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int permisos = rs.getInt("permisos");
                    String permiso;
                    if (permisos == 1) {
                        permiso = "Admin";
                    } else {
                        permiso = "Default";
                    }     
                    String pass = rs.getString("contrasena");
                    int n = pass.length();
                    pass = "*".repeat(n);
                    dfm.addRow(new Object[]{rs.getInt("idUsuario"), rs.getString("usuario"), pass, permiso});
                }
                table.setModel(dfm);
                if (main != null){
                    main.DisenarTabla(table, 4);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void vaciarTxt(JTextField id, JTextField user, JTextField pass) {
        id.setText("");
        user.setText("");
        pass.setText("");
    }
    public void Buscar(int id, JTextField txtIDUsuario, JTextField txtUser, JTextField txtPassword, JComboBox<String> cbPermisos) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select * from Usuarios where idUsuario = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idUsuario");
                String user = rs.getString("usuario");
                String password = rs.getString("contrasena");
                int permisos = rs.getInt("permisos");
                txtIDUsuario.setText(String.valueOf(id));
                txtUser.setText(user);
                txtPassword.setText(password);
                if (permisos == 1) {
                    cbPermisos.setSelectedIndex(1);
                } else {
                    cbPermisos.setSelectedIndex(0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }
}