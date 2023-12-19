package com.frames;

import java.awt.Color;
import javax.swing.JOptionPane;

public class UsuariosUI extends javax.swing.JPanel {

    Usuarios usuarios = new Usuarios();
    MainUI main = new MainUI();

    public UsuariosUI() {
        initComponents();
        ResetUsuarios();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgUsuarios = new javax.swing.JPanel();
        TablaU = new javax.swing.JScrollPane();
        Tabla_Usuarios = new javax.swing.JTable();
        btnNuevoUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnCancelarUsuario = new javax.swing.JButton();
        txtID_U = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cbPermisos = new javax.swing.JComboBox<>();
        barID_U = new javax.swing.JPanel();
        barUsuario = new javax.swing.JPanel();
        barPermisos = new javax.swing.JPanel();
        barPassword = new javax.swing.JPanel();
        lblID_U = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPermisos = new javax.swing.JLabel();
        CheckBoxU = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        bgUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Usuarios = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        Tabla_Usuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        Tabla_Usuarios.setShowGrid(false);
        Tabla_Usuarios.getTableHeader().setResizingAllowed(false);
        Tabla_Usuarios.getTableHeader().setReorderingAllowed(false);
        Tabla_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_UsuariosMouseClicked(evt);
            }
        });
        TablaU.setViewportView(Tabla_Usuarios);

        bgUsuarios.add(TablaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 610, 320));

        btnNuevoUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/add_user_male_32px.png"))); // NOI18N
        btnNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        bgUsuarios.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 40, 40));

        btnEditarUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });
        bgUsuarios.add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 40, 40));

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminarUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete_32px.png"))); // NOI18N
        btnEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        bgUsuarios.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 40, 40));

        btnCancelarUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUsuarioActionPerformed(evt);
            }
        });
        bgUsuarios.add(btnCancelarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 40, 40));

        txtID_U.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_U.setBorder(null);
        txtID_U.setEnabled(false);
        bgUsuarios.add(txtID_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, -1));

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUser.setBorder(null);
        txtUser.setEnabled(false);
        bgUsuarios.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setEnabled(false);
        bgUsuarios.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, -1));

        cbPermisos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Admin" }));
        cbPermisos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPermisos.setEnabled(false);
        bgUsuarios.add(cbPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, 25));

        barID_U.setBackground(new java.awt.Color(187, 187, 187));
        barID_U.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_ULayout = new javax.swing.GroupLayout(barID_U);
        barID_U.setLayout(barID_ULayout);
        barID_ULayout.setHorizontalGroup(
            barID_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barID_ULayout.setVerticalGroup(
            barID_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgUsuarios.add(barID_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 2));

        barUsuario.setBackground(new java.awt.Color(204, 204, 204));
        barUsuario.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barUsuarioLayout = new javax.swing.GroupLayout(barUsuario);
        barUsuario.setLayout(barUsuarioLayout);
        barUsuarioLayout.setHorizontalGroup(
            barUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barUsuarioLayout.setVerticalGroup(
            barUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgUsuarios.add(barUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 2));

        barPermisos.setBackground(new java.awt.Color(204, 204, 204));
        barPermisos.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barPermisosLayout = new javax.swing.GroupLayout(barPermisos);
        barPermisos.setLayout(barPermisosLayout);
        barPermisosLayout.setHorizontalGroup(
            barPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barPermisosLayout.setVerticalGroup(
            barPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bgUsuarios.add(barPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 130, 2));

        barPassword.setBackground(new java.awt.Color(204, 204, 204));
        barPassword.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barPasswordLayout = new javax.swing.GroupLayout(barPassword);
        barPassword.setLayout(barPasswordLayout);
        barPasswordLayout.setHorizontalGroup(
            barPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barPasswordLayout.setVerticalGroup(
            barPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgUsuarios.add(barPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 130, 2));

        lblID_U.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_U.setForeground(new java.awt.Color(153, 153, 153));
        lblID_U.setText("ID");
        bgUsuarios.add(lblID_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setText("Usuario");
        bgUsuarios.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Contraseña");
        bgUsuarios.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 130, -1));

        lblPermisos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPermisos.setForeground(new java.awt.Color(153, 153, 153));
        lblPermisos.setText("Permisos");
        bgUsuarios.add(lblPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 130, -1));

        CheckBoxU.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBoxU.setForeground(new java.awt.Color(102, 102, 102));
        CheckBoxU.setText("Mostrar Todo");
        CheckBoxU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckBoxU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxUActionPerformed(evt);
            }
        });
        bgUsuarios.add(CheckBoxU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        add(bgUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        String txtnombre = txtUser.getText();
        String txtdescripcion = txtPassword.getText();
        if (btnNuevoUsuario.getBackground().equals(new java.awt.Color(0, 90, 195))) {
            if (main.getPermisos() == 1) {
                btnNuevoUsuario.setBackground(Color.green);
                txtUser.requestFocus();
                txtUser.setEnabled(true);
                txtPassword.setEnabled(true);
                btnEliminarUsuario.setEnabled(false);
                btnEditarUsuario.setEnabled(false);
                cbPermisos.setEnabled(true);
                barUsuario.setBackground(new java.awt.Color(0, 90, 150));
                barPassword.setBackground(new java.awt.Color(0, 90, 150));
                barPermisos.setBackground(new java.awt.Color(0, 90, 150));
                usuarios.vaciarTxt(txtID_U, txtUser, txtPassword);
            } else {
                ResetUsuarios();
                JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta accion");
            }
        } else {
            if (txtnombre.equals("") || txtdescripcion.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                String usuario = String.valueOf(txtUser.getText());
                String contrasena = String.valueOf(txtPassword.getText());
                int permisos;
                if (cbPermisos.getSelectedIndex() == 0) {
                    permisos = 0;
                } else {
                    permisos = 1;
                }
                usuarios.Insertar(usuario, contrasena, permisos);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                ResetUsuarios();
            }
        }
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
            if (Tabla_Usuarios.getSelectedRow() == -1) { //Iniciar Editar
                JOptionPane.showMessageDialog(null, "Selecciona un usuario");
            } else {
                if (main.getPermisos() == 1) {
                    String txtid = txtID_U.getText();
                    String txtUsuario = txtUser.getText();
                    String txtContrasena = txtPassword.getText().trim();
                    if (txtUsuario.equals("") || txtContrasena.equals("")) {
                        JOptionPane.showMessageDialog(null, "Llena todos los campos");
                    } else {
                        int confirm = JOptionPane.showConfirmDialog(
                        null,
                        "¿Estás seguro de editar este usuario?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION){
                            try {
                                int idU = Integer.parseInt(txtid);
                                int permisos;
                                if (cbPermisos.getSelectedIndex() == 0) {
                                    permisos = 0;
                                } else {
                                    permisos = 1;
                                }
                                usuarios.Modificar(idU, txtUsuario, txtContrasena, permisos);
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
        ResetUsuarios();
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
            if (Tabla_Usuarios.getSelectedRow() == -1) { //Iniciar Editar
                JOptionPane.showMessageDialog(null, "Selecciona un usuario");
            } else {
                if (main.getPermisos() == 1) {                
                    int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "¿Estás seguro de eliminar este usuario?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION){
                        String txtid = txtID_U.getText();
                        int idU = Integer.parseInt(txtid);
                        usuarios.Desactivar(idU);
                        JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta accion");
                }
            }
        ResetUsuarios();
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioActionPerformed
        ResetUsuarios();
    }//GEN-LAST:event_btnCancelarUsuarioActionPerformed

    private void CheckBoxUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxUActionPerformed
        if (main.getPermisos() == 1) {
            usuarios.CrearTabla(Tabla_Usuarios, CheckBoxU);
        } else {
            CheckBoxU.setSelected(false);
            JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta accion");
        }
    }//GEN-LAST:event_CheckBoxUActionPerformed

    private void Tabla_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_UsuariosMouseClicked
        Object id = Tabla_Usuarios.getModel().getValueAt(Tabla_Usuarios.getSelectedRow(), 0);
        int idU = Integer.parseInt(id.toString());
        usuarios.Buscar(idU, txtID_U, txtUser, txtPassword, cbPermisos);
        txtUser.setEnabled(true);
        txtPassword.setEnabled(true);
        cbPermisos.setEnabled(true);
        barUsuario.setBackground(new java.awt.Color(0, 90, 150));
        barPassword.setBackground(new java.awt.Color(0, 90, 150));
        barPermisos.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_Tabla_UsuariosMouseClicked

    public void ResetUsuarios() {
        txtUser.setEnabled(false);
        txtPassword.setEnabled(false);
        btnNuevoUsuario.setEnabled(true);
        btnEliminarUsuario.setEnabled(true);
        btnEditarUsuario.setEnabled(true);
        cbPermisos.setEnabled(false);
        cbPermisos.setSelectedIndex(0);
        CheckBoxU.setSelected(false);
        barUsuario.setBackground(new java.awt.Color(187, 187, 187));
        barPassword.setBackground(new java.awt.Color(187, 187, 187));
        barPermisos.setBackground(new java.awt.Color(187, 187, 187));
        btnNuevoUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminarUsuario.setBackground(new java.awt.Color(0, 90, 195));
        usuarios.vaciarTxt(txtID_U, txtUser, txtPassword);
        usuarios.CrearTabla(Tabla_Usuarios, CheckBoxU);
        //setCbUsuarios(login.ID_Usuario);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxU;
    private javax.swing.JScrollPane TablaU;
    private javax.swing.JTable Tabla_Usuarios;
    private javax.swing.JPanel barID_U;
    private javax.swing.JPanel barPassword;
    private javax.swing.JPanel barPermisos;
    private javax.swing.JPanel barUsuario;
    private javax.swing.JPanel bgUsuarios;
    private javax.swing.JButton btnCancelarUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JComboBox<String> cbPermisos;
    private javax.swing.JLabel lblID_U;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPermisos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtID_U;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
