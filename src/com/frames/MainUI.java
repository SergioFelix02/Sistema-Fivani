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
    Sucursales sucursales = new Sucursales();
    Productos productos = new Productos();
    
    String nombreS = "", domicilio = "", nombre = "", descripcion = "", temp = "";
    int id_Sucursal = 0, precio = 0, cantidad = 0, id_Producto = 0;
    int Cantidad = 0, Total = 0, ID_Producto = 0, id_Venta = 0, precioProd = 0, subtotal = 0, iva = 0;
    boolean foundV, foundP, foundS;
    
    public MainUI() {
        initComponents();
        bgVentas.setVisible(false);
        bgProductos.setVisible(false);
        bgSucursales.setVisible(false);
        this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("com/images/Icono.png")).getImage());
        lbl_icon.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("com/images/Icono.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        panel = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        btnProductos = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        btnSucursales = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JLabel();
        barSalir = new javax.swing.JPanel();
        barVentas = new javax.swing.JPanel();
        barProductos = new javax.swing.JPanel();
        barSucursales = new javax.swing.JPanel();
        bgVentas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Ventas = new javax.swing.JTable();
        btnAgregarP = new javax.swing.JButton();
        btnNuevaV = new javax.swing.JButton();
        btnCancelarV = new javax.swing.JButton();
        btnEditarV = new javax.swing.JButton();
        barID_Venta = new javax.swing.JPanel();
        barTotal = new javax.swing.JPanel();
        barSubtotal = new javax.swing.JPanel();
        txtID_Venta = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        lblCantidadVenta = new javax.swing.JLabel();
        lblID_Venta = new javax.swing.JLabel();
        lblID_Producto2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        lblTotal2 = new javax.swing.JLabel();
        cbProductos = new javax.swing.JComboBox<>();
        cbCantidad = new javax.swing.JComboBox<>();
        cbIVA = new javax.swing.JComboBox<>();
        bgProductos = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        btnCancelarP = new javax.swing.JButton();
        btnEditarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        btnNuevoP = new javax.swing.JButton();
        barID_Producto = new javax.swing.JPanel();
        barCantidad = new javax.swing.JPanel();
        barPrecio = new javax.swing.JPanel();
        barDescripcion = new javax.swing.JPanel();
        barNombre = new javax.swing.JPanel();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtID_Producto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        lnlNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblID_Producto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        bgSucursales = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Sucursales = new javax.swing.JTable();
        btnNuevaS = new javax.swing.JButton();
        btnEditarS = new javax.swing.JButton();
        btnEliminarS = new javax.swing.JButton();
        btnCancelarS = new javax.swing.JButton();
        barID_Sucursal = new javax.swing.JPanel();
        barNombreS = new javax.swing.JPanel();
        barDomicilio = new javax.swing.JPanel();
        txtNombreS = new javax.swing.JTextField();
        txtIDSucursal = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        lblID_Sucursal = new javax.swing.JLabel();
        lblNombreS = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Punto de Venta");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 153, 153));

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

        btnSucursales.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSucursales.setForeground(new java.awt.Color(255, 255, 255));
        btnSucursales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSucursales.setText("Sucursales");
        btnSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSucursalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSucursalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSucursalesMouseExited(evt);
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

        barVentas.setBackground(new java.awt.Color(255, 255, 255));
        barVentas.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barVentasLayout = new javax.swing.GroupLayout(barVentas);
        barVentas.setLayout(barVentasLayout);
        barVentasLayout.setHorizontalGroup(
            barVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barVentasLayout.setVerticalGroup(
            barVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        barSucursales.setBackground(new java.awt.Color(255, 255, 255));
        barSucursales.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barSucursalesLayout = new javax.swing.GroupLayout(barSucursales);
        barSucursales.setLayout(barSucursalesLayout);
        barSucursalesLayout.setHorizontalGroup(
            barSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barSucursalesLayout.setVerticalGroup(
            barSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(barVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSucursales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(barSucursales, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
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
                .addComponent(barVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSucursales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnInformacion)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 500));

        bgVentas.setBackground(new java.awt.Color(255, 255, 255));
        bgVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Ventas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        Tabla_Ventas.setSelectionBackground(new java.awt.Color(0, 153, 153));
        Tabla_Ventas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tabla_Ventas.setShowHorizontalLines(false);
        Tabla_Ventas.setShowVerticalLines(false);
        Tabla_Ventas.getTableHeader().setResizingAllowed(false);
        Tabla_Ventas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tabla_Ventas);

        bgVentas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 500, 300));

        btnAgregarP.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarP.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/add_32px.png"))); // NOI18N
        btnAgregarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarP.setEnabled(false);
        btnAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPActionPerformed(evt);
            }
        });
        bgVentas.add(btnAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 40, 40));

        btnNuevaV.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevaV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevaV.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cash_register_32px.png"))); // NOI18N
        btnNuevaV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVActionPerformed(evt);
            }
        });
        bgVentas.add(btnNuevaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 40, 40));

        btnCancelarV.setBackground(new java.awt.Color(0, 153, 153));
        btnCancelarV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarV.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVActionPerformed(evt);
            }
        });
        bgVentas.add(btnCancelarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 40, 40));

        btnEditarV.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarV.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVActionPerformed(evt);
            }
        });
        bgVentas.add(btnEditarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 40, 40));

        barID_Venta.setBackground(new java.awt.Color(204, 204, 204));
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

        bgVentas.add(barTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 110, 2));

        barSubtotal.setBackground(new java.awt.Color(204, 204, 204));
        barSubtotal.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barSubtotalLayout = new javax.swing.GroupLayout(barSubtotal);
        barSubtotal.setLayout(barSubtotalLayout);
        barSubtotalLayout.setHorizontalGroup(
            barSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        barSubtotalLayout.setVerticalGroup(
            barSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgVentas.add(barSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, 2));

        txtID_Venta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Venta.setBorder(null);
        txtID_Venta.setEnabled(false);
        bgVentas.add(txtID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setEnabled(false);
        bgVentas.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 110, -1));

        txtSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSubtotal.setBorder(null);
        txtSubtotal.setEnabled(false);
        bgVentas.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 110, -1));

        lblCantidadVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidadVenta.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidadVenta.setText("Cantidad");
        bgVentas.add(lblCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, -1));

        lblID_Venta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Venta.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Venta.setText("Folio");
        bgVentas.add(lblID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        lblID_Producto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto2.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto2.setText("Producto");
        bgVentas.add(lblID_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal.setText("Total");
        bgVentas.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 100, -1));

        lblTotal1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal1.setText("IVA");
        bgVentas.add(lblTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, -1));

        lblTotal2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal2.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal2.setText("Subtotal");
        bgVentas.add(lblTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 100, -1));

        cbProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbProductos.setEnabled(false);
        cbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductosItemStateChanged(evt);
            }
        });
        bgVentas.add(cbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 30));

        cbCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbCantidad.setEnabled(false);
        bgVentas.add(cbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, 30));

        cbIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1%", "2%", "3%", "4%", "5%", "6%", "7%", "8%", "9%", "10%", "11%", "12%", "13%", "14%", "15%", "16%", "17%", "18%", "19%", "20%" }));
        cbIVA.setEnabled(true);
        cbIVA.setSelectedIndex(16);
        bgVentas.add(cbIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 110, 30));

        getContentPane().add(bgVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 560, 500));

        bgProductos.setBackground(new java.awt.Color(255, 255, 255));
        bgProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Productos.setBackground(new java.awt.Color(255, 255, 255));
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
        Tabla_Productos.setSelectionBackground(new java.awt.Color(0, 153, 153));
        Tabla_Productos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tabla_Productos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabla_Productos.setShowGrid(false);
        Tabla_Productos.getTableHeader().setResizingAllowed(false);
        Tabla_Productos.getTableHeader().setReorderingAllowed(false);
        table.setViewportView(Tabla_Productos);

        bgProductos.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 500, 300));

        btnCancelarP.setBackground(new java.awt.Color(0, 153, 153));
        btnCancelarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarP.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPActionPerformed(evt);
            }
        });
        bgProductos.add(btnCancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 40, 40));

        btnEditarP.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarP.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPActionPerformed(evt);
            }
        });
        bgProductos.add(btnEditarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 40, 40));

        btnEliminarP.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarP.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete_32px.png"))); // NOI18N
        btnEliminarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });
        bgProductos.add(btnEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 40, 40));

        btnNuevoP.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoP.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/product_32px.png"))); // NOI18N
        btnNuevoP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPActionPerformed(evt);
            }
        });
        bgProductos.add(btnNuevoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, 40));

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

        bgProductos.add(barID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 100, 2));

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

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.setEnabled(false);
        bgProductos.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 127, -1));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.setEnabled(false);
        bgProductos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 112, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setEnabled(false);
        bgProductos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 100, -1));

        txtID_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Producto.setBorder(null);
        txtID_Producto.setEnabled(false);
        bgProductos.add(txtID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 100, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.setEnabled(false);
        bgProductos.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 100, -1));

        lnlNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lnlNombre.setForeground(new java.awt.Color(153, 153, 153));
        lnlNombre.setText("Nombre");
        bgProductos.add(lnlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, -1));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        lblDescripcion.setText("Descripcion");
        bgProductos.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 115, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(153, 153, 153));
        lblPrecio.setText("Precio");
        bgProductos.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 112, -1));

        lblID_Producto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto.setText("ID");
        bgProductos.add(lblID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, -1));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidad.setText("Cantidad");
        bgProductos.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 100, -1));

        getContentPane().add(bgProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        bgSucursales.setBackground(new java.awt.Color(255, 255, 255));
        bgSucursales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Tabla_Sucursales.setSelectionBackground(new java.awt.Color(0, 153, 153));
        Tabla_Sucursales.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tabla_Sucursales.setShowGrid(false);
        Tabla_Sucursales.getTableHeader().setResizingAllowed(false);
        Tabla_Sucursales.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla_Sucursales);

        bgSucursales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 500, 300));

        btnNuevaS.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevaS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevaS.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/home_32px.png"))); // NOI18N
        btnNuevaS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSActionPerformed(evt);
            }
        });
        bgSucursales.add(btnNuevaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 40, 40));

        btnEditarS.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarS.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSActionPerformed(evt);
            }
        });
        bgSucursales.add(btnEditarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 40, 40));

        btnEliminarS.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminarS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarS.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete_32px.png"))); // NOI18N
        btnEliminarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSActionPerformed(evt);
            }
        });
        bgSucursales.add(btnEliminarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 40, 40));

        btnCancelarS.setBackground(new java.awt.Color(0, 153, 153));
        btnCancelarS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarS.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSActionPerformed(evt);
            }
        });
        bgSucursales.add(btnCancelarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 40, 40));

        barID_Sucursal.setBackground(new java.awt.Color(204, 204, 204));
        barID_Sucursal.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_SucursalLayout = new javax.swing.GroupLayout(barID_Sucursal);
        barID_Sucursal.setLayout(barID_SucursalLayout);
        barID_SucursalLayout.setHorizontalGroup(
            barID_SucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        barID_SucursalLayout.setVerticalGroup(
            barID_SucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgSucursales.add(barID_Sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 2));

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

        bgSucursales.add(barNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 2));

        barDomicilio.setBackground(new java.awt.Color(204, 204, 204));
        barDomicilio.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barDomicilioLayout = new javax.swing.GroupLayout(barDomicilio);
        barDomicilio.setLayout(barDomicilioLayout);
        barDomicilioLayout.setHorizontalGroup(
            barDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        barDomicilioLayout.setVerticalGroup(
            barDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgSucursales.add(barDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, 2));

        txtNombreS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreS.setBorder(null);
        txtNombreS.setEnabled(false);
        bgSucursales.add(txtNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, -1));

        txtIDSucursal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIDSucursal.setBorder(null);
        txtIDSucursal.setEnabled(false);
        bgSucursales.add(txtIDSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, -1));

        txtDomicilio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDomicilio.setBorder(null);
        txtDomicilio.setEnabled(false);
        bgSucursales.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 270, -1));

        lblID_Sucursal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Sucursal.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Sucursal.setText("ID");
        bgSucursales.add(lblID_Sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        lblNombreS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombreS.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreS.setText("Nombre");
        bgSucursales.add(lblNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 150, -1));

        lblDomicilio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDomicilio.setForeground(new java.awt.Color(153, 153, 153));
        lblDomicilio.setText("Domicilio");
        bgSucursales.add(lblDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, -1));

        getContentPane().add(bgSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 560, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        bgVentas.setVisible(true);
        bgProductos.setVisible(false);
        bgSucursales.setVisible(false);
        barVentas.setBackground(new Color(0,255,0));
        barProductos.setBackground(new Color(255,255,255));
        barSucursales.setBackground(new Color(255,255,255));
        CrearTablaVentas();
        txtID_Venta.requestFocus();
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        bgVentas.setVisible(false);
        bgProductos.setVisible(true);
        bgSucursales.setVisible(false);
        barVentas.setBackground(new Color(255,255,255));
        barProductos.setBackground(new Color(0,255,0));
        barSucursales.setBackground(new Color(255,255,255));
        CrearTablaProductos();
        txtID_Producto.requestFocus();
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSucursalesMouseClicked
        bgVentas.setVisible(false);
        bgProductos.setVisible(false);
        bgSucursales.setVisible(true);
        barVentas.setBackground(new Color(255,255,255));
        barProductos.setBackground(new Color(255,255,255));
        barSucursales.setBackground(new Color(0,255,0));
        CrearTablaSucursales();
        txtIDSucursal.requestFocus();
    }//GEN-LAST:event_btnSucursalesMouseClicked
       
    private void btnInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseClicked
        JOptionPane.showMessageDialog(null, "Hecho por:\n"
                + "Sergio Armando Felix Placencia\n"
                + "Magdiel Moreno Urrea\n"
                + "Cesar Dubois Gutierrez Mendez");
    }//GEN-LAST:event_btnInformacionMouseClicked

    //Botones Ventas 
    public void BuscarVP(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select top 1 * from Ventas order by folio desc");
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("folio");
                subtotal = rs.getInt("subtotal");
                Total = rs.getInt("total");
                txtID_Venta.setText(String.valueOf(id));
                txtTotal.setText(String.valueOf(Total));
                txtSubtotal.setText(String.valueOf(subtotal));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            ID_Producto = getID_Producto();
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
            pst.setInt(1, ID_Producto);
            rs = pst.executeQuery();
            if (rs.next()) {
                precioProd = rs.getInt("precioProducto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecciona un Producto");
        }
    }
    
    public void BuscarV(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Ventas where folio = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("folio");
                Total = rs.getInt("total");
                subtotal = rs.getInt("subtotal");
                txtID_Venta.setText(String.valueOf(id));
                txtTotal.setText(String.valueOf(Total));
                txtSubtotal.setText(String.valueOf(subtotal));
                foundV = true;
            }else{
                foundV = false;
                JOptionPane.showMessageDialog(null, "Venta no encontrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Venta no encontrada");
        }
    }

    
    public void setCbProductos(){
        cbProductos.removeAllItems();
        cbProductos.addItem("Seleccionar");
        try{
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement("select nombreProducto from Productos");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cbProductos.addItem(rs.getString("nombreProducto"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }   
    
    public int getID_Producto(){
        String Producto = String.valueOf(cbProductos.getSelectedItem());
        try{
            PreparedStatement pst = cn.prepareStatement("select idProducto from Productos where nombreProducto = ?");
            pst.setString(1, Producto);
            rs = pst.executeQuery();
            if (rs.next()) {
                id_Producto = rs.getInt("idProducto");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return id_Producto;
    }
    
    public void setCbCantidad(int id){
        cbCantidad.removeAllItems();
        cbCantidad.addItem("Seleccionar");
        try{
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement("select cantidadProducto from Productos where idProducto = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 1; i <= rs.getInt("cantidadProducto"); i++){
                    cbCantidad.addItem(String.valueOf(i));
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public int getCantidad(){
        int cantidad = Integer.parseInt(String.valueOf(cbCantidad.getSelectedItem()));
        return cantidad;
    }

    public int getIva(){
        String str;
        str = String.valueOf(cbIVA.getSelectedItem());
        str = str.substring(0, 2);
        System.out.println(str);
        iva = Integer.valueOf(str);
        return iva;
    }
    
    private void btnNuevaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVActionPerformed
        setCbProductos();
        if (btnNuevaV.getBackground().equals(new java.awt.Color(0, 153, 153))){
            btnNuevaV.setBackground(Color.green);
            txtID_Venta.setEnabled(false);
            txtTotal.setEnabled(false);
            txtSubtotal.setEnabled(false);
            cbProductos.setEnabled(true);
            cbCantidad.setEnabled(true);
            cbIVA.setEnabled(false);
            btnAgregarP.setEnabled(true);
            btnEditarV.setEnabled(false);
            barSubtotal.setBackground(new java.awt.Color(187, 187, 187));
            barTotal.setBackground(new java.awt.Color(187, 187, 187));
            barID_Venta.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxtVentas();
            ventas.Insertar(getIva());
            BuscarVP(getID_Producto());
            System.out.println(id_Producto);
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
            //Reset Form
            ResetVentas();
        }
    }//GEN-LAST:event_btnNuevaVActionPerformed
    
    private void btnEditarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVActionPerformed
        String txtotal = txtTotal.getText().trim();
        if (btnEditarV.getBackground().equals(new java.awt.Color(0, 153, 153))) {
            if (Tabla_Ventas.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una venta");
            } else {
                Object id = Tabla_Ventas.getModel().getValueAt(Tabla_Ventas.getSelectedRow(), 0);
                id_Venta = Integer.parseInt(id.toString());
                BuscarV(id_Venta);
                if (foundV != false){
                    btnEditarV.setBackground(Color.green);
                    txtID_Venta.setEnabled(false);
                    txtTotal.setEnabled(true);
                    txtSubtotal.setEnabled(true);
                    barTotal.setBackground(new java.awt.Color(0, 153, 153));
                    barSubtotal.setBackground(new java.awt.Color(187, 187, 187));
                    barID_Venta.setBackground(new java.awt.Color(187, 187, 187));   
                }else{
                    ResetVentas();
                }
            }
        } else {
            if (txtotal.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                id_Producto = Integer.valueOf(txtID_Venta.getText());
                subtotal = Integer.valueOf(txtSubtotal.getText());
                Total = Integer.valueOf(txtTotal.getText());
                ventas.Modificar(id_Producto, subtotal, getIva(), Total);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                //Reset Form
                ResetVentas();
                CrearTablaVentas();
            }
        }
    }//GEN-LAST:event_btnEditarVActionPerformed

    public void InsertarDetalleVenta() {
        int idV = Integer.valueOf(txtID_Venta.getText());
        int idP = getID_Producto();
        System.out.println(idP);
        int cantidadV = Integer.valueOf(getCantidad());
        BuscarVP(idV);
        int subtotal = cantidadV * precioProd;
        try {
            CallableStatement cst = cn.prepareCall("{call agregarDetalleVenta(?,?,?,?,?,?)}");
            cst.setInt(1, idV);
            cst.setInt(2, idP);
            cst.setInt(3, precioProd);
            cst.setInt(4, cantidadV);
            cst.setInt(5, subtotal);
            cst.setInt(6, 0);
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
        BuscarVP(idV);
        CrearTablaVentas();
    }
    
    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        InsertarDetalleVenta();
        cbProductos.setSelectedIndex(0);
        cbCantidad.setSelectedIndex(0);
        id_Producto = 0;
    }//GEN-LAST:event_btnAgregarPActionPerformed

    private void btnCancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVActionPerformed
        //bgVentas.setVisible(false);
        ResetVentas();
    }//GEN-LAST:event_btnCancelarVActionPerformed

    public void CrearTablaVentas() {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Folio");
            dfm.addColumn("ID Sucursal");
            dfm.addColumn("Subtotal");
            dfm.addColumn("IVA");
            dfm.addColumn("Total");
            dfm.addColumn("Fecha");
            PreparedStatement pst = cn.prepareStatement("select * from Ventas");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("folio"), rs.getInt("idSucursal"), (rs.getInt("subtotal")), (rs.getInt("iva")), (rs.getInt("total")), rs.getDate("fecha")});
            }
            Tabla_Ventas.setModel(dfm);
            DisenarTabla(Tabla_Ventas, 6);  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void vaciarTxtVentas() {
        txtID_Venta.setText("");
        txtTotal.setText("");
        txtSubtotal.setText("");
        cbProductos.setSelectedIndex(0);
        cbCantidad.setSelectedIndex(0);
    }//Fin Ventas
    
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
                txtID_Producto.setText(String.valueOf(id));
                txtNombre.setText(nombre);
                txtDescripcion.setText(descripcion);
                txtPrecio.setText(String.valueOf(precio));
                txtCantidad.setText(String.valueOf(cantidad));
                foundP = true;
            }else{
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
                foundP = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }

    private void btnNuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPActionPerformed
        String txtnombre = txtNombre.getText();
        String txtdescripcion = txtDescripcion.getText();
        String txtprecio = txtPrecio.getText().trim();
        String txtcantidad = txtCantidad.getText().trim();
        if (btnNuevoP.getBackground().equals(new java.awt.Color(0, 153, 153))) {
            btnNuevoP.setBackground(Color.green);
            txtNombre.requestFocus();
            txtNombre.setEnabled(true);
            txtDescripcion.setEnabled(true);
            txtPrecio.setEnabled(true);
            txtCantidad.setEnabled(true);
            txtID_Producto.setEnabled(false);
            btnEliminarP.setEnabled(false);
            btnEditarP.setEnabled(false);
            barNombre.setBackground(new java.awt.Color(0, 153, 153));
            barDescripcion.setBackground(new java.awt.Color(0, 153, 153));
            barCantidad.setBackground(new java.awt.Color(0, 153, 153));
            barPrecio.setBackground(new java.awt.Color(0, 153, 153));
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
                setCbProductos();
                ResetProductos();
                CrearTablaProductos();
            }
        }
    }//GEN-LAST:event_btnNuevoPActionPerformed

    private void btnEditarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPActionPerformed
        if (btnEditarP.getBackground().equals(new java.awt.Color(0, 153, 153))) {
            if (Tabla_Productos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona un producto");
            } else {
                Object id = Tabla_Productos.getModel().getValueAt(Tabla_Productos.getSelectedRow(), 0);
                id_Producto = Integer.parseInt(id.toString());
                BuscarP(id_Producto);
                if (foundP != false){
                    btnEditarP.setBackground(Color.green);
                    txtNombre.setEnabled(true);
                    txtDescripcion.setEnabled(true);
                    txtPrecio.setEnabled(true);
                    txtCantidad.setEnabled(true);
                    txtID_Producto.setEnabled(false);
                    btnEliminarP.setEnabled(false);
                    btnNuevoP.setEnabled(false);
                    barNombre.setBackground(new java.awt.Color(0, 153, 153));
                    barDescripcion.setBackground(new java.awt.Color(0, 153, 153));
                    barCantidad.setBackground(new java.awt.Color(0, 153, 153));
                    barPrecio.setBackground(new java.awt.Color(0, 153, 153));
                    barID_Producto.setBackground(new java.awt.Color(187, 187, 187));
                    System.out.println(Tabla_Productos.getSelectedRow());
                }else{
                    ResetProductos();
                }
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
                ResetProductos();
                CrearTablaProductos();
            }
        }
    }//GEN-LAST:event_btnEditarPActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        if (btnEliminarP.getBackground().equals(new java.awt.Color(0, 153, 153))) {
            if (Tabla_Productos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona un producto");
            } else {
                Object id = Tabla_Productos.getModel().getValueAt(Tabla_Productos.getSelectedRow(), 0);
                id_Producto = Integer.parseInt(id.toString());
                BuscarP(id_Producto);
                if (foundP != false){
                    btnEliminarP.setBackground(Color.green);
                    txtID_Producto.setEnabled(false);
                    btnNuevoP.setEnabled(false);
                    btnEditarP.setEnabled(false);
                    barID_Producto.setBackground(new java.awt.Color(187, 187, 187));       
                }else{
                    ResetProductos();
                }
            }
        } else {
            productos.Desactivar(id_Producto);
            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
            //Reset Form
            ResetProductos();
            CrearTablaProductos();
        }
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        //bgProductos.setVisible(false);
        ResetProductos();
    }//GEN-LAST:event_btnCancelarPActionPerformed
    
    public void CrearTablaProductos() {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("ID");
            dfm.addColumn("Nombre");
            dfm.addColumn("Descripcion");
            dfm.addColumn("Precio");
            dfm.addColumn("Cantidad");
            dfm.addColumn("Estatus");
            PreparedStatement pst = cn.prepareStatement("select * from Productos");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idProducto"), rs.getString("nombreProducto"), rs.getString("descripcionProducto"), (rs.getInt("precioProducto")), (rs.getInt("cantidadProducto")), rs.getInt("estatus")});
            }
            Tabla_Productos.setModel(dfm);
            DisenarTabla(Tabla_Productos, 6);
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
    }//Fin Productos

    //Botones Sucursales
    public void BuscarS(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Sucursales where idSucursal = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idSucursal");
                nombreS = rs.getString("nombre");
                domicilio = rs.getString("domicilio");
                txtIDSucursal.setText(String.valueOf(id));
                txtNombreS.setText(nombreS);
                txtDomicilio.setText(domicilio);
                foundS = true;
            }else{
                foundS = false;
                JOptionPane.showMessageDialog(null, "Sucursal no encontrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sucursal no encontrada");
        }
    }

    private void btnNuevaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSActionPerformed
        String txtnombre = txtNombreS.getText();
        String txtdescripcion = txtDomicilio.getText();
        if (btnNuevaS.getBackground().equals(new java.awt.Color(0, 153, 153))) {
            btnNuevaS.setBackground(Color.green);
            txtNombreS.requestFocus();
            txtNombreS.setEnabled(true);
            txtDomicilio.setEnabled(true);
            txtIDSucursal.setEnabled(false);
            btnEliminarS.setEnabled(false);
            btnEditarS.setEnabled(false);
            barNombreS.setBackground(new java.awt.Color(0, 153, 153));
            barDomicilio.setBackground(new java.awt.Color(0, 153, 153));
            barID_Sucursal.setBackground(new java.awt.Color(187, 187, 187));
            vaciarTxtSucursales();
        } else {
            if (txtnombre.equals("") || txtdescripcion.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                String sucursal = String.valueOf(txtNombreS.getText());
                String domicilio = String.valueOf(txtDomicilio.getText());
                sucursales.Insertar(sucursal, domicilio);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                //Reset Form
                ResetSucursales();
                CrearTablaSucursales();
            }
        }
    }//GEN-LAST:event_btnNuevaSActionPerformed

    private void btnEditarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSActionPerformed
        if (btnEditarS.getBackground().equals(new java.awt.Color(0, 153, 153))) {
            if (Tabla_Sucursales.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una sucursal");
            } else {
                Object id = Tabla_Sucursales.getModel().getValueAt(Tabla_Sucursales.getSelectedRow(), 0);
                id_Sucursal = Integer.parseInt(id.toString());
                BuscarS(id_Sucursal);
                if (foundS != false){
                    btnEditarS.setBackground(Color.green);
                    txtNombreS.setEnabled(true);
                    txtDomicilio.setEnabled(true);
                    txtIDSucursal.setEnabled(false);
                    btnNuevaS.setEnabled(false);
                    btnEliminarS.setEnabled(false);
                    barNombreS.setBackground(new java.awt.Color(0, 153, 153));
                    barDomicilio.setBackground(new java.awt.Color(0, 153, 153));
                    barID_Sucursal.setBackground(new java.awt.Color(187, 187, 187)); 
                }else{
                    ResetSucursales();
                }
            }
        } else {
            String txtSucursal = txtNombreS.getText();
            String txtContrasena = txtDomicilio.getText();
            if (txtSucursal.equals("") || txtContrasena.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                sucursales.Modificar(id_Sucursal, txtSucursal, txtContrasena);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                //Reset Form
                ResetSucursales();
                CrearTablaSucursales();
            }
        }
    }//GEN-LAST:event_btnEditarSActionPerformed

    private void btnEliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSActionPerformed
        if (btnEliminarS.getBackground().equals(new java.awt.Color(0, 153, 153))) {
            if (Tabla_Sucursales.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una sucursal");
            } else {
                Object id = Tabla_Sucursales.getModel().getValueAt(Tabla_Sucursales.getSelectedRow(), 0);
                id_Sucursal = Integer.parseInt(id.toString());
                BuscarS(id_Sucursal);
                if (foundS != false){
                    btnEliminarS.setBackground(Color.green);
                    txtIDSucursal.setEnabled(false);
                    btnNuevaS.setEnabled(false);
                    btnEditarS.setEnabled(false);
                    barID_Sucursal.setBackground(new java.awt.Color(187, 187, 187));      
                }else{
                    ResetSucursales();
                }
            }
        } else {
            sucursales.Desactivar(id_Sucursal);
            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
            //Reset Form
            ResetSucursales();
            CrearTablaSucursales();
        }
    }//GEN-LAST:event_btnEliminarSActionPerformed

    private void btnCancelarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSActionPerformed
        ResetSucursales();
    }//GEN-LAST:event_btnCancelarSActionPerformed
    
    public void CrearTablaSucursales() {
        try {
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("ID");
            dfm.addColumn("Nombre");
            dfm.addColumn("Domicilio");
            dfm.addColumn("Estatus");
            PreparedStatement pst = cn.prepareStatement("select * from Sucursales");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idSucursal"), rs.getString("nombre"), rs.getString("domicilio"), rs.getInt("estatus")});
            }
            Tabla_Sucursales.setModel(dfm);
            DisenarTabla(Tabla_Sucursales, 4);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void vaciarTxtSucursales() {
        txtIDSucursal.setText("");
        txtNombreS.setText("");
        txtDomicilio.setText("");
    }//Fin Sucursales

    public void DisenarTabla(JTable table, int x){
        table.getTableHeader().setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(0, 153, 153));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.setRowHeight(25);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for(int i = 0; i < x; i++){
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    public void ResetVentas(){
        //txtID_Venta.setEnabled(true);
        cbCantidad.setEnabled(false);
        cbIVA.setEnabled(true);
        txtTotal.setEnabled(false);
        txtSubtotal.setEnabled(false);
        cbProductos.setEnabled(false);
        btnEditarV.setEnabled(true);
        barSubtotal.setBackground(new java.awt.Color(187, 187, 187));
        barTotal.setBackground(new java.awt.Color(187, 187, 187));        
        //barID_Venta.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevaV.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarV.setBackground(new java.awt.Color(0, 153, 153));
        cbIVA.setSelectedIndex(16);
        CrearTablaVentas();
        vaciarTxtVentas(); 
    }
    public void ResetProductos(){
        txtNombre.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCantidad.setEnabled(false);
        //txtID_Producto.setEnabled(true);                                                           
        btnNuevoP.setEnabled(true);
        btnEditarP.setEnabled(true);
        btnEliminarP.setEnabled(true);
        barNombre.setBackground(new java.awt.Color(187, 187, 187));
        barDescripcion.setBackground(new java.awt.Color(187, 187, 187));
        barCantidad.setBackground(new java.awt.Color(187, 187, 187));
        barPrecio.setBackground(new java.awt.Color(187, 187, 187));
        //barID_Producto.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevoP.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarP.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminarP.setBackground(new java.awt.Color(0, 153, 153));
        CrearTablaProductos();
        vaciarTxtProductos();
    }
    public void ResetSucursales(){
        txtNombreS.setEnabled(false);
        txtDomicilio.setEnabled(false);
        //txtIDSucursal.setEnabled(true);
        btnNuevaS.setEnabled(true);
        btnEditarS.setEnabled(true);
        btnEliminarS.setEnabled(true);
        barNombreS.setBackground(new java.awt.Color(187, 187, 187));
        barDomicilio.setBackground(new java.awt.Color(187, 187, 187));
        //barID_Sucursal.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevaS.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarS.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminarS.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminarS.setBackground(new java.awt.Color(0, 153, 153));
        CrearTablaSucursales();
        vaciarTxtSucursales();
    }
    
    //Eventos Mouse Entered / Mouse Exited
    private void btnInformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseEntered
        btnInformacion.setForeground(new java.awt.Color(165, 183, 255));
    }//GEN-LAST:event_btnInformacionMouseEntered
    private void btnInformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseExited
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnInformacionMouseExited
    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        btnVentas.setForeground(new java.awt.Color(0, 255, 0));
    }//GEN-LAST:event_btnVentasMouseEntered
    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnVentasMouseExited
    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setForeground(new java.awt.Color(0, 255, 0));
    }//GEN-LAST:event_btnProductosMouseEntered
    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnProductosMouseExited
    private void btnSucursalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSucursalesMouseEntered
        btnSucursales.setForeground(new java.awt.Color(0, 255, 0));
    }//GEN-LAST:event_btnSucursalesMouseEntered
    private void btnSucursalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSucursalesMouseExited
        btnSucursales.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnSucursalesMouseExited
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(new java.awt.Color(0, 255, 0));
    }//GEN-LAST:event_btnSalirMouseEntered
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseExited

    private void cbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductosItemStateChanged
        if (cbProductos.getSelectedIndex() == 0){
            //
        }else{
            setCbCantidad(getID_Producto());
        }
    }//GEN-LAST:event_cbProductosItemStateChanged
 
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
    private javax.swing.JTable Tabla_Sucursales;
    private javax.swing.JTable Tabla_Ventas;
    private javax.swing.JPanel barCantidad;
    private javax.swing.JPanel barDescripcion;
    private javax.swing.JPanel barDomicilio;
    private javax.swing.JPanel barID_Producto;
    private javax.swing.JPanel barID_Sucursal;
    private javax.swing.JPanel barID_Venta;
    private javax.swing.JPanel barNombre;
    private javax.swing.JPanel barNombreS;
    private javax.swing.JPanel barPrecio;
    private javax.swing.JPanel barProductos;
    private javax.swing.JPanel barSalir;
    private javax.swing.JPanel barSubtotal;
    private javax.swing.JPanel barSucursales;
    private javax.swing.JPanel barTotal;
    private javax.swing.JPanel barVentas;
    private javax.swing.JPanel bgProductos;
    private javax.swing.JPanel bgSucursales;
    private javax.swing.JPanel bgVentas;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnCancelarS;
    private javax.swing.JButton btnCancelarV;
    private javax.swing.JButton btnEditarP;
    private javax.swing.JButton btnEditarS;
    private javax.swing.JButton btnEditarV;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnEliminarS;
    private javax.swing.JLabel btnInformacion;
    private javax.swing.JButton btnNuevaS;
    private javax.swing.JButton btnNuevaV;
    private javax.swing.JButton btnNuevoP;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSucursales;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JComboBox<String> cbCantidad;
    private javax.swing.JComboBox<String> cbIVA;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadVenta;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblID_Producto;
    private javax.swing.JLabel lblID_Producto2;
    private javax.swing.JLabel lblID_Sucursal;
    private javax.swing.JLabel lblID_Venta;
    private javax.swing.JLabel lblNombreS;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal2;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lnlNombre;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtIDSucursal;
    private javax.swing.JTextField txtID_Producto;
    private javax.swing.JTextField txtID_Venta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreS;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}