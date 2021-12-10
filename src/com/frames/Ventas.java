package com.frames;

import com.classes.MyConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Ventas {
    
    public void Insertar(int id, int iva) {
        try {
            Connection cn = MyConnection.getConnection();
            CallableStatement cst = cn.prepareCall("{call agregarVenta(?,?,?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, 0);
            cst.setInt(3, iva);
            cst.setInt(4, 0);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Modificar(int id, int subtotal, int iva, int total) {
        try {
            Connection cn = MyConnection.getConnection();
            CallableStatement cst = cn.prepareCall("{call modificarVenta(?,?,?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, subtotal);
            cst.setInt(3, iva);
            cst.setInt(4, total);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}