package com.frames;

import java.awt.Color;
import javax.swing.JOptionPane;

public class ProductosUI extends javax.swing.JPanel {
   
    Productos productos = new Productos();
    MainUI main = new MainUI();
    public ProductosUI() {
        initComponents();
        ResetProductos();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgProductos = new javax.swing.JPanel();
        TablaP = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        btnNuevoP = new javax.swing.JButton();
        btnEditarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();
        barID_P = new javax.swing.JPanel();
        barCantidad = new javax.swing.JPanel();
        barPrecio = new javax.swing.JPanel();
        barDescripcion = new javax.swing.JPanel();
        barNombre = new javax.swing.JPanel();
        txtID_P = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        lblID_P = new javax.swing.JLabel();
        lnlNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        CheckBoxP = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgProductos.setBackground(new java.awt.Color(255, 255, 255));
        bgProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Productos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        Tabla_Productos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        Tabla_Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla_Productos.setRowHeight(20);
        Tabla_Productos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabla_Productos.setShowGrid(false);
        Tabla_Productos.getTableHeader().setResizingAllowed(false);
        Tabla_Productos.getTableHeader().setReorderingAllowed(false);
        Tabla_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ProductosMouseClicked(evt);
            }
        });
        TablaP.setViewportView(Tabla_Productos);

        bgProductos.add(TablaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 610, 320));

        btnNuevoP.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoP.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/product_32px.png"))); // NOI18N
        btnNuevoP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPActionPerformed(evt);
            }
        });
        bgProductos.add(btnNuevoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 40, 40));

        btnEditarP.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarP.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPActionPerformed(evt);
            }
        });
        bgProductos.add(btnEditarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 40, 40));

        btnEliminarP.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarP.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete_32px.png"))); // NOI18N
        btnEliminarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });
        bgProductos.add(btnEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 40, 40));

        btnCancelarP.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarP.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPActionPerformed(evt);
            }
        });
        bgProductos.add(btnCancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 40, 40));

        barID_P.setBackground(new java.awt.Color(204, 204, 204));
        barID_P.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_PLayout = new javax.swing.GroupLayout(barID_P);
        barID_P.setLayout(barID_PLayout);
        barID_PLayout.setHorizontalGroup(
            barID_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barID_PLayout.setVerticalGroup(
            barID_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgProductos.add(barID_P, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 2));

        barCantidad.setBackground(new java.awt.Color(204, 204, 204));
        barCantidad.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barCantidadLayout = new javax.swing.GroupLayout(barCantidad);
        barCantidad.setLayout(barCantidadLayout);
        barCantidadLayout.setHorizontalGroup(
            barCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barCantidadLayout.setVerticalGroup(
            barCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgProductos.add(barCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, 2));

        barPrecio.setBackground(new java.awt.Color(204, 204, 204));
        barPrecio.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barPrecioLayout = new javax.swing.GroupLayout(barPrecio);
        barPrecio.setLayout(barPrecioLayout);
        barPrecioLayout.setHorizontalGroup(
            barPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barPrecioLayout.setVerticalGroup(
            barPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgProductos.add(barPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 130, 2));

        barDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        barDescripcion.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barDescripcionLayout = new javax.swing.GroupLayout(barDescripcion);
        barDescripcion.setLayout(barDescripcionLayout);
        barDescripcionLayout.setHorizontalGroup(
            barDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barDescripcionLayout.setVerticalGroup(
            barDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgProductos.add(barDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 130, 2));

        barNombre.setBackground(new java.awt.Color(204, 204, 204));
        barNombre.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barNombreLayout = new javax.swing.GroupLayout(barNombre);
        barNombre.setLayout(barNombreLayout);
        barNombreLayout.setHorizontalGroup(
            barNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barNombreLayout.setVerticalGroup(
            barNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgProductos.add(barNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 2));

        txtID_P.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_P.setBorder(null);
        txtID_P.setEnabled(false);
        bgProductos.add(txtID_P, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setEnabled(false);
        bgProductos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, -1));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.setEnabled(false);
        bgProductos.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, -1));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.setEnabled(false);
        bgProductos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.setEnabled(false);
        bgProductos.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 130, -1));

        lblID_P.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_P.setForeground(new java.awt.Color(153, 153, 153));
        lblID_P.setText("ID");
        bgProductos.add(lblID_P, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        lnlNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lnlNombre.setForeground(new java.awt.Color(153, 153, 153));
        lnlNombre.setText("Nombre");
        bgProductos.add(lnlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        lblDescripcion.setText("Descripcion");
        bgProductos.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 130, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(153, 153, 153));
        lblPrecio.setText("Precio");
        bgProductos.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 130, -1));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidad.setText("Cantidad");
        bgProductos.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 130, -1));

        CheckBoxP.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBoxP.setForeground(new java.awt.Color(102, 102, 102));
        CheckBoxP.setText("Mostrar Todo");
        CheckBoxP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckBoxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPActionPerformed(evt);
            }
        });
        bgProductos.add(CheckBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        add(bgProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPActionPerformed
        if (btnNuevoP.getBackground().equals(new Color(0, 90, 195))) { //Iniciar Nuevo
            ResetProductos();
            btnNuevoP.setBackground(new Color(0, 220, 0));
            txtNombre.requestFocus();
            txtNombre.setEnabled(true);
            txtDescripcion.setEnabled(true);
            txtPrecio.setEnabled(true);
            txtCantidad.setEnabled(true);
            txtID_P.setEnabled(false);
            btnEliminarP.setEnabled(false);
            btnEditarP.setEnabled(false);
            barNombre.setBackground(new Color(0, 90, 195));
            barDescripcion.setBackground(new Color(0, 90, 195));
            barCantidad.setBackground(new Color(0, 90, 195));
            barPrecio.setBackground(new Color(0, 90, 195));
            barID_P.setBackground(new Color(187, 187, 187));
        } else { //Confirmar Nuevo
            String txtnombre = txtNombre.getText();
            String txtdescripcion = txtDescripcion.getText();
            String txtprecio = txtPrecio.getText().trim();
            String txtcantidad = txtCantidad.getText().trim();
            if (txtnombre.equals("") || txtdescripcion.equals("") || txtprecio.equals("") || txtcantidad.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                try {
                    String nombre = String.valueOf(txtNombre.getText());
                    String descripcion = String.valueOf(txtDescripcion.getText());
                    int precio = Integer.parseInt(txtPrecio.getText());
                    int cantidad = Integer.parseInt(txtCantidad.getText());
                    productos.Insertar(nombre, descripcion, precio, cantidad);
                    JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos");
                }
                ResetProductos();
            }
        }
    }//GEN-LAST:event_btnNuevoPActionPerformed

    private void btnEditarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPActionPerformed
            if (Tabla_Productos.getSelectedRow() == -1) { //Iniciar Editar
                JOptionPane.showMessageDialog(null, "Selecciona un producto");
            } else {
                if (main.getPermisos() == 1) {
                        
                    String txtid = txtID_P.getText();
                    String txtnombre = txtNombre.getText();
                    String txtdescripcion = txtDescripcion.getText();
                    String txtprecio = txtPrecio.getText().trim();
                    String txtcantidad = txtCantidad.getText().trim();
                    if (txtnombre.equals("") || txtdescripcion.equals("") || txtprecio.equals("") || txtcantidad.equals("")) {
                        JOptionPane.showMessageDialog(null, "Llena todos los campos");
                    } else {
                        int confirm = JOptionPane.showConfirmDialog(
                        null,
                        "¿Estás seguro de editar este producto?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION){
                            try {
                                int idP = Integer.parseInt(txtid);
                                int precio = Integer.parseInt(txtprecio);
                                int cantidad = Integer.parseInt(txtcantidad);
                                String nombre = txtNombre.getText().trim();
                                String descripcion = txtDescripcion.getText().trim();
                                productos.Modificar(idP, nombre, descripcion, precio, cantidad);
                                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Error en el tipo de datos");
                            }
                        } 
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta accion");
                }
            }                    
            ResetProductos();
    }//GEN-LAST:event_btnEditarPActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
            if (Tabla_Productos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona un producto");
            } else {
                if (main.getPermisos() == 1) {
                    int confirm = JOptionPane.showConfirmDialog(
                        null,
                        "¿Estás seguro de eliminar este producto?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION){
                            String txtid = txtID_P.getText();
                            int idP = Integer.parseInt(txtid);
                            productos.Desactivar(idP);
                            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                        } else{
                        }
                } else {
                    JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta accion");
                }
            }     
        ResetProductos();
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        ResetProductos();
    }//GEN-LAST:event_btnCancelarPActionPerformed

    private void CheckBoxPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPActionPerformed
        if (main.getPermisos() == 1) {
            productos.CrearTabla(Tabla_Productos, CheckBoxP);
        } else {
            CheckBoxP.setSelected(false);
            JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta accion");
        }
    }//GEN-LAST:event_CheckBoxPActionPerformed

    private void Tabla_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ProductosMouseClicked
        txtNombre.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtCantidad.setEnabled(true);
        barNombre.setBackground(new Color(0, 90, 195));
        barDescripcion.setBackground(new Color(0, 90, 195));
        barCantidad.setBackground(new Color(0, 90, 195));
        barPrecio.setBackground(new Color(0, 90, 195));
        Object id = Tabla_Productos.getModel().getValueAt(Tabla_Productos.getSelectedRow(), 0);
        int idP = Integer.parseInt(id.toString());
        productos.Buscar(idP, txtID_P, txtNombre, txtDescripcion, txtPrecio, txtCantidad);
    }//GEN-LAST:event_Tabla_ProductosMouseClicked

    public void ResetProductos() {
        txtNombre.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCantidad.setEnabled(false);
        btnNuevoP.setEnabled(true);
        btnEditarP.setEnabled(true);
        btnEliminarP.setEnabled(true);
        CheckBoxP.setSelected(false);
        barNombre.setBackground(new Color(187, 187, 187));
        barDescripcion.setBackground(new Color(187, 187, 187));
        barCantidad.setBackground(new Color(187, 187, 187));
        barPrecio.setBackground(new Color(187, 187, 187));
        btnNuevoP.setBackground(new Color(0, 90, 195));
        btnEditarP.setBackground(new Color(0, 90, 195));
        btnEliminarP.setBackground(new Color(0, 90, 195));
        productos.CrearTabla(Tabla_Productos, CheckBoxP);
        productos.vaciarTxt(txtID_P, txtNombre, txtDescripcion, txtPrecio, txtCantidad);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxP;
    private javax.swing.JScrollPane TablaP;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JPanel barCantidad;
    private javax.swing.JPanel barDescripcion;
    private javax.swing.JPanel barID_P;
    private javax.swing.JPanel barNombre;
    private javax.swing.JPanel barPrecio;
    private javax.swing.JPanel bgProductos;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnEditarP;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnNuevoP;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID_P;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lnlNombre;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID_P;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
