package com.frames;

import static com.classes.PuntodeVenta.main;
import com.classes.MyConnection;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Reportes {

    public void Reporte1(JTable table) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("ID Producto");
            dfm.addColumn("Nombre");
            dfm.addColumn("Vendidos");
            CallableStatement cst = cn.prepareCall("{call ProductosMasVendidos}");
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idProducto"), rs.getString("nombreProducto"), rs.getInt("vendidos")});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 3);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Reporte2(JTable table) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("ID Producto");
            dfm.addColumn("Nombre");
            dfm.addColumn("Precio");
            dfm.addColumn("Cantidad");
            dfm.addColumn("Subtotal");
            CallableStatement cst = cn.prepareCall("{call ProductosVenta(?)}");
            cst.setInt(1, main.getFolio());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idProducto"), rs.getString("nombreProducto"), rs.getInt("precio"), rs.getInt("cantidad"), rs.getInt("subtotal")});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 5);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Reporte3(JTable table, JComboBox<String> cbSucursal, java.sql.Date fecha_inicio, java.sql.Date fecha_fin) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Folio");
            dfm.addColumn("ID Sucursal");
            dfm.addColumn("Subtotal");
            dfm.addColumn("IVA");
            dfm.addColumn("Total");
            dfm.addColumn("Fecha");
            CallableStatement cst = cn.prepareCall("{call VentasSucursal(?,?,?)}");
            cst.setInt(1, main.getID_Sucursal(cbSucursal));
            cst.setDate(2, fecha_inicio);
            cst.setDate(3, fecha_fin);
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("folio"), rs.getInt("idSucursal"), rs.getInt("subtotal"), rs.getInt("iva"), rs.getInt("total"), rs.getDate("fecha")});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 6);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Reporte4(JTable table, java.sql.Date fecha) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Folio");
            dfm.addColumn("ID Sucursal");
            dfm.addColumn("Subtotal");
            dfm.addColumn("IVA");
            dfm.addColumn("Total");
            dfm.addColumn("Fecha");
            CallableStatement cst = cn.prepareCall("{call VentasGeneral(?)}");
            cst.setDate(1, fecha);
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("folio"), rs.getInt("idSucursal"), rs.getInt("subtotal"), rs.getInt("iva"), rs.getInt("total"), rs.getDate("fecha")});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 6);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
