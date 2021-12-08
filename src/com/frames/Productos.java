
package com.frames;

import com.classes.MyConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Productos {   
    
    public void Insertar(String nombre, String descripcion, int precio, int cantidad) {
        int estatus = 1;
        try {
            Connection cn = MyConnection.getConnection();
            CallableStatement cst = cn.prepareCall("{call agregarProducto(?,?,?,?,?)}");
            cst.setString(1, nombre);
            cst.setString(2, descripcion);
            cst.setInt(3, precio);
            cst.setInt(4, cantidad);
            cst.setInt(5, estatus);
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
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                temp = rs.getInt("estatus");
            }
            if (temp == 1){
                estatus = 0;
            }else{
                estatus = 1;
            }
            CallableStatement cst = cn.prepareCall("{call estatusProducto(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, estatus);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Modificar(int id, String nombre, String descripcion, int precio, int cantidad) {
        try {
            Connection cn = MyConnection.getConnection();
            CallableStatement cst = cn.prepareCall("{call modificarProducto(?,?,?,?,?)}");
            cst.setInt(1, id);
            cst.setString(2, nombre);
            cst.setString(3, descripcion);
            cst.setInt(4, precio);
            cst.setInt(5, cantidad);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}