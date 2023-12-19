package com.frames;

import com.classes.MyCellRenderer;
import com.classes.MyConnection;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Sucursales {
    MainUI main = new MainUI();
    public void Insertar(String sucursal, String domicilio) {
        int estatus = 1;
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call agregarSucursal(?,?,?)}");
            cst.setString(1, sucursal);
            cst.setString(2, domicilio);
            cst.setInt(3, estatus);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Modificar(int id, String sucursal, String domicilio) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call modificarSucursal(?,?,?)}");
            cst.setInt(1, id);
            cst.setString(2, sucursal);
            cst.setString(3, domicilio);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call estatusSucursal(?,?)}");
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
            PreparedStatement pst = cn.prepareStatement("select * from Sucursales where idSucursal = ?");
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
            CallableStatement cst = cn.prepareCall("{call estatusSucursal(?,?)}");
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
                dfm.addColumn("Nombre");
                dfm.addColumn("Domicilio");
                dfm.addColumn("Estatus");
                assert cn != null;
                PreparedStatement pst = cn.prepareStatement("select * from Sucursales");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    dfm.addRow(new Object[]{rs.getInt("idSucursal"), rs.getString("nombre"), rs.getString("domicilio"), rs.getInt("estatus")});
                }
                table.setModel(dfm);
                if (main != null){
                    main.DisenarTabla(table, 4);
                }
                //Poner en rojo los inactivos
                for (int i = 0; i < table.getColumnCount(); i++) {
                    table.getColumnModel().getColumn(i).setCellRenderer(new MyCellRenderer());
                }
            } else {
                dfm.addColumn("ID");
                dfm.addColumn("Nombre");
                dfm.addColumn("Domicilio");
                assert cn != null;
                PreparedStatement pst = cn.prepareStatement("select * from Sucursales where estatus = 1");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    dfm.addRow(new Object[]{rs.getInt("idSucursal"), rs.getString("nombre"), rs.getString("domicilio")});
                }
                table.setModel(dfm);
                if (main != null){
                    main.DisenarTabla(table, 3);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void vaciarTxt(JTextField id, JTextField nombre, JTextField domicilio) {
        id.setText("");
        nombre.setText("");
        domicilio.setText("");
    }
    public void Buscar(int id, JTextField txtID_Sucursal, JTextField txtNombreS, JTextField txtDomicilio) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select * from Sucursales where idSucursal = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idSucursal");
                String nombre = rs.getString("nombre");
                String domicilio = rs.getString("domicilio");
                txtID_Sucursal.setText(String.valueOf(id));
                txtNombreS.setText(nombre);
                txtDomicilio.setText(domicilio);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}