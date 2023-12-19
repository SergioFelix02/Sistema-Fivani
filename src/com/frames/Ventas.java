package com.frames;

import com.classes.MyConnection;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Ventas {
    MainUI main = new MainUI();
    public void Insertar(int idS, int idU, int iva) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call agregarVenta(?,?,?,?,?)}");
            cst.setInt(1, idS);
            cst.setInt(2, idU);
            cst.setInt(3, 0); //Subtotal
            cst.setInt(4, iva);
            cst.setInt(5, 0); //Total
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void InsertarDetalleVenta(int idV, int idP, int precio, int cantidad) {
        int subtotal = cantidad * precio;
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call agregarDetalleVenta(?,?,?,?,?,?)}");
            cst.setInt(1, idV);
            cst.setInt(2, idP);
            cst.setInt(3, precio);
            cst.setInt(4, cantidad);
            cst.setInt(5, subtotal);
            cst.setInt(6, 0);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call calcularTotalVenta(?)}");
            cst.setInt(1, idV);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Modificar(int id, int subtotal, int iva, int total) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
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
            dfm.addColumn("Sucursal");
            dfm.addColumn("Usuario");
            dfm.addColumn("Subtotal");
            dfm.addColumn("IVA");
            dfm.addColumn("Total");
            dfm.addColumn("Fecha");
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select * from Ventas");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //Obtener Nombre Sucursal
                pst = cn.prepareStatement("select nombre from Sucursales where idSucursal = ?");
                int idS = rs.getInt("idSucursal");
                pst.setInt(1, idS);
                ResultSet rsS = pst.executeQuery();
                String NombreS = "";
                if (rsS.next()) {
                    NombreS = rsS.getString("nombre");
                }
                //Obtener Nombre Usuario
                pst = cn.prepareStatement("select usuario from Usuarios where idUsuario = ?");
                int idU = rs.getInt("idUsuario");
                pst.setInt(1, idU);
                ResultSet rsU = pst.executeQuery();
                String NombreU = "";
                if (rsU.next()) {
                    NombreU = rsU.getString("usuario");
                }
                //Crear Columna
                dfm.addRow(new Object[]{rs.getInt("folio"), NombreS, NombreU, "$" + (rs.getInt("subtotal")), (rs.getInt("iva")) + "%", "$" + (rs.getInt("total")), rs.getDate("fecha")});
            }
            table.setModel(dfm);
            
            if (main != null){
                main.DisenarTabla(table, 7);
            }
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
    public void Buscar(int id, JTextField txtID_Venta, JTextField txtTotal, JTextField txtSubtotal) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select * from Ventas where folio = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("folio");
                int Total = rs.getInt("total");
                int subtotal = rs.getInt("subtotal");
                txtID_Venta.setText(String.valueOf(id));
                txtTotal.setText(String.valueOf(Total));
                txtSubtotal.setText(String.valueOf(subtotal));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Venta no encontrada");
        }
    }
    public int getPrecio(int id, JTextField txtID_Venta, JTextField txtTotal, JTextField txtSubtotal) {
        int precioProd = 0;
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select top 1 * from Ventas order by folio desc");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int folio = rs.getInt("folio");
                int subtotal = rs.getInt("subtotal");
                int Total = rs.getInt("total");
                txtID_Venta.setText(String.valueOf(folio));
                txtTotal.setText(String.valueOf(Total));
                txtSubtotal.setText(String.valueOf(subtotal));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                precioProd = rs.getInt("precioProducto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecciona un Producto");
        }
        return precioProd;
    }
}