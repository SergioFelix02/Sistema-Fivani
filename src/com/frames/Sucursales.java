package com.frames;

import com.classes.MyConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Sucursales {
    
    public void Insertar(String sucursal, String domicilio) {
        int estatus = 1;
        try {
            Connection cn = MyConnection.getConnection();
            CallableStatement cst = cn.prepareCall("{call agregarSucursal(?,?,?)}");
            cst.setString(1, sucursal);
            cst.setString(2, domicilio);
            cst.setInt(3, estatus);
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
            if (temp == 1){
                estatus = 0;
            }else{
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
    }
}