
package com.frames;

import static com.classes.PuntodeVenta.main;
import com.classes.MyConnection;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

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
    
    public void CrearTabla(JTable table) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Folio");
            dfm.addColumn("ID Sucursal");
            dfm.addColumn("Subtotal");
            dfm.addColumn("IVA");
            dfm.addColumn("Total");
            dfm.addColumn("Fecha");
            PreparedStatement pst = cn.prepareStatement("select * from Ventas");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("folio"), rs.getInt("idSucursal"), (rs.getInt("subtotal")), (rs.getInt("iva")), (rs.getInt("total")), rs.getDate("fecha")});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 6);  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void vaciarTxt(JTextField id, JTextField total, JTextField subtotal, JComboBox<String> cbProductos, JComboBox<String> cbCantidad) {
        id.setText("");
        total.setText("");
        subtotal.setText("");
        cbProductos.setSelectedIndex(0);
        cbCantidad.setSelectedIndex(0);
    }
}