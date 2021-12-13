package com.frames;

import static com.classes.PuntodeVenta.main;
import com.classes.MyCellRenderer;
import com.classes.MyConnection;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Sucursales {

    public void Insertar(String sucursal, String domicilio) {
        int estatus = 1;
        try {
            Connection cn = MyConnection.getConnection();
            CallableStatement cst = cn.prepareCall("{call agregarSucursal(?,?,?)}");
            cst.setString(1, sucursal);
            cst.setString(2, domicilio);
            cst.setInt(3, estatus);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Modificar(int id, String sucursal, String domicilio) {
        try {
            Connection cn = MyConnection.getConnection();
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
        int estatus = 0;
        try {
            ResultSet rs;
            Connection cn = MyConnection.getConnection();
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
            if (cb.isSelected() == true) {
                dfm.addColumn("ID");
                dfm.addColumn("Nombre");
                dfm.addColumn("Domicilio");
                dfm.addColumn("Estatus");
                PreparedStatement pst = cn.prepareStatement("select * from Sucursales");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    dfm.addRow(new Object[]{rs.getInt("idSucursal"), rs.getString("nombre"), rs.getString("domicilio"), rs.getInt("estatus")});
                }
                table.setModel(dfm);
                main.DisenarTabla(table, 4);
                //Poner en rojo los inactivos
                for (int i = 0; i < table.getColumnCount(); i++) {
                    table.getColumnModel().getColumn(i).setCellRenderer(new MyCellRenderer());
                }
            } else {
                dfm.addColumn("ID");
                dfm.addColumn("Nombre");
                dfm.addColumn("Domicilio");
                PreparedStatement pst = cn.prepareStatement("select * from Sucursales where estatus = 1");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    dfm.addRow(new Object[]{rs.getInt("idSucursal"), rs.getString("nombre"), rs.getString("domicilio")});
                }
                table.setModel(dfm);
                main.DisenarTabla(table, 3);
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
}
