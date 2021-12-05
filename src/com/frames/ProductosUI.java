package com.frames;

import com.classes.MyConnection;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ProductosUI extends javax.swing.JFrame {

    ResultSet rs;
    Connection cn = MyConnection.getConnection();
    public JOptionPane msg = new JOptionPane("Operacion realizada");
    public JDialog dialog = msg.createDialog("Mensaje");
    String nombre = "", descripcion = "";
    int precio = 0, cantidad = 0, id = 0;

    public ProductosUI() {
        initComponents();
        this.setBackground(new Color(255, 255, 255, 100));
        txtID_Producto.requestFocus();
        CrearTabla();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lnlNombre = new javax.swing.JLabel();
        btnCancelarProducto = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        btnEditarProducto = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        barCantidad = new javax.swing.JPanel();
        barPrecio = new javax.swing.JPanel();
        txtID_Producto = new javax.swing.JTextField();
        lblID_Producto = new javax.swing.JLabel();
        barDescripcion = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        barNombre = new javax.swing.JPanel();
        btnEliminarProducto = new javax.swing.JButton();
        btnNuevoProducto = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        barID_Producto = new javax.swing.JPanel();

        setTitle("Productos");
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnlNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lnlNombre.setForeground(new java.awt.Color(153, 153, 153));
        lnlNombre.setText("Nombre");
        getContentPane().add(lnlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        btnCancelarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarProducto.setText("Cancelar");
        btnCancelarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarProductoMouseExited(evt);
            }
        });
        btnCancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 120, 30));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.setEnabled(false);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 127, -1));

        btnEditarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProducto.setText("Editar");
        btnEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarProductoMouseExited(evt);
            }
        });
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 120, 30));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.setEnabled(false);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 112, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, -1));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        lblDescripcion.setText("Descripcion");
        getContentPane().add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 115, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(153, 153, 153));
        lblPrecio.setText("Precio");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 112, -1));

        barCantidad.setBackground(new java.awt.Color(204, 204, 204));
        barCantidad.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barCantidadLayout = new javax.swing.GroupLayout(barCantidad);
        barCantidad.setLayout(barCantidadLayout);
        barCantidadLayout.setHorizontalGroup(
            barCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        barCantidadLayout.setVerticalGroup(
            barCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 100, 2));

        barPrecio.setBackground(new java.awt.Color(204, 204, 204));
        barPrecio.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barPrecioLayout = new javax.swing.GroupLayout(barPrecio);
        barPrecio.setLayout(barPrecioLayout);
        barPrecioLayout.setHorizontalGroup(
            barPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        barPrecioLayout.setVerticalGroup(
            barPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 112, 2));

        txtID_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Producto.setBorder(null);
        getContentPane().add(txtID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        lblID_Producto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto.setText("ID");
        getContentPane().add(lblID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        barDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        barDescripcion.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barDescripcionLayout = new javax.swing.GroupLayout(barDescripcion);
        barDescripcion.setLayout(barDescripcionLayout);
        barDescripcionLayout.setHorizontalGroup(
            barDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        barDescripcionLayout.setVerticalGroup(
            barDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 127, 2));

        Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.setViewportView(Tabla_Productos);

        getContentPane().add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 470, 230));

        barNombre.setBackground(new java.awt.Color(204, 204, 204));
        barNombre.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barNombreLayout = new javax.swing.GroupLayout(barNombre);
        barNombre.setLayout(barNombreLayout);
        barNombreLayout.setHorizontalGroup(
            barNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        barNombreLayout.setVerticalGroup(
            barNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 2));

        btnEliminarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseExited(evt);
            }
        });
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 120, 30));

        btnNuevoProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevoProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setText("Nuevo");
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoProductoMouseExited(evt);
            }
        });
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 120, 30));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.setEnabled(false);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 100, -1));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidad.setText("Cantidad");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 100, -1));

        barID_Producto.setBackground(new java.awt.Color(0, 90, 195));
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

        getContentPane().add(barID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 2));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Buscar(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idProducto");
                nombre = rs.getString("nombreProducto");
                descripcion = rs.getString("descripcionProducto");
                precio = rs.getInt("precioProducto");
                cantidad = rs.getInt("cantidadProducto");
                txtNombre.setText(nombre);
                txtDescripcion.setText(descripcion);
                txtPrecio.setText(String.valueOf(precio));
                txtCantidad.setText(String.valueOf(cantidad));
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        String txtnombre = txtNombre.getText();
        String txtdescripcion = txtDescripcion.getText();
        String txtprecio = txtPrecio.getText().trim();
        String txtcantidad = txtCantidad.getText().trim();
        if (btnNuevoProducto.getText() == "Nuevo") {
            btnNuevoProducto.setText("Confirmar");
            btnEliminarProducto.setText("Eliminar");
            btnEditarProducto.setText("Editar");
            txtNombre.requestFocus();
            txtNombre.setEnabled(true);
            txtDescripcion.setEnabled(true);
            txtPrecio.setEnabled(true);
            txtCantidad.setEnabled(true);
            txtID_Producto.setEnabled(false);
            barNombre.setBackground(new java.awt.Color(0, 90, 150));
            barDescripcion.setBackground(new java.awt.Color(0, 90, 150));
            barCantidad.setBackground(new java.awt.Color(0, 90, 150));
            barPrecio.setBackground(new java.awt.Color(0, 90, 150));
            barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxt();
        } else {
            if (txtnombre.equals("") || txtdescripcion.equals("") || txtprecio.equals("") || txtcantidad.equals("")) {
                dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                Insertar();
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                btnNuevoProducto.setText("Nuevo");
                txtNombre.setEnabled(false);
                txtDescripcion.setEnabled(false);
                txtPrecio.setEnabled(false);
                txtCantidad.setEnabled(false);
                txtID_Producto.setEnabled(true);
                barNombre.setBackground(new java.awt.Color(187, 187, 187));
                barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
                barCantidad.setBackground(new java.awt.Color(187, 187, 187));
                barPrecio.setBackground(new java.awt.Color(187, 187, 187));
                barID_Producto.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        String txtid = txtID_Producto.getText().trim();
        if (btnEditarProducto.getText() == "Editar") {
            if (txtid.equals("")) {
                dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                id = Integer.parseInt(txtid);
                Buscar(id);
                btnEditarProducto.setText("Confirmar");
                btnEliminarProducto.setText("Eliminar");
                btnNuevoProducto.setText("Nuevo");
                txtNombre.setEnabled(true);
                txtDescripcion.setEnabled(true);
                txtPrecio.setEnabled(true);
                txtCantidad.setEnabled(true);
                txtID_Producto.setEnabled(false);
                barNombre.setBackground(new java.awt.Color(0, 90, 150));
                barDescripcion.setBackground(new java.awt.Color(0, 90, 150));
                barCantidad.setBackground(new java.awt.Color(0, 90, 150));
                barPrecio.setBackground(new java.awt.Color(0, 90, 150));
                barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
            }

        } else {
            String txtnombre = txtNombre.getText();
            String txtdescripcion = txtDescripcion.getText();
            String txtprecio = txtPrecio.getText().trim();
            String txtcantidad = txtCantidad.getText().trim();
            if (txtnombre.equals("") || txtdescripcion.equals("") || txtprecio.equals("") || txtcantidad.equals("")) {
                dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                precio = Integer.parseInt(txtprecio);
                cantidad = Integer.parseInt(txtcantidad);
                nombre = txtNombre.getText().trim();
                descripcion = txtDescripcion.getText().trim();
                Modificar(id, nombre, descripcion, precio, cantidad);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                btnEditarProducto.setText("Editar");
                txtNombre.setEnabled(false);
                txtDescripcion.setEnabled(false);
                txtPrecio.setEnabled(false);
                txtCantidad.setEnabled(false);
                txtID_Producto.setEnabled(true);
                barNombre.setBackground(new java.awt.Color(187, 187, 187));
                barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
                barCantidad.setBackground(new java.awt.Color(187, 187, 187));
                barPrecio.setBackground(new java.awt.Color(187, 187, 187));
                barID_Producto.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        String txtid = txtID_Producto.getText().trim();
        if (btnEliminarProducto.getText() == "Eliminar") {
            if (txtid.equals("")) {
                dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                id = Integer.parseInt(txtid);
                Buscar(id);
                btnEliminarProducto.setText("Confirmar");
                btnNuevoProducto.setText("Nuevo");
                btnEditarProducto.setText("Editar");
                txtID_Producto.setEnabled(false);
                barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            int estatus = 0;
            Desactivar(id, estatus);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            btnEliminarProducto.setText("Eliminar");
            txtNombre.setEnabled(false);
            txtDescripcion.setEnabled(false);
            txtPrecio.setEnabled(false);
            txtCantidad.setEnabled(false);
            txtID_Producto.setEnabled(true);
            barNombre.setBackground(new java.awt.Color(187, 187, 187));
            barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
            barCantidad.setBackground(new java.awt.Color(187, 187, 187));
            barPrecio.setBackground(new java.awt.Color(187, 187, 187));
            barID_Producto.setBackground(new java.awt.Color(0, 90, 150));
            vaciarTxt();
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnCancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProductoActionPerformed
        this.setVisible(false);
        // Reset Form
        txtID_Producto.requestFocus();
        btnEliminarProducto.setText("Eliminar");
        btnNuevoProducto.setText("Nuevo");
        btnEditarProducto.setText("Editar");
        txtNombre.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtID_Producto.setEnabled(true);
        barNombre.setBackground(new java.awt.Color(187, 187, 187));
        barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
        barCantidad.setBackground(new java.awt.Color(187, 187, 187));
        barPrecio.setBackground(new java.awt.Color(187, 187, 187));
        barID_Producto.setBackground(new java.awt.Color(0, 90, 150));
        vaciarTxt();
    }//GEN-LAST:event_btnCancelarProductoActionPerformed

    private void btnEliminarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseEntered
        btnEliminarProducto.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnEliminarProductoMouseEntered

    private void btnEliminarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseExited
        btnEliminarProducto.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnEliminarProductoMouseExited

    private void btnNuevoProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProductoMouseEntered
        btnNuevoProducto.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnNuevoProductoMouseEntered

    private void btnNuevoProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProductoMouseExited
        btnNuevoProducto.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnNuevoProductoMouseExited

    private void btnEditarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProductoMouseEntered
        btnEditarProducto.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnEditarProductoMouseEntered

    private void btnEditarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProductoMouseExited
        btnEditarProducto.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnEditarProductoMouseExited

    private void btnCancelarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarProductoMouseEntered
        btnCancelarProducto.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnCancelarProductoMouseEntered

    private void btnCancelarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarProductoMouseExited
        btnCancelarProducto.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnCancelarProductoMouseExited

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
            java.util.logging.Logger.getLogger(ProductosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosUI().setVisible(true);
            }
        });
    }

    public void vaciarTxt() {
        txtID_Producto.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
    }

    public void Insertar() {
        String nombre, descripcion;
        int precio, cantidad, estatus;
        nombre = String.valueOf(txtNombre.getText());
        descripcion = String.valueOf(txtDescripcion.getText());
        precio = Integer.parseInt(txtPrecio.getText());
        cantidad = Integer.parseInt(txtCantidad.getText());
        estatus = 1;
        try {
            CallableStatement cst = cn.prepareCall("{call agregarProducto(?,?,?,?,?)}");
            cst.setString(1, nombre);
            cst.setString(2, descripcion);
            cst.setInt(3, precio);
            cst.setInt(4, cantidad);
            cst.setInt(5, estatus);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        CrearTabla();
    }

    public void Desactivar(int id, int estatus) {
        try {
            CallableStatement cst = cn.prepareCall("{call estatusProducto(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, estatus);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        CrearTabla();
    }

    public void Modificar(int id, String nombre, String descripcion, int precio, int cantidad) {
        try {
            CallableStatement cst = cn.prepareCall("{call modificarProducto(?,?,?,?,?)}");
            cst.setInt(1, id);
            cst.setString(2, nombre);
            cst.setString(3, descripcion);
            cst.setInt(4, precio);
            cst.setInt(5, cantidad);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        CrearTabla();
    }

    public void CrearTabla() {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("ID");
            dfm.addColumn("Nombre");
            dfm.addColumn("Descripcion");
            dfm.addColumn("Precio");
            dfm.addColumn("Cantidad");
            //dfm.addColumn("Estatus");
            PreparedStatement pst = cn.prepareStatement("select * from Productos where estatus = 1");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idProducto"), rs.getString("nombreProducto"), rs.getString("descripcionProducto"), (rs.getInt("precioProducto")), (rs.getInt("cantidadProducto"))});
                //, rs.getInt("estatus")});
            }
            Tabla_Productos.setModel(dfm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JPanel barCantidad;
    private javax.swing.JPanel barDescripcion;
    private javax.swing.JPanel barID_Producto;
    private javax.swing.JPanel barNombre;
    private javax.swing.JPanel barPrecio;
    private javax.swing.JButton btnCancelarProducto;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID_Producto;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lnlNombre;
    private javax.swing.JScrollPane table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID_Producto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
