package com.frames;

import com.classes.MyConnection;
import java.awt.Color;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentasUI extends javax.swing.JFrame {

    ResultSet rs;
    Connection cn = MyConnection.getConnection();
    public JOptionPane msg = new JOptionPane("Operacion realizada");
    public JDialog dialog = msg.createDialog("Mensaje");
    int Cantidad = 0;
    int Total = 0;
    int ID_Producto = 0;
    int id = 0;
    int precioProd = 0;
    String temp = "";

    public VentasUI() {
        initComponents();
        this.setBackground(new Color(255, 255, 255, 100));
        txtID_Venta.requestFocus();
        CrearTabla();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarProducto = new javax.swing.JButton();
        btnNuevoVenta = new javax.swing.JButton();
        barID_Venta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Ventas = new javax.swing.JTable();
        btnCancelarVenta = new javax.swing.JButton();
        btnEditarVenta = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtID_Venta = new javax.swing.JTextField();
        lblID_Venta = new javax.swing.JLabel();
        barCantidad = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtID_Producto2 = new javax.swing.JTextField();
        lblID_Producto2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        barTotal = new javax.swing.JPanel();
        barID_Producto2 = new javax.swing.JPanel();

        setTitle("Ventas");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(515, 423));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnAgregarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProducto.setEnabled(false);
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseExited(evt);
            }
        });
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 112, 120, -1));

        btnNuevoVenta.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevoVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoVenta.setText("Nueva");
        btnNuevoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoVentaMouseExited(evt);
            }
        });
        btnNuevoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 61, 120, -1));

        barID_Venta.setBackground(new java.awt.Color(0, 90, 195));
        barID_Venta.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_VentaLayout = new javax.swing.GroupLayout(barID_Venta);
        barID_Venta.setLayout(barID_VentaLayout);
        barID_VentaLayout.setHorizontalGroup(
            barID_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        barID_VentaLayout.setVerticalGroup(
            barID_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 84, 100, 2));

        Tabla_Ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Ventas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 174, 486, 290));

        btnCancelarVenta.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarVentaMouseExited(evt);
            }
        });
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 112, 120, -1));

        btnEditarVenta.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarVenta.setText("Editar");
        btnEditarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarVentaMouseExited(evt);
            }
        });
        btnEditarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 61, 120, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Cantidad");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 100, 100, -1));

        txtID_Venta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Venta.setBorder(null);
        getContentPane().add(txtID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 54, 100, -1));

        lblID_Venta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Venta.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Venta.setText("ID Venta");
        getContentPane().add(lblID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 24, 100, -1));

        barCantidad.setBackground(new java.awt.Color(204, 204, 204));
        barCantidad.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barCantidadLayout = new javax.swing.GroupLayout(barCantidad);
        barCantidad.setLayout(barCantidadLayout);
        barCantidadLayout.setHorizontalGroup(
            barCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        barCantidadLayout.setVerticalGroup(
            barCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 158, 110, 2));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.setEnabled(false);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 127, 110, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setEnabled(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 52, 110, -1));

        txtID_Producto2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Producto2.setBorder(null);
        txtID_Producto2.setEnabled(false);
        getContentPane().add(txtID_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, 100, -1));

        lblID_Producto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto2.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto2.setText("ID Producto");
        getContentPane().add(lblID_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 98, 100, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal.setText("Total");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 24, 100, -1));

        barTotal.setBackground(new java.awt.Color(204, 204, 204));
        barTotal.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barTotalLayout = new javax.swing.GroupLayout(barTotal);
        barTotal.setLayout(barTotalLayout);
        barTotalLayout.setHorizontalGroup(
            barTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        barTotalLayout.setVerticalGroup(
            barTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 83, 110, 2));

        barID_Producto2.setBackground(new java.awt.Color(204, 204, 204));
        barID_Producto2.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_Producto2Layout = new javax.swing.GroupLayout(barID_Producto2);
        barID_Producto2.setLayout(barID_Producto2Layout);
        barID_Producto2Layout.setHorizontalGroup(
            barID_Producto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        barID_Producto2Layout.setVerticalGroup(
            barID_Producto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barID_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 158, 100, 2));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Buscar(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select top 1 * from Ventas order by idVenta desc");
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idVenta");
                Total = rs.getInt("total");
                txtID_Venta.setText(String.valueOf(id));
                txtTotal.setText(String.valueOf(Total));
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        try {
            ID_Producto = Integer.valueOf(txtID_Producto2.getText());
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
            pst.setInt(1, ID_Producto);
            rs = pst.executeQuery();
            if (rs.next()) {
                precioProd = rs.getInt("precioProducto");
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnNuevoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoVentaActionPerformed
        if (btnNuevoVenta.getText() == "Nueva") {
            btnNuevoVenta.setText("Confirmar");
            btnAgregarProducto.setText("Agregar");
            btnEditarVenta.setText("Editar");
            txtID_Venta.setEnabled(false);
            txtTotal.setEnabled(false);
            txtID_Producto2.setEnabled(true);
            txtCantidad.setEnabled(true);
            btnAgregarProducto.setEnabled(true);
            btnEditarVenta.setEnabled(false);
            barID_Producto2.setBackground(new java.awt.Color(0, 90, 150));
            barCantidad.setBackground(new java.awt.Color(0, 90, 150));
            barTotal.setBackground(new java.awt.Color(187, 187, 187));
            barID_Venta.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxt();
            InsertarVenta();
            Buscar(id);
        } else {
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            btnNuevoVenta.setText("Nueva");
            txtID_Venta.setEnabled(true);
            txtID_Producto2.setEnabled(false);
            txtCantidad.setEnabled(false);
            btnEditarVenta.setEnabled(true);
            btnCancelarVenta.setEnabled(true);
            barID_Producto2.setBackground(new java.awt.Color(187, 187, 187));
            barCantidad.setBackground(new java.awt.Color(187, 187, 187));
            barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
            vaciarTxt();
        }
    }//GEN-LAST:event_btnNuevoVentaActionPerformed

    private void btnEditarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVentaActionPerformed
        String txtid = txtID_Venta.getText().trim();
        String txtotal = txtTotal.getText().trim();
        if (btnEditarVenta.getText() == "Editar") {
            if (txtid.equals("")) {
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                btnEditarVenta.setText("Confirmar");
                btnAgregarProducto.setText("Agregar");
                btnNuevoVenta.setText("Nueva");
                txtID_Venta.setEnabled(false);
                txtTotal.setEnabled(true);
                id = Integer.valueOf(txtID_Venta.getText());
                System.out.println(id);
                BuscarV(id);
                barTotal.setBackground(new java.awt.Color(0, 90, 150));
                barID_Venta.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            if (txtotal.equals("")) {
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                Total = Integer.valueOf(txtTotal.getText());
                Modificar(id, Total);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                btnEditarVenta.setText("Editar");
                txtID_Venta.setEnabled(true);
                txtID_Producto2.setEnabled(false);
                txtCantidad.setEnabled(false);
                txtTotal.setEnabled(false);
                barID_Producto2.setBackground(new java.awt.Color(187, 187, 187));
                barCantidad.setBackground(new java.awt.Color(187, 187, 187));
                barTotal.setBackground(new java.awt.Color(187, 187, 187));
                barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnEditarVentaActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        InsertarDetalleVenta();
        txtID_Producto2.setText("");
        txtCantidad.setText("");
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        this.setVisible(false);
        // Reset Form
        txtID_Venta.requestFocus();
        btnAgregarProducto.setText("Agregar");
        btnNuevoVenta.setText("Nueva");
        btnEditarVenta.setText("Editar");
        txtID_Venta.setEnabled(true);
        txtID_Producto2.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtTotal.setEnabled(false);
        barID_Producto2.setBackground(new java.awt.Color(187, 187, 187));
        barCantidad.setBackground(new java.awt.Color(187, 187, 187));
        barTotal.setBackground(new java.awt.Color(187, 187, 187));
        barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
        vaciarTxt();
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnNuevoVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoVentaMouseEntered
        btnNuevoVenta.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnNuevoVentaMouseEntered

    private void btnNuevoVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoVentaMouseExited
        btnNuevoVenta.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnNuevoVentaMouseExited

    private void btnEditarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarVentaMouseEntered
        btnEditarVenta.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnEditarVentaMouseEntered

    private void btnEditarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarVentaMouseExited
        btnEditarVenta.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnEditarVentaMouseExited

    private void btnAgregarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseEntered
        btnAgregarProducto.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnAgregarProductoMouseEntered

    private void btnAgregarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseExited
        btnAgregarProducto.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnAgregarProductoMouseExited

    private void btnCancelarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVentaMouseEntered
        btnCancelarVenta.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnCancelarVentaMouseEntered

    private void btnCancelarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVentaMouseExited
        btnCancelarVenta.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnCancelarVentaMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentasUI().setVisible(true);
            }
        });
    }

    public void vaciarTxt() {
        txtID_Venta.setText("");
        txtTotal.setText("");
        txtID_Producto2.setText("");
        txtCantidad.setText("");
    }

    public void InsertarVenta() {
        try {
            CallableStatement cst = cn.prepareCall("{call agregarVenta(?,?)}");
            cst.setInt(1, 1);
            cst.setInt(2, 0);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        CrearTabla();
    }

    public void InsertarDetalleVenta() {
        int idV = Integer.valueOf(txtID_Venta.getText());
        int idP = Integer.valueOf(txtID_Producto2.getText());
        int cantidad = Integer.valueOf(txtCantidad.getText());
        Buscar(idV);
        System.out.println(precioProd);
        int subtotal = cantidad * precioProd;
        try {
            CallableStatement cst = cn.prepareCall("{call agregarDetalleVenta(?,?,?,?)}");
            cst.setInt(1, idV);
            cst.setInt(2, idP);
            cst.setInt(3, cantidad);
            cst.setInt(4, subtotal);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        try {
            CallableStatement cst = cn.prepareCall("{call calcularTotalVenta(?)}");
            cst.setInt(1, idV);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        Buscar(idV);
        CrearTabla();
    }

    public void Modificar(int id, int total) {
        try {
            CallableStatement cst = cn.prepareCall("{call modificarVenta(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, total);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        CrearTabla();
    }

    public void BuscarV(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Ventas where idVenta = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idVenta");
                Total = rs.getInt("total");
                txtID_Venta.setText(String.valueOf(id));
                txtTotal.setText(String.valueOf(Total));
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }

    public void CrearTabla() {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("ID Venta");
            dfm.addColumn("ID Usuario");
            dfm.addColumn("Fecha");
            dfm.addColumn("Total");
            PreparedStatement pst = cn.prepareStatement("select * from Ventas");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idVenta"), rs.getInt("idUsuario"), rs.getDate("fecha"), (rs.getInt("total"))});
            }
            Tabla_Ventas.setModel(dfm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Ventas;
    private javax.swing.JPanel barCantidad;
    private javax.swing.JPanel barID_Producto2;
    private javax.swing.JPanel barID_Venta;
    private javax.swing.JPanel barTotal;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnEditarVenta;
    private javax.swing.JButton btnNuevoVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID_Producto2;
    private javax.swing.JLabel lblID_Venta;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtID_Producto2;
    private javax.swing.JTextField txtID_Venta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
