package com.frames;

import com.classes.MyConnection;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UsuariosUI extends javax.swing.JFrame {

    ResultSet rs;
    Connection cn = MyConnection.getConnection();
    public JOptionPane msg = new JOptionPane("Operacion realizada");
    public JDialog dialog = msg.createDialog("Mensaje");
    String user = "", password = "";
    int id = 0;
    MainUI main = new MainUI();

    public UsuariosUI() {
        initComponents();
        this.setBackground(new Color(255, 255, 255, 100));
        txtID.requestFocus();
        CrearTabla();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgUsuarios = new javax.swing.JPanel();
        lblUsuario3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        barUsuario = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        barPassword = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Usuarios = new javax.swing.JTable();
        barID = new javax.swing.JPanel();

        setTitle("Usuarios");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        bgUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario3.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario3.setText("ID");
        bgUsuarios.add(lblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

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
        bgUsuarios.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 100, 120, -1));

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUser.setBorder(null);
        txtUser.setEnabled(false);
        bgUsuarios.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, -1));

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setBorder(null);
        bgUsuarios.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));

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

        bgUsuarios.add(barUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, 2));

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
        bgUsuarios.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 100, 120, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setText("Usuario");
        bgUsuarios.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 120, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Contraseña");
        bgUsuarios.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 120, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setEnabled(false);
        bgUsuarios.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 120, -1));

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
        bgUsuarios.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 100, 120, -1));

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

        bgUsuarios.add(barPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 120, 2));

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
        bgUsuarios.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        Tabla_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Usuarios);

        bgUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 500, 285));

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

        bgUsuarios.add(barID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 2));

        getContentPane().add(bgUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Buscar(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Usuarios where idUsuario = ?");
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
        if (btnNuevo.getText() == "Nuevo") {
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
            vaciarTxt();
        } else {
            if (txtnombre.equals("") || txtdescripcion.equals("")) {
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                Insertar();
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                btnNuevo.setText("Nuevo");
                txtUser.setEnabled(false);
                txtPassword.setEnabled(false);
                txtID.setEnabled(true);
                barUsuario.setBackground(new java.awt.Color(187, 187, 187));
                barPassword.setBackground(new java.awt.Color(187, 187, 187));
                barID.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String txtid = txtID.getText().trim();
        if (btnEditar.getText() == "Editar") {
            if (txtid.equals("")) {
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                id = Integer.parseInt(txtid);
                Buscar(id);
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

        } else {
            String txtUsuario = txtUser.getText();
            String txtContrasena = txtPassword.getText();
            if (txtUsuario.equals("") || txtContrasena.equals("")) {
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                Modificar(id, txtUsuario, txtContrasena);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                btnEditar.setText("Editar");
                txtUser.setEnabled(false);
                txtPassword.setEnabled(false);
                txtID.setEnabled(true);
                barUsuario.setBackground(new java.awt.Color(187, 187, 187));
                barPassword.setBackground(new java.awt.Color(187, 187, 187));
                barID.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxt();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String txtid = txtID.getText().trim();
        if (btnEliminar.getText() == "Eliminar") {
            if (txtid.equals("")) {
                //dialog.setAlwaysOnTop(true);
                //dialog.setVisible(true);
            } else {
                id = Integer.parseInt(txtid);
                Buscar(id);
                btnEliminar.setText("Confirmar");
                btnNuevo.setText("Nuevo");
                btnEditar.setText("Editar");
                txtID.setEnabled(false);
                barID.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            System.out.println("a");
            int estatus = 0;
            Desactivar(id, estatus);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            btnEliminar.setText("Eliminar");
            txtUser.setEnabled(false);
            txtPassword.setEnabled(false);
            txtID.setEnabled(true);
            barUsuario.setBackground(new java.awt.Color(187, 187, 187));
            barPassword.setBackground(new java.awt.Color(187, 187, 187));
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
        txtUser.setEnabled(false);
        txtPassword.setEnabled(false);
        txtID.setEnabled(true);
        barUsuario.setBackground(new java.awt.Color(187, 187, 187));
        barPassword.setBackground(new java.awt.Color(187, 187, 187));
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

    public void vaciarTxt() {
        txtID.setText("");
        txtUser.setText("");
        txtPassword.setText("");
    }

    public void Insertar() {
        String usuario, contrasena;
        int estatus = 1;
        usuario = String.valueOf(txtUser.getText());
        contrasena = String.valueOf(txtPassword.getText());
        try {
            CallableStatement cst = cn.prepareCall("{call agregarUsuario(?,?,?)}");
            cst.setString(1, usuario);
            cst.setString(2, contrasena);
            cst.setInt(3, estatus);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        CrearTabla();
    }

    public void Desactivar(int id, int estatus) {
        try {
            CallableStatement cst = cn.prepareCall("{call estatusUsuario(?,?)}");
            cst.setInt(1, id);
            cst.setInt(2, estatus);
            cst.execute();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        CrearTabla();
    }

    public void Modificar(int id, String usuario, String contrasena) {
        try {
            CallableStatement cst = cn.prepareCall("{call modificarUsuario(?,?,?)}");
            cst.setInt(1, id);
            cst.setString(2, usuario);
            cst.setString(3, contrasena);
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
            dfm.addColumn("Usuario");
            dfm.addColumn("Contraseña");
            //dfm.addColumn("Estatus");
            PreparedStatement pst = cn.prepareStatement("select * from Usuarios where estatus = 1");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idUsuario"), rs.getString("usuario"), rs.getString("contrasena")});
                //, rs.getInt("estatus")});
            }
            Tabla_Usuarios.setModel(dfm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Usuarios;
    private javax.swing.JPanel barID;
    private javax.swing.JPanel barPassword;
    private javax.swing.JPanel barUsuario;
    private javax.swing.JPanel bgUsuarios;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
