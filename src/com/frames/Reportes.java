package com.frames;

import com.classes.MyConnection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class Reportes {
    
    JFreeChart grafica;
    DefaultCategoryDataset datos = new DefaultCategoryDataset();
    MainUI main = new MainUI();
    public void Reporte1(JTable table) {
            try {
                Connection cn = MyConnection.getConnection();
                DefaultTableModel dfm = new DefaultTableModel();
                dfm.addColumn("ID Producto");
                dfm.addColumn("Nombre");
                dfm.addColumn("Vendidos");
                assert cn != null;
                CallableStatement cst = cn.prepareCall("{call ProductosMasVendidos}");
                ResultSet rs = cst.executeQuery();
                // Llenar Tabla
                while (rs.next()) {
                    dfm.addRow(new Object[]{rs.getInt("idProducto"), rs.getString("nombreProducto"), rs.getInt("vendidos")});
                }
                table.setModel(dfm);
                main.DisenarTabla(table, 3);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            // Llenar Grafico
            try {
                datos.clear();
                for(int i = 0; i < table.getRowCount(); i++){
                    datos.addValue(Integer.parseInt(table.getValueAt(i, 2).toString()), table.getValueAt(i,1).toString(), "ID: " + table.getValueAt(i, 0).toString());
                }
                grafica = null;
                grafica = ChartFactory.createBarChart("Productos más Vendidos", "Productos", "Vendidos", datos, PlotOrientation.VERTICAL, true, true, false);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e);
            }             
       
    }
    public void Reporte2(JTable table) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("idSucursal");
            dfm.addColumn("Sucursal");
            dfm.addColumn("Ventas");
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call SucursalesMasVentas}");
            ResultSet rs = cst.executeQuery();
            // Llenar Tabla
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idSucursal"), rs.getString("Nombre"), rs.getInt("Ventas")});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 3);
            // Llenar Grafico
            try {
                datos.clear();
                for(int i = 0; i < table.getRowCount(); i++){
                    datos.addValue(Integer.parseInt(table.getValueAt(i, 2).toString()), table.getValueAt(i,1).toString(), "ID: " + table.getValueAt(i, 0).toString());
                }
                grafica = null;
                grafica = ChartFactory.createBarChart("Sucursales con más Ventas", "Sucursales", "Ventas", datos, PlotOrientation.VERTICAL, true, true, false);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Reporte3(JTable table, int fecha_inicio, String mes) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Folio");
            //dfm.addColumn("Producto");
            dfm.addColumn("Sucursal");
            dfm.addColumn("Usuario");
            dfm.addColumn("Total");
            dfm.addColumn("Mes");
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call GananciasTotales(?)}");
            cst.setInt(1, fecha_inicio + 1);
            ResultSet rs = cst.executeQuery();
            // Llenar Tabla
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("Folio"), rs.getString("Sucursal"), rs.getString("Usuario"), rs.getInt("Total"), mes});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 5);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Reporte4(JTable table) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Mes");
            dfm.addColumn("Ganancias Totales");
            CallableStatement cst = cn.prepareCall("{call GananciasMes}");
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getString("Mes"), rs.getInt("Ganancias Totales")});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 2);
            // Llenar Grafico
            try {
                datos.clear();
                for(int i = 0; i < table.getRowCount(); i++){
                    datos.addValue(Integer.parseInt(table.getValueAt(i, 1).toString()), table.getValueAt(i,0).toString(),table.getValueAt(i, 0).toString());
                }
                grafica = null;
                grafica = ChartFactory.createBarChart("Ganancias por Mes", "Mes", "Ganancias", datos, PlotOrientation.VERTICAL, true, true, false);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    
    public void Reporte5(JTable table) {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Año");
            dfm.addColumn("Ganancias Totales");
            CallableStatement cst = cn.prepareCall("{call GananciasAño}");
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getString("Año"), rs.getInt("Ganancias Totales")});
            }
            table.setModel(dfm);
            main.DisenarTabla(table, 2);
            // Llenar Grafico
            try {
                datos.clear();
                for(int i = 0; i < table.getRowCount(); i++){
                    datos.addValue(Integer.parseInt(table.getValueAt(i, 1).toString()), table.getValueAt(i,0).toString(),table.getValueAt(i, 0).toString());
                }
                grafica = null;
                grafica = ChartFactory.createBarChart("Ganancias por Año", "Año", "Ganancias", datos, PlotOrientation.VERTICAL, true, true, false);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } 
}
