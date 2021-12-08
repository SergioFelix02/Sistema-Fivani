package com.frames;

import com.classes.MyConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Ventas {

    public void Insertar() {
        try {
            Connection cn = MyConnection.getConnection();
            CallableStatement cst = cn.prepareCall("{call agregarVenta(?,?,?,?)}");
            cst.setInt(1, 1);
            cst.setInt(2, 0);
            cst.setInt(3, 0);
            cst.setInt(4, 0);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Modificar(int id, int total) {
        try {
            Connection cn = MyConnection.getConnection();
            CallableStatement cst = cn.prepareCall("{call modificarVenta(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, total);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}