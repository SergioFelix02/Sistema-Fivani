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

        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        barID_Venta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Ventas = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtID_Venta = new javax.swing.JTextField();
        lblID_Venta = new javax.swing.JLabel();
        barCantidad = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtID_Producto = new javax.swing.JTextField();
        lblID_Producto = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        barTotal = new javax.swing.JPanel();
        barID_Producto = new javax.swing.JPanel();

        setTitle("Ventas");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(515, 423));
        setResizable(false);

        btnAgregar.setBackground(new java.awt.Color(0, 90, 195));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setEnabled(false);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nueva");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

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

        btnCancelar.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 90, 195));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Cantidad");

        txtID_Venta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Venta.setBorder(null);

        lblID_Venta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Venta.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Venta.setText("ID Venta");

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

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.setEnabled(false);

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setEnabled(false);

        txtID_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Producto.setBorder(null);
        txtID_Producto.setEnabled(false);

        lblID_Producto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto.setText("ID Producto");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal.setText("Total");

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

        barID_Producto.setBackground(new java.awt.Color(204, 204, 204));
        barID_Producto.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_ProductoLayout = new javax.swing.GroupLayout(barID_Producto);
        barID_Producto.setLayout(barID_ProductoLayout);
        barID_ProductoLayout.setHorizontalGroup(
            barID_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        barID_ProductoLayout.setVerticalGroup(
            barID_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID_Producto)
                                    .addComponent(lblID_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(barID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblID_Venta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(barID_Venta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtID_Venta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnEditar))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnCancelar))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID_Venta)
                                .addGap(8, 8, 8)
                                .addComponent(txtID_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(barID_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID_Producto)
                                .addGap(8, 8, 8)
                                .addComponent(txtID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(barID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword)
                                .addGap(5, 5, 5)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
            ID_Producto = Integer.valueOf(txtID_Producto.getText());
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText() == "Nueva") {
            btnNuevo.setText("Confirmar");
            btnAgregar.setText("Agregar");
            btnEditar.setText("Editar");
            txtID_Venta.setEnabled(false);
            txtTotal.setEnabled(false);
            txtID_Producto.setEnabled(true);
            txtCantidad.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnEditar.setEnabled(false);
            barID_Producto.setBackground(new java.awt.Color(0, 90, 150));
            barCantidad.setBackground(new java.awt.Color(0, 90, 150));
            barTotal.setBackground(new java.awt.Color(187, 187, 187));
            barID_Venta.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxt();
            InsertarVenta();
            Buscar(id);
        } else {
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            btnNuevo.setText("Nueva");
            txtID_Venta.setEnabled(true);
            txtID_Producto.setEnabled(false);
            txtCantidad.setEnabled(false);
            btnEditar.setEnabled(true);
            btnCancelar.setEnabled(true);
            barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
            barCantidad.setBackground(new java.awt.Color(187, 187, 187));
            barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
            vaciarTxt();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String txtid = txtID_Venta.getText().trim();
        String txtotal = txtTotal.getText().trim();
        if (btnEditar.getText() == "Editar") {
            if (txtid.equals("")) {
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                btnEditar.setText("Confirmar");
                btnAgregar.setText("Agregar");
                btnNuevo.setText("Nueva");
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
                btnEditar.setText("Editar");
                txtID_Venta.setEnabled(true);
                txtID_Producto.setEnabled(false);
                txtCantidad.setEnabled(false);
                txtTotal.setEnabled(false);
                barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
                barCantidad.setBackground(new java.awt.Color(187, 187, 187));
                barTotal.setBackground(new java.awt.Color(187, 187, 187));
                barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        InsertarDetalleVenta();
        txtID_Producto.setText("");
        txtCantidad.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        // Reset Form
        txtID_Venta.requestFocus();
        btnAgregar.setText("Agregar");
        btnNuevo.setText("Nueva");
        btnEditar.setText("Editar");
        txtID_Venta.setEnabled(true);
        txtID_Producto.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtTotal.setEnabled(false);
        barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
        barCantidad.setBackground(new java.awt.Color(187, 187, 187));
        barTotal.setBackground(new java.awt.Color(187, 187, 187));
        barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
        vaciarTxt();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        btnNuevo.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        btnNuevo.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnCancelarMouseExited

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
        txtID_Producto.setText("");
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
        int idP = Integer.valueOf(txtID_Producto.getText());
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
    private javax.swing.JPanel barID_Producto;
    private javax.swing.JPanel barID_Venta;
    private javax.swing.JPanel barTotal;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID_Producto;
    private javax.swing.JLabel lblID_Venta;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtID_Producto;
    private javax.swing.JTextField txtID_Venta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
