package com.frames;

import com.classes.MyConnection;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;

public class UsuariosUI extends javax.swing.JFrame {
    ResultSet rs;
    Connection cn = MyConnection.getConnection();
    public JOptionPane msg = new JOptionPane("Operacion realizada");
    public JDialog dialog = msg.createDialog("Mensaje");
    String user = "", password = "";
    int id = 0;
    public UsuariosUI() {
        initComponents();
        this.setBackground(new Color(255,255,255, 100));
        txtID.requestFocus();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblUsuario3 = new javax.swing.JLabel();
        barPassword = new javax.swing.JPanel();
        barUsuario = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        barID = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setTitle("Usuarios");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setText("Usuario");

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

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setEnabled(false);

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

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUser.setBorder(null);
        txtUser.setEnabled(false);

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Contraseña");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setBorder(null);

        lblUsuario3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario3.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario3.setText("ID");

        barPassword.setBackground(new java.awt.Color(204, 204, 204));
        barPassword.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barPasswordLayout = new javax.swing.GroupLayout(barPassword);
        barPassword.setLayout(barPasswordLayout);
        barPasswordLayout.setHorizontalGroup(
            barPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        barPasswordLayout.setVerticalGroup(
            barPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        barUsuario.setBackground(new java.awt.Color(204, 204, 204));
        barUsuario.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barUsuarioLayout = new javax.swing.GroupLayout(barUsuario);
        barUsuario.setLayout(barUsuarioLayout);
        barUsuarioLayout.setHorizontalGroup(
            barUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        barUsuarioLayout.setVerticalGroup(
            barUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

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

        barID.setBackground(new java.awt.Color(0, 90, 195));
        barID.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barIDLayout = new javax.swing.GroupLayout(barID);
        barID.setLayout(barIDLayout);
        barIDLayout.setHorizontalGroup(
            barIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        barIDLayout.setVerticalGroup(
            barIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario3)
                        .addGap(8, 8, 8)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(barID, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void Buscar(int id){
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Usuarios where idProducto = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idUsuario");
                user = rs.getString("usuario");
                password = rs.getString("contrasena");
                txtUser.setText(user);
                txtPassword.setText(password);
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        String txtnombre = txtUser.getText();
        String txtdescripcion = txtPassword.getText();
        if (btnNuevo.getText() == "Nuevo"){
            btnNuevo.setText("Confirmar");
            btnEliminar.setText("Eliminar");
            btnEditar.setText("Editar");
            txtUser.requestFocus();
            txtUser.setEnabled(true);
            txtPassword.setEnabled(true);
            txtID.setEnabled(false);
            barUsuario.setBackground(new java.awt.Color(0, 90, 150));
            barPassword.setBackground(new java.awt.Color(0, 90, 150));
            barID.setBackground(new java.awt.Color(187, 187, 187));
            //vaciarTxt();
        } else{
            if (txtnombre.equals("") || txtdescripcion.equals("")){
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else{
                //Insertar();
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
                btnNuevo.setText("Nuevo");
                txtUser.setEnabled(false);
                txtPassword.setEnabled(false);
                txtID.setEnabled(true);
                barUsuario.setBackground(new java.awt.Color(187, 187, 187));
                barPassword.setBackground(new java.awt.Color(187, 187, 187));
                barID.setBackground(new java.awt.Color(0, 90, 150));
                //vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String txtid = txtID.getText().trim();
        if (btnEditar.getText() == "Editar"){
            if (txtid.equals("")){
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else{
                //id = Integer.parseInt(txtid);
                //Buscar(id);
                btnEditar.setText("Confirmar");
                btnEliminar.setText("Eliminar");
                btnNuevo.setText("Nuevo");
                txtUser.setEnabled(true);
                txtPassword.setEnabled(true);
                txtID.setEnabled(false);
                barUsuario.setBackground(new java.awt.Color(0, 90, 150));
                barPassword.setBackground(new java.awt.Color(0, 90, 150));
                barID.setBackground(new java.awt.Color(187, 187, 187));
            }

        } else{
            String txtnombre = txtUser.getText();
            String txtdescripcion = txtPassword.getText();
            if (txtnombre.equals("") || txtdescripcion.equals("")){
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else{
                //Modificar(id, nombre, descripcion, precio, cantidad);
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
                btnEditar.setText("Editar");
                txtUser.setEnabled(false);
                txtPassword.setEnabled(false);
                txtID.setEnabled(true);
                barUsuario.setBackground(new java.awt.Color(187, 187, 187));
                barPassword.setBackground(new java.awt.Color(187, 187, 187));
                barID.setBackground(new java.awt.Color(0, 90, 150));
                //vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String txtid = txtID.getText().trim();
        if (btnEliminar.getText() == "Eliminar"){
            if (txtid.equals("")){
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else{
                //id = Integer.parseInt(txtid);
                //Buscar(id);
                btnEliminar.setText("Confirmar");
                btnNuevo.setText("Nuevo");
                btnEditar.setText("Editar");
                txtID.setEnabled(false);
                barID.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            System.out.println("a");
            //int estatus = 0;
            //Desactivar(id, estatus);
            //dialog.setAlwaysOnTop(true);
            //dialog.setVisible(true);
            //dialog.setAlwaysOnTop(true);
            //dialog.setVisible(true);
            btnEliminar.setText("Eliminar");
            txtUser.setEnabled(false);
            txtPassword.setEnabled(false);
            txtID.setEnabled(true);
            barUsuario.setBackground(new java.awt.Color(187, 187, 187));
            barPassword.setBackground(new java.awt.Color(187, 187, 187));
            barID.setBackground(new java.awt.Color(0, 90, 150));
            //vaciarTxt();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        // Reset Form
        txtID.requestFocus();
        btnEliminar.setText("Eliminar");
        btnNuevo.setText("Nuevo");
        btnEditar.setText("Editar");
        txtUser.setEnabled(false);
        txtPassword.setEnabled(false);
        txtID.setEnabled(true);
        barUsuario.setBackground(new java.awt.Color(187, 187, 187));
        barPassword.setBackground(new java.awt.Color(187, 187, 187));
        barID.setBackground(new java.awt.Color(0, 90, 150));
        //vaciarTxt();
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuariosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barID;
    private javax.swing.JPanel barPassword;
    private javax.swing.JPanel barUsuario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
