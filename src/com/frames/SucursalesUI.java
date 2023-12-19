package com.frames;

import java.awt.*;
import javax.swing.JOptionPane;

public class SucursalesUI extends javax.swing.JPanel {
    MainUI main = new MainUI();
    Sucursales sucursales = new Sucursales();
    public SucursalesUI() {
        initComponents();
        ResetSucursales();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSucursales = new javax.swing.JPanel();
        TablaS = new javax.swing.JScrollPane();
        Tabla_Sucursales = new javax.swing.JTable();
        btnNuevaS = new javax.swing.JButton();
        btnEditarS = new javax.swing.JButton();
        btnEliminarS = new javax.swing.JButton();
        btnCancelarS = new javax.swing.JButton();
        barID_S = new javax.swing.JPanel();
        barNombreS = new javax.swing.JPanel();
        barDomicilio = new javax.swing.JPanel();
        txtID_S = new javax.swing.JTextField();
        txtNombreS = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        lblID_S = new javax.swing.JLabel();
        lblNombreS = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        CheckBoxS = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgSucursales.setBackground(new java.awt.Color(255, 255, 255));
        bgSucursales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Sucursales = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        Tabla_Sucursales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tabla_Sucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Sucursales.setShowGrid(false);
        Tabla_Sucursales.getTableHeader().setResizingAllowed(false);
        Tabla_Sucursales.getTableHeader().setReorderingAllowed(false);
        Tabla_Sucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_SucursalesMouseClicked(evt);
            }
        });
        TablaS.setViewportView(Tabla_Sucursales);

        bgSucursales.add(TablaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 610, 320));

        btnNuevaS.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevaS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevaS.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/home_32px.png"))); // NOI18N
        btnNuevaS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSActionPerformed(evt);
            }
        });
        bgSucursales.add(btnNuevaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 40, 40));

        btnEditarS.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarS.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSActionPerformed(evt);
            }
        });
        bgSucursales.add(btnEditarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 40, 40));

        btnEliminarS.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminarS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarS.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete_32px.png"))); // NOI18N
        btnEliminarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSActionPerformed(evt);
            }
        });
        bgSucursales.add(btnEliminarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 40, 40));

        btnCancelarS.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarS.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSActionPerformed(evt);
            }
        });
        bgSucursales.add(btnCancelarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 40, 40));

        barID_S.setBackground(new java.awt.Color(204, 204, 204));
        barID_S.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_SLayout = new javax.swing.GroupLayout(barID_S);
        barID_S.setLayout(barID_SLayout);
        barID_SLayout.setHorizontalGroup(
            barID_SLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        barID_SLayout.setVerticalGroup(
            barID_SLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgSucursales.add(barID_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 2));

        barNombreS.setBackground(new java.awt.Color(204, 204, 204));
        barNombreS.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barNombreSLayout = new javax.swing.GroupLayout(barNombreS);
        barNombreS.setLayout(barNombreSLayout);
        barNombreSLayout.setHorizontalGroup(
            barNombreSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        barNombreSLayout.setVerticalGroup(
            barNombreSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgSucursales.add(barNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 2));

        barDomicilio.setBackground(new java.awt.Color(204, 204, 204));
        barDomicilio.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barDomicilioLayout = new javax.swing.GroupLayout(barDomicilio);
        barDomicilio.setLayout(barDomicilioLayout);
        barDomicilioLayout.setHorizontalGroup(
            barDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        barDomicilioLayout.setVerticalGroup(
            barDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgSucursales.add(barDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 420, 2));

        txtID_S.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_S.setBorder(null);
        txtID_S.setEnabled(false);
        bgSucursales.add(txtID_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, -1));

        txtNombreS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreS.setBorder(null);
        txtNombreS.setEnabled(false);
        bgSucursales.add(txtNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, -1));

        txtDomicilio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDomicilio.setBorder(null);
        txtDomicilio.setEnabled(false);
        bgSucursales.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 420, -1));

        lblID_S.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_S.setForeground(new java.awt.Color(153, 153, 153));
        lblID_S.setText("ID");
        bgSucursales.add(lblID_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, -1));

        lblNombreS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombreS.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreS.setText("Nombre");
        bgSucursales.add(lblNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        lblDomicilio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDomicilio.setForeground(new java.awt.Color(153, 153, 153));
        lblDomicilio.setText("Domicilio");
        bgSucursales.add(lblDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 420, -1));

        CheckBoxS.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBoxS.setForeground(new java.awt.Color(102, 102, 102));
        CheckBoxS.setText("Mostrar Todo");
        CheckBoxS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckBoxS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSActionPerformed(evt);
            }
        });
        bgSucursales.add(CheckBoxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        add(bgSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSActionPerformed
        if (btnNuevaS.getBackground().equals(new Color(0, 90, 195))) { //Iniciar Nueva
            ResetSucursales();
            btnNuevaS.setBackground(new Color(0, 220, 0));
            txtNombreS.requestFocus();
            txtNombreS.setEnabled(true);
            txtDomicilio.setEnabled(true);
            txtID_S.setEnabled(false);
            btnEliminarS.setEnabled(false);
            btnEditarS.setEnabled(false);
            barNombreS.setBackground(new Color(0, 90, 195));
            barDomicilio.setBackground(new Color(0, 90, 195));
            barID_S.setBackground(new Color(187, 187, 187));
        } else { //Confirmar Nueva
            String txtnombre = txtNombreS.getText();
            String txtdescripcion = txtDomicilio.getText();
            if (txtnombre.equals("") || txtdescripcion.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                String sucursal = String.valueOf(txtNombreS.getText());
                String domicilio = String.valueOf(txtDomicilio.getText());
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                sucursales.Insertar(sucursal, domicilio);
                ResetSucursales();
            }
        }
    }//GEN-LAST:event_btnNuevaSActionPerformed

    private void btnEditarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSActionPerformed
        if (Tabla_Sucursales.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una sucursal");
        } else {
            if (main.getPermisos() == 1) {
                String txtid = txtID_S.getText();
                String nombre = txtNombreS.getText();
                String domicilio = txtDomicilio.getText();
                if (nombre.equals("") || domicilio.equals("")) {
                    JOptionPane.showMessageDialog(null, "Llena todos los campos");
                } else {
                    int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "¿Estás seguro de editar esta sucursal?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION){
                        try {
                            int idS = Integer.parseInt(txtid);
                            sucursales.Modificar(idS, nombre, domicilio);
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
        ResetSucursales();
    }//GEN-LAST:event_btnEditarSActionPerformed

    private void btnEliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSActionPerformed
        if (Tabla_Sucursales.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una sucursal");
        } else {
            if (main.getPermisos() == 1) {
                int confirm = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de eliminar esta sucursal?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION){
                    String txtid = txtID_S.getText();
                    int idS = Integer.parseInt(txtid);
                    sucursales.Desactivar(idS);
                    JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta accion");
            }
        } 
        ResetSucursales();
    }//GEN-LAST:event_btnEliminarSActionPerformed

    private void btnCancelarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSActionPerformed
        ResetSucursales();
    }//GEN-LAST:event_btnCancelarSActionPerformed

    private void CheckBoxSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxSActionPerformed
        if (main.getPermisos() == 1) {
            sucursales.CrearTabla(Tabla_Sucursales, CheckBoxS);
        } else {
            CheckBoxS.setSelected(false);
            JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta accion");
        }
    }//GEN-LAST:event_CheckBoxSActionPerformed

    private void Tabla_SucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SucursalesMouseClicked
        Object id = Tabla_Sucursales.getModel().getValueAt(Tabla_Sucursales.getSelectedRow(), 0);
        int idS = Integer.parseInt(id.toString());
        sucursales.Buscar(idS, txtID_S, txtNombreS, txtDomicilio);
        txtNombreS.setEnabled(true);
        txtDomicilio.setEnabled(true);
        txtID_S.setEnabled(false);
        barNombreS.setBackground(new Color(0, 90, 195));
        barDomicilio.setBackground(new Color(0, 90, 195));
        barID_S.setBackground(new Color(187, 187, 187));
    }//GEN-LAST:event_Tabla_SucursalesMouseClicked

    public void ResetSucursales() {
        main.btnVentasClick();
        txtNombreS.setEnabled(false);
        txtDomicilio.setEnabled(false);
        btnNuevaS.setEnabled(true);
        btnEditarS.setEnabled(true);
        btnEliminarS.setEnabled(true);
        CheckBoxS.setSelected(false);
        barNombreS.setBackground(new Color(187, 187, 187));
        barDomicilio.setBackground(new Color(187, 187, 187));
        btnNuevaS.setBackground(new Color(0, 90, 195));
        btnEditarS.setBackground(new Color(0, 90, 195));
        btnEliminarS.setBackground(new Color(0, 90, 195));
        btnEliminarS.setBackground(new Color(0, 90, 195));
        sucursales.CrearTabla(Tabla_Sucursales, CheckBoxS);
        sucursales.vaciarTxt(txtID_S, txtNombreS, txtDomicilio);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxS;
    private javax.swing.JScrollPane TablaS;
    private javax.swing.JTable Tabla_Sucursales;
    private javax.swing.JPanel barDomicilio;
    private javax.swing.JPanel barID_S;
    private javax.swing.JPanel barNombreS;
    private javax.swing.JPanel bgSucursales;
    private javax.swing.JButton btnCancelarS;
    private javax.swing.JButton btnEditarS;
    private javax.swing.JButton btnEliminarS;
    private javax.swing.JButton btnNuevaS;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblID_S;
    private javax.swing.JLabel lblNombreS;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtID_S;
    private javax.swing.JTextField txtNombreS;
    // End of variables declaration//GEN-END:variables
}
