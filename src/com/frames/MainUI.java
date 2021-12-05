package com.frames;

import com.classes.MyConnection;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class MainUI extends javax.swing.JFrame {
    
    ResultSet rs;
    Connection cn = MyConnection.getConnection();
    
    Ventas ventas = new Ventas();
    Usuarios usuarios = new Usuarios();
    Productos productos = new Productos();
    
    String user = "", password = "", nombre = "", descripcion = "", temp = "";
    int id_Usuario = 0, precio = 0, cantidad = 0, id_Producto = 0;
    int Cantidad = 0, Total = 0, ID_Producto = 0, id_Ventas = 0, precioProd = 0;
    
    public MainUI() {
        initComponents();
        bgVentas.setVisible(false);
        bgProductos.setVisible(false);
        bgUsuarios.setVisible(false);
        this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("com/images/Icono.png")).getImage());
        lbl_icon.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("com/images/Icono.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        btnProductos = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JLabel();
        barSalir = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        barProductos = new javax.swing.JPanel();
        barUsuarios = new javax.swing.JPanel();
        bgUsuarios = new javax.swing.JPanel();
        lblID_Usuario = new javax.swing.JLabel();
        btnEditarUsuario = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtIDUsuario = new javax.swing.JTextField();
        barUsuario = new javax.swing.JPanel();
        btnEliminarUsuario = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnCancelarUsuario = new javax.swing.JButton();
        barPassword = new javax.swing.JPanel();
        btnNuevoUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Usuarios = new javax.swing.JTable();
        barID_Usuario = new javax.swing.JPanel();
        bgProductos = new javax.swing.JPanel();
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
        bgVentas = new javax.swing.JPanel();
        btnAgregarProducto = new javax.swing.JButton();
        btnNuevoVenta = new javax.swing.JButton();
        barID_Venta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Ventas = new javax.swing.JTable();
        btnCancelarVenta = new javax.swing.JButton();
        btnEditarVenta = new javax.swing.JButton();
        lblCantidadVenta = new javax.swing.JLabel();
        txtID_Venta = new javax.swing.JTextField();
        lblID_Venta = new javax.swing.JLabel();
        barCantidadVenta = new javax.swing.JPanel();
        txtCantidadVenta = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtID_ProductoV = new javax.swing.JTextField();
        lblID_Producto2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        barTotal = new javax.swing.JPanel();
        barID_Producto2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Refaccionaria Fivani");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 90, 195));

        lbl_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon.setPreferredSize(new java.awt.Dimension(100, 100));

        btnProductos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });

        btnVentas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVentas.setText("Ventas");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });

        btnUsuarios.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        btnInformacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInformacion.setText("Informacion");
        btnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInformacionMouseExited(evt);
            }
        });

        barSalir.setBackground(new java.awt.Color(255, 255, 255));
        barSalir.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barSalirLayout = new javax.swing.GroupLayout(barSalir);
        barSalir.setLayout(barSalirLayout);
        barSalirLayout.setHorizontalGroup(
            barSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barSalirLayout.setVerticalGroup(
            barSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        barProductos.setBackground(new java.awt.Color(255, 255, 255));
        barProductos.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barProductosLayout = new javax.swing.GroupLayout(barProductos);
        barProductos.setLayout(barProductosLayout);
        barProductosLayout.setHorizontalGroup(
            barProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barProductosLayout.setVerticalGroup(
            barProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        barUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        barUsuarios.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barUsuariosLayout = new javax.swing.GroupLayout(barUsuarios);
        barUsuarios.setLayout(barUsuariosLayout);
        barUsuariosLayout.setHorizontalGroup(
            barUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barUsuariosLayout.setVerticalGroup(
            barUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(barUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnInformacion)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 500));

        bgUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        bgUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Usuario.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Usuario.setText("ID");
        bgUsuarios.add(lblID_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

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
        bgUsuarios.add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 40, 40));

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUser.setBorder(null);
        txtUser.setEnabled(false);
        bgUsuarios.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        txtIDUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIDUsuario.setBorder(null);
        bgUsuarios.add(txtIDUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, -1));

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

        bgUsuarios.add(barUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 2));

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
        bgUsuarios.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 40, 40));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setText("Usuario");
        bgUsuarios.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Contraseña");
        bgUsuarios.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setEnabled(false);
        bgUsuarios.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 120, -1));

        btnCancelarUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarUsuarioMouseExited(evt);
            }
        });
        btnCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUsuarioActionPerformed(evt);
            }
        });
        bgUsuarios.add(btnCancelarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 40, 40));

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

        bgUsuarios.add(barPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 120, 2));

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
        bgUsuarios.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 40, 40));

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

        bgUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 500, 300));

        barID_Usuario.setBackground(new java.awt.Color(0, 90, 195));
        barID_Usuario.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_UsuarioLayout = new javax.swing.GroupLayout(barID_Usuario);
        barID_Usuario.setLayout(barID_UsuarioLayout);
        barID_UsuarioLayout.setHorizontalGroup(
            barID_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        barID_UsuarioLayout.setVerticalGroup(
            barID_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgUsuarios.add(barID_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, 2));

        getContentPane().add(bgUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 500));

        bgProductos.setBackground(new java.awt.Color(255, 255, 255));
        bgProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnlNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lnlNombre.setForeground(new java.awt.Color(153, 153, 153));
        lnlNombre.setText("Nombre");
        bgProductos.add(lnlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, -1));

        btnCancelarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
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
        bgProductos.add(btnCancelarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 40, 40));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.setEnabled(false);
        bgProductos.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 127, -1));

        btnEditarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });
        bgProductos.add(btnEditarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 40, 40));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.setEnabled(false);
        bgProductos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 112, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setEnabled(false);
        bgProductos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 100, -1));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        lblDescripcion.setText("Descripcion");
        bgProductos.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 115, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(153, 153, 153));
        lblPrecio.setText("Precio");
        bgProductos.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 112, -1));

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

        bgProductos.add(barCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 100, 2));

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

        bgProductos.add(barPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 112, 2));

        txtID_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Producto.setBorder(null);
        bgProductos.add(txtID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 100, -1));

        lblID_Producto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto.setText("ID");
        bgProductos.add(lblID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, -1));

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

        bgProductos.add(barDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 127, 2));

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

        bgProductos.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 500, 300));

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

        bgProductos.add(barNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 100, 2));

        btnEliminarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete_32px.png"))); // NOI18N
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        bgProductos.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 40, 40));

        btnNuevoProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevoProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/product_32px.png"))); // NOI18N
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        bgProductos.add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, 40));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.setEnabled(false);
        bgProductos.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 100, -1));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidad.setText("Cantidad");
        bgProductos.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 100, -1));

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

        bgProductos.add(barID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 100, 2));

        getContentPane().add(bgProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        bgVentas.setBackground(new java.awt.Color(255, 255, 255));
        bgVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnAgregarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/add_32px.png"))); // NOI18N
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
        bgVentas.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 40, 40));

        btnNuevoVenta.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevoVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/shopping_cart_32px.png"))); // NOI18N
        btnNuevoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoVentaActionPerformed(evt);
            }
        });
        bgVentas.add(btnNuevoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, 40));

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

        bgVentas.add(barID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 2));

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
        jScrollPane2.setViewportView(Tabla_Ventas);

        bgVentas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 500, 300));

        btnCancelarVenta.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
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
        bgVentas.add(btnCancelarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 40, 40));

        btnEditarVenta.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVentaActionPerformed(evt);
            }
        });
        bgVentas.add(btnEditarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 40, 40));

        lblCantidadVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidadVenta.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidadVenta.setText("Cantidad");
        bgVentas.add(lblCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, -1));

        txtID_Venta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Venta.setBorder(null);
        bgVentas.add(txtID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, -1));

        lblID_Venta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Venta.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Venta.setText("ID Venta");
        bgVentas.add(lblID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        barCantidadVenta.setBackground(new java.awt.Color(204, 204, 204));
        barCantidadVenta.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barCantidadVentaLayout = new javax.swing.GroupLayout(barCantidadVenta);
        barCantidadVenta.setLayout(barCantidadVentaLayout);
        barCantidadVentaLayout.setHorizontalGroup(
            barCantidadVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        barCantidadVentaLayout.setVerticalGroup(
            barCantidadVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgVentas.add(barCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, 2));

        txtCantidadVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidadVenta.setBorder(null);
        txtCantidadVenta.setEnabled(false);
        bgVentas.add(txtCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setEnabled(false);
        bgVentas.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 110, -1));

        txtID_ProductoV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_ProductoV.setBorder(null);
        txtID_ProductoV.setEnabled(false);
        bgVentas.add(txtID_ProductoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, -1));

        lblID_Producto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto2.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto2.setText("ID Producto");
        bgVentas.add(lblID_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal.setText("Total");
        bgVentas.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, -1));

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

        bgVentas.add(barTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 110, 2));

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

        bgVentas.add(barID_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 2));

        getContentPane().add(bgVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        LoginUI login = new LoginUI();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        bgVentas.setVisible(true);
        bgProductos.setVisible(false);
        bgUsuarios.setVisible(false);
        CrearTablaVentas();
        txtID_Venta.requestFocus();
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        bgVentas.setVisible(false);
        bgProductos.setVisible(true);
        bgUsuarios.setVisible(false);
        CrearTablaProductos();
        txtID_Producto.requestFocus();
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        bgVentas.setVisible(false);
        bgProductos.setVisible(false);
        bgUsuarios.setVisible(true);
        CrearTablaUsuarios();
        txtIDUsuario.requestFocus();
    }//GEN-LAST:event_btnUsuariosMouseClicked
       
    private void btnInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseClicked
        // Codigo
    }//GEN-LAST:event_btnInformacionMouseClicked

    //Botones Ventas 
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
            ID_Producto = Integer.valueOf(txtID_ProductoV.getText());
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
            pst.setInt(1, ID_Producto);
            rs = pst.executeQuery();
            if (rs.next()) {
                precioProd = rs.getInt("precioProducto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
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
            JOptionPane.showMessageDialog(null, "Venta no encontrada");
        }
    }

    private void btnNuevoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoVentaActionPerformed
        if (btnNuevoVenta.getBackground().equals(new java.awt.Color(0, 90, 195))){
            btnNuevoVenta.setBackground(Color.green);
            txtID_Venta.setEnabled(false);
            txtTotal.setEnabled(false);
            txtID_ProductoV.setEnabled(true);
            txtCantidadVenta.setEnabled(true);
            btnAgregarProducto.setEnabled(true);
            btnEditarVenta.setEnabled(false);
            barID_Producto2.setBackground(new java.awt.Color(0, 90, 150));
            barCantidadVenta.setBackground(new java.awt.Color(0, 90, 150));
            barTotal.setBackground(new java.awt.Color(187, 187, 187));
            barID_Venta.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxtVentas();
            ventas.Insertar();
            Buscar(id_Producto);
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
            //Reset Form
            btnNuevoVenta.setBackground(new java.awt.Color(0, 90, 195));
            txtID_Venta.setEnabled(true);
            txtID_ProductoV.setEnabled(false);
            txtCantidadVenta.setEnabled(false);
            btnEditarVenta.setEnabled(true);
            btnCancelarVenta.setEnabled(true);
            barID_Producto2.setBackground(new java.awt.Color(187, 187, 187));
            barCantidadVenta.setBackground(new java.awt.Color(187, 187, 187));
            barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
            vaciarTxtVentas();
        }
    }//GEN-LAST:event_btnNuevoVentaActionPerformed
    
    private void btnEditarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVentaActionPerformed
        String txtid = txtID_Venta.getText().trim();
        String txtotal = txtTotal.getText().trim();
        if (btnEditarVenta.getBackground().equals(new java.awt.Color(0, 90, 195))) {
            if (txtid.equals("")) {
                JOptionPane.showMessageDialog(null, "Escribe un ID");
            } else {
                btnEditarVenta.setBackground(Color.green);
                txtID_Venta.setEnabled(false);
                txtTotal.setEnabled(true);
                id_Producto = Integer.valueOf(txtID_Venta.getText());
                BuscarV(id_Producto);
                barTotal.setBackground(new java.awt.Color(0, 90, 150));
                barID_Venta.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            if (txtotal.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                Total = Integer.valueOf(txtTotal.getText());
                ventas.Modificar(id_Producto, Total);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                //Reset Form
                btnEditarVenta.setBackground(new java.awt.Color(0, 90, 195));
                txtID_Venta.setEnabled(true);
                txtID_ProductoV.setEnabled(false);
                txtCantidadVenta.setEnabled(false);
                txtTotal.setEnabled(false);
                barID_Producto2.setBackground(new java.awt.Color(187, 187, 187));
                barCantidadVenta.setBackground(new java.awt.Color(187, 187, 187));
                barTotal.setBackground(new java.awt.Color(187, 187, 187));
                barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxtVentas();
                CrearTablaVentas();
            }
        }
    }//GEN-LAST:event_btnEditarVentaActionPerformed

    public void InsertarDetalleVenta() {
        int idV = Integer.valueOf(txtID_Venta.getText());
        int idP = Integer.valueOf(txtID_ProductoV.getText());
        int cantidadV = Integer.valueOf(txtCantidadVenta.getText());
        Buscar(idV);
        int subtotal = cantidadV * precioProd;
        try {
            CallableStatement cst = cn.prepareCall("{call agregarDetalleVenta(?,?,?,?)}");
            cst.setInt(1, idV);
            cst.setInt(2, idP);
            cst.setInt(3, cantidadV);
            cst.setInt(4, subtotal);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            CallableStatement cst = cn.prepareCall("{call calcularTotalVenta(?)}");
            cst.setInt(1, idV);
            cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Buscar(idV);
        CrearTablaVentas();
    }
    
    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        InsertarDetalleVenta();
        txtID_ProductoV.setText("");
        txtCantidadVenta.setText("");
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        bgVentas.setVisible(false);
        ResetForms();
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    public void CrearTablaVentas() {
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
    
    public void vaciarTxtVentas() {
        txtID_Venta.setText("");
        txtTotal.setText("");
        txtID_ProductoV.setText("");
        txtCantidadVenta.setText("");
    }

    //Botones Productos
    public void BuscarP(int id) {
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
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        String txtnombre = txtNombre.getText();
        String txtdescripcion = txtDescripcion.getText();
        String txtprecio = txtPrecio.getText().trim();
        String txtcantidad = txtCantidad.getText().trim();
        if (btnNuevoProducto.getBackground().equals(new java.awt.Color(0, 90, 195))) {
            btnNuevoProducto.setBackground(Color.green);
            txtNombre.requestFocus();
            txtNombre.setEnabled(true);
            txtDescripcion.setEnabled(true);
            txtPrecio.setEnabled(true);
            txtCantidad.setEnabled(true);
            txtID_Producto.setEnabled(false);
            btnEliminarProducto.setEnabled(false);
            btnEditarProducto.setEnabled(false);
            barNombre.setBackground(new java.awt.Color(0, 90, 150));
            barDescripcion.setBackground(new java.awt.Color(0, 90, 150));
            barCantidad.setBackground(new java.awt.Color(0, 90, 150));
            barPrecio.setBackground(new java.awt.Color(0, 90, 150));
            barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxtProductos();
        } else {
            if (txtnombre.equals("") || txtdescripcion.equals("") || txtprecio.equals("") || txtcantidad.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                nombre = String.valueOf(txtNombre.getText());
                descripcion = String.valueOf(txtDescripcion.getText());
                precio = Integer.parseInt(txtPrecio.getText());
                cantidad = Integer.parseInt(txtCantidad.getText());
                productos.Insertar(nombre, descripcion, precio, cantidad);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                //Reset Form
                btnNuevoProducto.setBackground(new java.awt.Color(0, 90, 195));
                txtNombre.setEnabled(false);
                txtDescripcion.setEnabled(false);
                txtPrecio.setEnabled(false);
                txtCantidad.setEnabled(false);
                txtID_Producto.setEnabled(true);
                btnEliminarProducto.setEnabled(true);
                btnEditarProducto.setEnabled(true);
                barNombre.setBackground(new java.awt.Color(187, 187, 187));
                barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
                barCantidad.setBackground(new java.awt.Color(187, 187, 187));
                barPrecio.setBackground(new java.awt.Color(187, 187, 187));
                barID_Producto.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxtProductos();
                CrearTablaProductos();
            }
        }
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        String txtid = txtID_Producto.getText().trim();
        if (btnEditarProducto.getBackground().equals(new java.awt.Color(0, 90, 195))) {
            if (txtid.equals("")) {
                JOptionPane.showMessageDialog(null, "Escribe un ID");
            } else {
                id_Producto = Integer.parseInt(txtid);
                BuscarP(id_Producto);
                btnEditarProducto.setBackground(Color.green);
                txtNombre.setEnabled(true);
                txtDescripcion.setEnabled(true);
                txtPrecio.setEnabled(true);
                txtCantidad.setEnabled(true);
                txtID_Producto.setEnabled(false);
                btnEliminarProducto.setEnabled(false);
                btnNuevoProducto.setEnabled(false);
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
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                precio = Integer.parseInt(txtprecio);
                cantidad = Integer.parseInt(txtcantidad);
                nombre = txtNombre.getText().trim();
                descripcion = txtDescripcion.getText().trim();
                productos.Modificar(id_Producto, nombre, descripcion, precio, cantidad);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                //Reset Form
                btnEditarProducto.setBackground(new java.awt.Color(0, 90, 195));
                txtNombre.setEnabled(false);
                txtDescripcion.setEnabled(false);
                txtPrecio.setEnabled(false);
                txtCantidad.setEnabled(false);
                txtID_Producto.setEnabled(true);
                btnEliminarProducto.setEnabled(true);
                btnNuevoProducto.setEnabled(true);
                barNombre.setBackground(new java.awt.Color(187, 187, 187));
                barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
                barCantidad.setBackground(new java.awt.Color(187, 187, 187));
                barPrecio.setBackground(new java.awt.Color(187, 187, 187));
                barID_Producto.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxtProductos();
                CrearTablaProductos();
            }
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        String txtid = txtID_Producto.getText().trim();
        if (btnEliminarProducto.getBackground().equals(new java.awt.Color(0, 90, 195))) {
            if (txtid.equals("")) {
                JOptionPane.showMessageDialog(null, "Escribe un ID");
            } else {
                id_Producto = Integer.parseInt(txtid);
                BuscarP(id_Producto);
                btnEliminarProducto.setBackground(Color.green);
                txtID_Producto.setEnabled(false);
                btnNuevoProducto.setEnabled(false);
                btnEditarProducto.setEnabled(false);
                barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            int estatus = 0;
            productos.Desactivar(id_Producto, estatus);
            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
            //Reset Form
            btnEliminarProducto.setBackground(new java.awt.Color(0, 90, 195));
            txtNombre.setEnabled(false);
            txtDescripcion.setEnabled(false);
            txtPrecio.setEnabled(false);
            txtCantidad.setEnabled(false);
            txtID_Producto.setEnabled(true);
            btnNuevoProducto.setEnabled(true);
            btnEditarProducto.setEnabled(true);
            barNombre.setBackground(new java.awt.Color(187, 187, 187));
            barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
            barCantidad.setBackground(new java.awt.Color(187, 187, 187));
            barPrecio.setBackground(new java.awt.Color(187, 187, 187));
            barID_Producto.setBackground(new java.awt.Color(0, 90, 150));
            vaciarTxtProductos();
            CrearTablaProductos();
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnCancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProductoActionPerformed
        bgProductos.setVisible(false);
        ResetForms();
    }//GEN-LAST:event_btnCancelarProductoActionPerformed
    
    public void CrearTablaProductos() {
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
    
    public void vaciarTxtProductos() {
        txtID_Producto.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
    }
    //Fin Productos

    //Botones Usuarios
    public void BuscarU(int id) {
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
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        String txtnombre = txtUser.getText();
        String txtdescripcion = txtPassword.getText();
        if (btnNuevoUsuario.getBackground().equals(new java.awt.Color(0, 90, 195))) {
            btnNuevoUsuario.setBackground(Color.green);
            txtUser.requestFocus();
            txtUser.setEnabled(true);
            txtPassword.setEnabled(true);
            txtIDUsuario.setEnabled(false);
            btnEliminarUsuario.setEnabled(false);
            btnEditarUsuario.setEnabled(false);
            barUsuario.setBackground(new java.awt.Color(0, 90, 150));
            barPassword.setBackground(new java.awt.Color(0, 90, 150));
            barID_Usuario.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxtUsuarios();
        } else {
            if (txtnombre.equals("") || txtdescripcion.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                String usuario = String.valueOf(txtUser.getText());
                String contrasena = String.valueOf(txtPassword.getText());
                usuarios.Insertar(usuario, contrasena);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                //Reset Form
                btnNuevoUsuario.setBackground(new java.awt.Color(0, 90, 195));
                txtUser.setEnabled(false);
                txtPassword.setEnabled(false);
                txtIDUsuario.setEnabled(true);
                btnEliminarUsuario.setEnabled(true);
                btnEditarUsuario.setEnabled(true);
                barUsuario.setBackground(new java.awt.Color(187, 187, 187));
                barPassword.setBackground(new java.awt.Color(187, 187, 187));
                barID_Usuario.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxtUsuarios();
                CrearTablaUsuarios();
            }
        }
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        String txtid = txtIDUsuario.getText().trim();
        if (btnEditarUsuario.getBackground().equals(new java.awt.Color(0, 90, 195))) {
            if (txtid.equals("")) {
                JOptionPane.showMessageDialog(null, "Escribe un ID");
            } else {
                id_Usuario = Integer.parseInt(txtid);
                BuscarU(id_Usuario);
                btnEditarUsuario.setBackground(Color.green);
                txtUser.setEnabled(true);
                txtPassword.setEnabled(true);
                txtIDUsuario.setEnabled(false);
                btnNuevoUsuario.setEnabled(false);
                btnEliminarUsuario.setEnabled(false);
                barUsuario.setBackground(new java.awt.Color(0, 90, 150));
                barPassword.setBackground(new java.awt.Color(0, 90, 150));
                barID_Usuario.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            String txtUsuario = txtUser.getText();
            String txtContrasena = txtPassword.getText();
            if (txtUsuario.equals("") || txtContrasena.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                usuarios.Modificar(id_Usuario, txtUsuario, txtContrasena);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                //Reset Form
                btnEditarUsuario.setBackground(new java.awt.Color(0, 90, 195));
                txtUser.setEnabled(false);
                txtPassword.setEnabled(false);
                txtIDUsuario.setEnabled(true);
                btnNuevoUsuario.setEnabled(true);
                btnEliminarUsuario.setEnabled(true);
                barUsuario.setBackground(new java.awt.Color(187, 187, 187));
                barPassword.setBackground(new java.awt.Color(187, 187, 187));
                barID_Usuario.setBackground(new java.awt.Color(0, 90, 150));
                vaciarTxtUsuarios();
                CrearTablaUsuarios();
            }
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        String txtid = txtIDUsuario.getText().trim();
        if (btnEliminarUsuario.getBackground().equals(new java.awt.Color(0, 90, 195))) {
            if (txtid.equals("")) {
                JOptionPane.showMessageDialog(null, "Escribe un ID");
            } else {
                id_Usuario = Integer.parseInt(txtid);
                BuscarU(id_Usuario);
                btnEliminarUsuario.setBackground(Color.green);
                txtIDUsuario.setEnabled(false);
                btnNuevoUsuario.setEnabled(false);
                btnEditarUsuario.setEnabled(false);
                barID_Usuario.setBackground(new java.awt.Color(187, 187, 187));
            }
        } else {
            int estatus = 0;
            usuarios.Desactivar(id_Usuario, estatus);
            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
            //Reset Form
            btnEliminarUsuario.setBackground(new java.awt.Color(0, 90, 195));
            txtUser.setEnabled(false);
            txtPassword.setEnabled(false);
            txtIDUsuario.setEnabled(true);
            btnNuevoUsuario.setEnabled(true);
            btnEditarUsuario.setEnabled(true);
            barUsuario.setBackground(new java.awt.Color(187, 187, 187));
            barPassword.setBackground(new java.awt.Color(187, 187, 187));
            barID_Usuario.setBackground(new java.awt.Color(0, 90, 150));
            vaciarTxtUsuarios();
            CrearTablaUsuarios();
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioActionPerformed
        bgUsuarios.setVisible(false);
        ResetForms();
    }//GEN-LAST:event_btnCancelarUsuarioActionPerformed
    
    public void CrearTablaUsuarios() {
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
    
    public void vaciarTxtUsuarios() {
        txtIDUsuario.setText("");
        txtUser.setText("");
        txtPassword.setText("");
    }
    //Fin Usuarios

    public void ResetForms(){
        txtID_Venta.setEnabled(true);
        txtID_ProductoV.setEnabled(false);
        txtCantidadVenta.setEnabled(false);
        txtTotal.setEnabled(false);
        barID_Producto2.setBackground(new java.awt.Color(187, 187, 187));
        barCantidadVenta.setBackground(new java.awt.Color(187, 187, 187));
        barTotal.setBackground(new java.awt.Color(187, 187, 187));
        barID_Venta.setBackground(new java.awt.Color(0, 90, 150));
        btnNuevoVenta.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarVenta.setBackground(new java.awt.Color(0, 90, 195));
        vaciarTxtVentas();

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
        btnNuevoProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarProducto.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminarProducto.setBackground(new java.awt.Color(0, 90, 195));
        vaciarTxtProductos();

        txtUser.setEnabled(false);
        txtPassword.setEnabled(false);
        txtIDUsuario.setEnabled(true);
        barUsuario.setBackground(new java.awt.Color(187, 187, 187));
        barPassword.setBackground(new java.awt.Color(187, 187, 187));
        barID_Usuario.setBackground(new java.awt.Color(0, 90, 150));
        btnNuevoUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarUsuario.setBackground(new java.awt.Color(0, 90, 195));
        btnEliminarUsuario.setBackground(new java.awt.Color(0, 90, 195));
        vaciarTxtUsuarios();
    }

    //Eventos Mouse Entered / Mouse Exited
    private void btnInformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseEntered
        btnInformacion.setForeground(new java.awt.Color(165, 183, 255));
    }//GEN-LAST:event_btnInformacionMouseEntered
    private void btnInformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseExited
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnInformacionMouseExited
    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        btnVentas.setForeground(new java.awt.Color(165, 183, 255));
    }//GEN-LAST:event_btnVentasMouseEntered
    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnVentasMouseExited
    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setForeground(new java.awt.Color(165, 183, 255));
    }//GEN-LAST:event_btnProductosMouseEntered
    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnProductosMouseExited
    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        btnUsuarios.setForeground(new java.awt.Color(165, 183, 255));
    }//GEN-LAST:event_btnUsuariosMouseEntered
    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnUsuariosMouseExited
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(new java.awt.Color(165, 183, 255));
    }//GEN-LAST:event_btnSalirMouseEntered
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseExited
    private void btnCancelarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioMouseEntered
        btnCancelarUsuario.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnCancelarUsuarioMouseEntered
    private void btnCancelarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioMouseExited
        btnCancelarUsuario.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnCancelarUsuarioMouseExited
    private void btnCancelarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarProductoMouseEntered
        btnCancelarProducto.setBackground(new java.awt.Color(0, 90, 150));
    }//GEN-LAST:event_btnCancelarProductoMouseEntered
    private void btnCancelarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarProductoMouseExited
        btnCancelarProducto.setBackground(new java.awt.Color(0, 90, 195));
    }//GEN-LAST:event_btnCancelarProductoMouseExited
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JTable Tabla_Usuarios;
    private javax.swing.JTable Tabla_Ventas;
    private javax.swing.JPanel barCantidad;
    private javax.swing.JPanel barCantidadVenta;
    private javax.swing.JPanel barDescripcion;
    private javax.swing.JPanel barID_Producto;
    private javax.swing.JPanel barID_Producto2;
    private javax.swing.JPanel barID_Usuario;
    private javax.swing.JPanel barID_Venta;
    private javax.swing.JPanel barNombre;
    private javax.swing.JPanel barPassword;
    private javax.swing.JPanel barPrecio;
    private javax.swing.JPanel barProductos;
    private javax.swing.JPanel barSalir;
    private javax.swing.JPanel barTotal;
    private javax.swing.JPanel barUsuario;
    private javax.swing.JPanel barUsuarios;
    private javax.swing.JPanel bgProductos;
    private javax.swing.JPanel bgUsuarios;
    private javax.swing.JPanel bgVentas;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelarProducto;
    private javax.swing.JButton btnCancelarUsuario;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEditarVenta;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JLabel btnInformacion;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnNuevoVenta;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnUsuarios;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadVenta;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID_Producto;
    private javax.swing.JLabel lblID_Producto2;
    private javax.swing.JLabel lblID_Usuario;
    private javax.swing.JLabel lblID_Venta;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lnlNombre;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtID_Producto;
    private javax.swing.JTextField txtID_ProductoV;
    private javax.swing.JTextField txtID_Venta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}