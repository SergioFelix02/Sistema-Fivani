package com.frames;

import com.classes.ButtonRenderer;
import com.classes.MyCellRenderer;
import com.classes.MyConnection;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Productos {
    MainUI main = new MainUI();
    public void Insertar(String nombre, String descripcion, int precio, int cantidad) {
        int estatus = 1;
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
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
    public void Modificar(int id, String nombre, String descripcion, int precio, int cantidad) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
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
        try {
            int estatus = 0;
            if (cantidad > 0) {
                estatus = 1;
            }
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call estatusProducto(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, estatus);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Vendido(int id, int cantidad) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            CallableStatement cst = cn.prepareCall("{call venderProducto(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, cantidad);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select cantidadProducto from Productos where idProducto = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            int cant = 0;
            while (rs.next()) {
                cant = rs.getInt("cantidadProducto");
            }
            if (cant == 0) {
                Desactivar(id);
            }
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
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
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
            CallableStatement cst = cn.prepareCall("{call estatusProducto(?,?)}");
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
                dfm.addColumn("Descripcion");
                dfm.addColumn("Precio");
                dfm.addColumn("Cantidad");
                dfm.addColumn("Estatus");
                //dfm.addColumn("Acciones");
                assert cn != null;
                PreparedStatement pst = cn.prepareStatement("select * from Productos");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    dfm.addRow(new Object[]{rs.getInt("idProducto"), rs.getString("nombreProducto"), rs.getString("descripcionProducto"), "$" + (rs.getInt("precioProducto")), (rs.getInt("cantidadProducto")), rs.getInt("estatus")});
                }
                table.setModel(dfm);
                if (main != null){
                    main.DisenarTabla(table, 6);
                }
                //Poner en rojo los inactivos
                for (int i = 0; i < table.getColumnCount(); i++) {
                    //System.out.println(table.getColumnCount());
                    table.getColumnModel().getColumn(i).setCellRenderer(new MyCellRenderer());
                }
            } else {
                dfm.addColumn("ID");
                dfm.addColumn("Nombre");
                dfm.addColumn("Descripcion");
                dfm.addColumn("Precio");
                dfm.addColumn("Cantidad");
                //dfm.addColumn("Acciones");
                assert cn != null;
                PreparedStatement pst = cn.prepareStatement("select * from Productos where estatus = 1");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    dfm.addRow(new Object[]{rs.getInt("idProducto"), rs.getString("nombreProducto"), rs.getString("descripcionProducto"), "$" + (rs.getInt("precioProducto")), (rs.getInt("cantidadProducto"))});
                }
                table.setModel(dfm);
                if (main != null){
                    main.DisenarTabla(table, 5);
                }
            }
            //table.getColumnModel().getColumn(dfm.getColumnCount() - 1).setCellRenderer(new ButtonRenderer());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(255, 255, 255));
        JButton button1 = new JButton();
        JButton button2 = new JButton("2");
        
        button1.setBackground(new java.awt.Color(0, 90, 195));
        button1.setSize(20, 20);
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        button1.setIcon(scaledIcon);
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //btnNuevoPActionPerformed(evt);
            }
        });
        
        button2.setBackground(new java.awt.Color(0, 90, 195));
        button2.setSize(20, 20);
        ImageIcon originalIcon2 = new ImageIcon(getClass().getResource("/com/images/delete_32px.png"));
        Image scaledImage2 = originalIcon2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
        button2.setIcon(scaledIcon2);
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //btnNuevoPActionPerformed(evt);
            }
        });
        panel.add(button1);
        panel.add(button2);
        return panel;
    }
    public void vaciarTxt(JTextField id, JTextField nombre, JTextField descripcion, JTextField precio, JTextField cantidad) {
        id.setText("");
        nombre.setText("");
        descripcion.setText("");
        precio.setText("");
        cantidad.setText("");
    }
    public void Buscar(int id, JTextField txtID_Producto, JTextField txtNombre, JTextField txtDescripcion, JTextField txtPrecio, JTextField txtCantidad) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idProducto");
                String nombre = rs.getString("nombreProducto");
                String descripcion = rs.getString("descripcionProducto");
                int precio = rs.getInt("precioProducto");
                int cantidad = rs.getInt("cantidadProducto");
                txtID_Producto.setText(String.valueOf(id));
                txtNombre.setText(nombre);
                txtDescripcion.setText(descripcion);
                txtPrecio.setText(String.valueOf(precio));
                txtCantidad.setText(String.valueOf(cantidad));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}