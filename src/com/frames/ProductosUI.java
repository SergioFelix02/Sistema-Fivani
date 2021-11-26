package com.frames;

import com.classes.MyConnection;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;

public class ProductosUI extends javax.swing.JFrame {
    ResultSet rs;
    Connection cn = MyConnection.getConnection();
    public JOptionPane msg = new JOptionPane("Operacion realizada");
    public JDialog dialog = msg.createDialog("Mensaje");
    String nombre = "", descripcion = "";
    int precio = 0, cantidad = 0, id = 0;
    
    public ProductosUI() {
        initComponents();
        this.setBackground(new Color(255,255,255, 100));
        txtID.requestFocus();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lnlNombre = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        barCantidad = new javax.swing.JPanel();
        barPrecio = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        barDescripcion = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        barNombre = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        barID = new javax.swing.JPanel();

        setTitle("Productos");
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnlNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lnlNombre.setForeground(new java.awt.Color(153, 153, 153));
        lnlNombre.setText("Nombre");
        getContentPane().add(lnlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 120, 30));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.setEnabled(false);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 127, -1));

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
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 120, 30));

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

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setBorder(null);
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        lblID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(153, 153, 153));
        lblID.setText("ID");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.setViewportView(jTable1);

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

        btnEliminar.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 120, 30));

        btnNuevo.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
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
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 120, 30));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.setEnabled(false);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 100, -1));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidad.setText("Cantidad");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 100, -1));

        barID.setBackground(new java.awt.Color(0, 90, 195));
        barID.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barIDLayout = new javax.swing.GroupLayout(barID);
        barID.setLayout(barIDLayout);
        barIDLayout.setHorizontalGroup(
            barIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        barIDLayout.setVerticalGroup(
            barIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(barID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 2));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Buscar(int id){
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
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        String txtnombre = txtNombre.getText();
        String txtdescripcion = txtDescripcion.getText();
        String txtprecio = txtPrecio.getText().trim();
        String txtcantidad = txtCantidad.getText().trim();    
        if (btnNuevo.getText() == "Nuevo"){
            btnNuevo.setText("Confirmar");
            btnEliminar.setText("Eliminar");
            btnEditar.setText("Editar");
            txtNombre.requestFocus();
            txtNombre.setEnabled(true);
            txtDescripcion.setEnabled(true);
            txtPrecio.setEnabled(true);
            txtCantidad.setEnabled(true);
            txtID.setEnabled(false);
            barNombre.setBackground(new java.awt.Color(0, 90, 150));
            barDescripcion.setBackground(new java.awt.Color(0, 90, 150));
            barCantidad.setBackground(new java.awt.Color(0, 90, 150));
            barPrecio.setBackground(new java.awt.Color(0, 90, 150));
            barID.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxt();
        } else{
            if (txtnombre.equals("") || txtdescripcion.equals("") || txtprecio.equals("") || txtcantidad.equals("")){
            dialog.setAlwaysOnTop(true);
            //dialog.setVisible(true);
            } else{
                Insertar();
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                btnNuevo.setText("Nuevo");
                txtNombre.setEnabled(false);
                txtDescripcion.setEnabled(false);
                txtPrecio.setEnabled(false);
                txtCantidad.setEnabled(false);
                txtID.setEnabled(true);
                barNombre.setBackground(new java.awt.Color(187, 187, 187));
                barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
                barCantidad.setBackground(new java.awt.Color(187, 187, 187));
                barPrecio.setBackground(new java.awt.Color(187, 187, 187));
                barID.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String txtid = txtID.getText().trim();
        if (btnEditar.getText() == "Editar"){
            if (txtid.equals("")){
                dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else{
                id = Integer.parseInt(txtid);
                Buscar(id);
                btnEditar.setText("Confirmar");
                btnEliminar.setText("Eliminar");
                btnNuevo.setText("Nuevo");
                txtNombre.setEnabled(true);
                txtDescripcion.setEnabled(true);
                txtPrecio.setEnabled(true);
                txtCantidad.setEnabled(true);
                txtID.setEnabled(false);
                barNombre.setBackground(new java.awt.Color(0, 90, 150));
                barDescripcion.setBackground(new java.awt.Color(0, 90, 150));
                barCantidad.setBackground(new java.awt.Color(0, 90, 150));
                barPrecio.setBackground(new java.awt.Color(0, 90, 150));
                barID.setBackground(new java.awt.Color(187, 187, 187));
            }
        
        } else{
            String txtnombre = txtNombre.getText();
            String txtdescripcion = txtDescripcion.getText();
            String txtprecio = txtPrecio.getText().trim();
            String txtcantidad = txtCantidad.getText().trim();
            if (txtnombre.equals("") || txtdescripcion.equals("") || txtprecio.equals("") || txtcantidad.equals("")){
                dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else{
                precio = Integer.parseInt(txtprecio);
                cantidad = Integer.parseInt(txtcantidad);
                Modificar(id, nombre, descripcion, precio, cantidad);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                btnEditar.setText("Editar");
                txtNombre.setEnabled(false);
                txtDescripcion.setEnabled(false);
                txtPrecio.setEnabled(false);
                txtCantidad.setEnabled(false);
                txtID.setEnabled(true);
                barNombre.setBackground(new java.awt.Color(187, 187, 187));
                barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
                barCantidad.setBackground(new java.awt.Color(187, 187, 187));
                barPrecio.setBackground(new java.awt.Color(187, 187, 187));
                barID.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String txtid = txtID.getText().trim();
        if (btnEliminar.getText() == "Eliminar"){
            if (txtid.equals("")){
                dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else{
                id = Integer.parseInt(txtid);
                Buscar(id);
                btnEliminar.setText("Confirmar");
                btnNuevo.setText("Nuevo");
                btnEditar.setText("Editar");
                txtID.setEnabled(false);
                barID.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            int estatus = 0;
            Desactivar(id, estatus);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            btnEliminar.setText("Eliminar");
            txtNombre.setEnabled(false);
            txtDescripcion.setEnabled(false);
            txtPrecio.setEnabled(false);
            txtCantidad.setEnabled(false);
            txtID.setEnabled(true);
            barNombre.setBackground(new java.awt.Color(187, 187, 187));
            barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
            barCantidad.setBackground(new java.awt.Color(187, 187, 187));
            barPrecio.setBackground(new java.awt.Color(187, 187, 187));
            barID.setBackground(new java.awt.Color(0, 90, 150));
            vaciarTxt();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        // Reset Form
        txtID.requestFocus();
        btnEliminar.setText("Eliminar");
        btnNuevo.setText("Nuevo");
        btnEditar.setText("Editar");
        txtNombre.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtID.setEnabled(true);
        barNombre.setBackground(new java.awt.Color(187, 187, 187));
        barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
        barCantidad.setBackground(new java.awt.Color(187, 187, 187));
        barPrecio.setBackground(new java.awt.Color(187, 187, 187));
        barID.setBackground(new java.awt.Color(0, 90, 150));
        vaciarTxt();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnEliminarMouseExited

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
        txtID.setText("");
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
        //princ.CrearTabla();
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
        //princ.CrearTabla();
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
        //princ.CrearTabla();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barCantidad;
    private javax.swing.JPanel barDescripcion;
    private javax.swing.JPanel barID;
    private javax.swing.JPanel barNombre;
    private javax.swing.JPanel barPrecio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lnlNombre;
    private javax.swing.JScrollPane table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
