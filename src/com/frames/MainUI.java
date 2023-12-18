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
    Reportes reportes = new Reportes();

    int ID_Sucursal = 0, ID_Producto = 0, precioProd = 0;
    boolean foundV, foundP, foundS;

    public MainUI() {
        initComponents();
        bgVentas.setVisible(false);
        bgProductos.setVisible(false);
        bgSucursales.setVisible(false);
        bgReportes.setVisible(false);
        setCbSucursales(cbSucursales);
        if (cbSucursales.getItemAt(1) != null) {
            cbSucursales.setSelectedIndex(1);
        }
        ((JLabel) cbSucursales.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("com/images/Icono.png")).getImage());
        lbl_icon.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("com/images/Icono.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }

    //Inicio InitComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        btnProductos = new javax.swing.JLabel();
        btnSucursales = new javax.swing.JLabel();
        btnReportes = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JLabel();
        barVentas = new javax.swing.JPanel();
        barProductos = new javax.swing.JPanel();
        barSucursales = new javax.swing.JPanel();
        barReportes = new javax.swing.JPanel();
        barSalir = new javax.swing.JPanel();
        cbSucursales = new javax.swing.JComboBox<>();
        bgReportes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Reportes = new javax.swing.JTable();
        txtFecha_Inicio = new com.toedter.calendar.JDateChooser();
        txtFecha_Fin = new com.toedter.calendar.JDateChooser();
        lblFecha_Inicio = new javax.swing.JLabel();
        lblFecha_Fin = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox<>();
        cbFolio = new javax.swing.JComboBox<>();
        btnReporte1 = new javax.swing.JButton();
        btnReporte2 = new javax.swing.JButton();
        btnReporte3 = new javax.swing.JButton();
        btnReporte4 = new javax.swing.JButton();
        btnCheck2 = new javax.swing.JButton();
        btnCheck3 = new javax.swing.JButton();
        btnCheck4 = new javax.swing.JButton();
        btnCancelarR = new javax.swing.JButton();
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
        txtID_Sucursal = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        lblID_Sucursal = new javax.swing.JLabel();
        lblNombreS = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        CheckBoxS = new javax.swing.JCheckBox();
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
        CheckBoxP = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Punto de Venta");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 153, 153));

        lbl_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon.setPreferredSize(new java.awt.Dimension(100, 100));

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

        btnReportes.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReportes.setText("Reportes");
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
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

        barReportes.setBackground(new java.awt.Color(255, 255, 255));
        barReportes.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barReportesLayout = new javax.swing.GroupLayout(barReportes);
        barReportes.setLayout(barReportesLayout);
        barReportesLayout.setHorizontalGroup(
            barReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barReportesLayout.setVerticalGroup(
            barReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

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

        cbSucursales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSucursales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(barSucursales, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbSucursales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
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
                .addComponent(btnReportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cbSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInformacion)
                .addContainerGap())
        );

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 500));

        bgReportes.setBackground(new java.awt.Color(255, 255, 255));
        bgReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Reportes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tabla_Reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Reportes.setSelectionBackground(new java.awt.Color(0, 153, 153));
        Tabla_Reportes.getTableHeader().setResizingAllowed(false);
        Tabla_Reportes.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Tabla_Reportes);

        bgReportes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 540, 300));

        txtFecha_Inicio.setEnabled(false);
        bgReportes.add(txtFecha_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, -1));

        txtFecha_Fin.setEnabled(false);
        bgReportes.add(txtFecha_Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, -1));

        lblFecha_Inicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFecha_Inicio.setForeground(new java.awt.Color(153, 153, 153));
        lblFecha_Inicio.setText("Fecha Inicio");
        bgReportes.add(lblFecha_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        lblFecha_Fin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFecha_Fin.setForeground(new java.awt.Color(153, 153, 153));
        lblFecha_Fin.setText("Fecha Fin");
        bgReportes.add(lblFecha_Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 110, -1));

        lblFolio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFolio.setForeground(new java.awt.Color(153, 153, 153));
        lblFolio.setText("Folio");
        bgReportes.add(lblFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, -1));

        lblSucursal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSucursal.setForeground(new java.awt.Color(153, 153, 153));
        lblSucursal.setText("Sucursal");
        bgReportes.add(lblSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, -1));

        cbSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbSucursal.setEnabled(false);
        bgReportes.add(cbSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, 30));

        cbFolio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbFolio.setEnabled(false);
        bgReportes.add(cbFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 30));

        btnReporte1.setBackground(new java.awt.Color(0, 153, 153));
        btnReporte1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte1.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte1.setText("Productos Mas Vendidos");
        btnReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 210, 30));

        btnReporte2.setBackground(new java.awt.Color(0, 153, 153));
        btnReporte2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte2.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte2.setText("Reporte de Venta (Folio)");
        btnReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte2ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 210, 30));

        btnReporte3.setBackground(new java.awt.Color(0, 153, 153));
        btnReporte3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte3.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte3.setText("Total de Ventas (Sucursal)");
        btnReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte3ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 210, 30));

        btnReporte4.setBackground(new java.awt.Color(0, 153, 153));
        btnReporte4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte4.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte4.setText("Total de Ventas (Generales)");
        btnReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte4ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 210, 30));

        btnCheck2.setBackground(new java.awt.Color(0, 153, 153));
        btnCheck2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/checked_checkbox_32px.png"))); // NOI18N
        btnCheck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheck2ActionPerformed(evt);
            }
        });
        bgReportes.add(btnCheck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 30, 30));

        btnCheck3.setBackground(new java.awt.Color(0, 153, 153));
        btnCheck3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/checked_checkbox_32px.png"))); // NOI18N
        btnCheck3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheck3ActionPerformed(evt);
            }
        });
        bgReportes.add(btnCheck3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 30, 30));

        btnCheck4.setBackground(new java.awt.Color(0, 153, 153));
        btnCheck4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/checked_checkbox_32px.png"))); // NOI18N
        btnCheck4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheck4ActionPerformed(evt);
            }
        });
        bgReportes.add(btnCheck4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 30, 30));

        btnCancelarR.setBackground(new java.awt.Color(0, 153, 153));
        btnCancelarR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarR.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRActionPerformed(evt);
            }
        });
        bgReportes.add(btnCancelarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, 40));

        getContentPane().add(bgReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 600, 500));

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
        Tabla_Ventas.getTableHeader().setResizingAllowed(false);
        Tabla_Ventas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tabla_Ventas);

        bgVentas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 540, 300));

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
        bgVentas.add(btnAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 40, 40));

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
        bgVentas.add(btnNuevaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 40, 40));

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
        bgVentas.add(btnCancelarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 40, 40));

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
        bgVentas.add(btnEditarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 40, 40));

        barID_Venta.setBackground(new java.awt.Color(204, 204, 204));
        barID_Venta.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_VentaLayout = new javax.swing.GroupLayout(barID_Venta);
        barID_Venta.setLayout(barID_VentaLayout);
        barID_VentaLayout.setHorizontalGroup(
            barID_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barID_VentaLayout.setVerticalGroup(
            barID_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgVentas.add(barID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 2));

        barTotal.setBackground(new java.awt.Color(204, 204, 204));
        barTotal.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barTotalLayout = new javax.swing.GroupLayout(barTotal);
        barTotal.setLayout(barTotalLayout);
        barTotalLayout.setHorizontalGroup(
            barTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        barTotalLayout.setVerticalGroup(
            barTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgVentas.add(barTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 120, 2));

        barSubtotal.setBackground(new java.awt.Color(204, 204, 204));
        barSubtotal.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barSubtotalLayout = new javax.swing.GroupLayout(barSubtotal);
        barSubtotal.setLayout(barSubtotalLayout);
        barSubtotalLayout.setHorizontalGroup(
            barSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        barSubtotalLayout.setVerticalGroup(
            barSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgVentas.add(barSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 120, 2));

        txtID_Venta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Venta.setBorder(null);
        txtID_Venta.setEnabled(false);
        bgVentas.add(txtID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setEnabled(false);
        bgVentas.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 120, -1));

        txtSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSubtotal.setBorder(null);
        txtSubtotal.setEnabled(false);
        bgVentas.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 120, -1));

        lblCantidadVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidadVenta.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidadVenta.setText("Cantidad");
        bgVentas.add(lblCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, -1));

        lblID_Venta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Venta.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Venta.setText("Folio");
        bgVentas.add(lblID_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        lblID_Producto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto2.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto2.setText("Producto");
        bgVentas.add(lblID_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal.setText("Total");
        bgVentas.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 110, -1));

        lblTotal1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal1.setText("IVA");
        bgVentas.add(lblTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 100, -1));

        lblTotal2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal2.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal2.setText("Subtotal");
        bgVentas.add(lblTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 110, -1));

        cbProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbProductos.setEnabled(false);
        cbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductosItemStateChanged(evt);
            }
        });
        bgVentas.add(cbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        cbCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbCantidad.setEnabled(false);
        bgVentas.add(cbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, 30));

        cbIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1%", "2%", "3%", "4%", "5%", "6%", "7%", "8%", "9%", "10%", "11%", "12%", "13%", "14%", "15%", "16%", "17%", "18%", "19%", "20%" }));
        cbIVA.setSelectedIndex(16);
        bgVentas.add(cbIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 30));

        getContentPane().add(bgVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 600, 500));

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
        Tabla_Sucursales.setShowGrid(false);
        Tabla_Sucursales.getTableHeader().setResizingAllowed(false);
        Tabla_Sucursales.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla_Sucursales);

        bgSucursales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 540, 280));

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
        bgSucursales.add(btnNuevaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 40, 40));

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
        bgSucursales.add(btnEditarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 40, 40));

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
        bgSucursales.add(btnEliminarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 40, 40));

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
        bgSucursales.add(btnCancelarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 40, 40));

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

        txtID_Sucursal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_Sucursal.setBorder(null);
        txtID_Sucursal.setEnabled(false);
        bgSucursales.add(txtID_Sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, -1));

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

        CheckBoxS.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBoxS.setForeground(new java.awt.Color(102, 102, 102));
        CheckBoxS.setText("Mostrar Todo");
        CheckBoxS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSActionPerformed(evt);
            }
        });
        bgSucursales.add(CheckBoxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        getContentPane().add(bgSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 600, 500));

        bgProductos.setBackground(new java.awt.Color(255, 255, 255));
        bgProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Tabla_Productos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabla_Productos.setShowGrid(false);
        Tabla_Productos.getTableHeader().setResizingAllowed(false);
        Tabla_Productos.getTableHeader().setReorderingAllowed(false);
        table.setViewportView(Tabla_Productos);

        bgProductos.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 540, 280));

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
        bgProductos.add(btnCancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 40, 40));

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
        bgProductos.add(btnEditarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 40, 40));

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
        bgProductos.add(btnEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 40, 40));

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
        bgProductos.add(btnNuevoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 40, 40));

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

        bgProductos.add(barCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 100, 2));

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

        bgProductos.add(barPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 112, 2));

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

        bgProductos.add(barDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 127, 2));

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
        bgProductos.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 127, -1));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.setEnabled(false);
        bgProductos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 112, -1));

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
        bgProductos.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 100, -1));

        lnlNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lnlNombre.setForeground(new java.awt.Color(153, 153, 153));
        lnlNombre.setText("Nombre");
        bgProductos.add(lnlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, -1));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        lblDescripcion.setText("Descripcion");
        bgProductos.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 115, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(153, 153, 153));
        lblPrecio.setText("Precio");
        bgProductos.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 112, -1));

        lblID_Producto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_Producto.setForeground(new java.awt.Color(153, 153, 153));
        lblID_Producto.setText("ID");
        bgProductos.add(lblID_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, -1));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidad.setText("Cantidad");
        bgProductos.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 100, -1));

        CheckBoxP.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBoxP.setForeground(new java.awt.Color(102, 102, 102));
        CheckBoxP.setText("Mostrar Todo");
        CheckBoxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPActionPerformed(evt);
            }
        });
        bgProductos.add(CheckBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        getContentPane().add(bgProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Fin InitComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        bgVentas.setVisible(true);
        bgProductos.setVisible(false);
        bgSucursales.setVisible(false);
        bgReportes.setVisible(false);
        barVentas.setBackground(new Color(0, 255, 0));
        barProductos.setBackground(new Color(255, 255, 255));
        barSucursales.setBackground(new Color(255, 255, 255));
        barReportes.setBackground(new Color(255, 255, 255));
        ventas.CrearTabla(Tabla_Ventas);
        setCbProductos();
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        bgVentas.setVisible(false);
        bgProductos.setVisible(true);
        bgSucursales.setVisible(false);
        bgReportes.setVisible(false);
        barVentas.setBackground(new Color(255, 255, 255));
        barProductos.setBackground(new Color(0, 255, 0));
        barSucursales.setBackground(new Color(255, 255, 255));
        barReportes.setBackground(new Color(255, 255, 255));
        productos.CrearTabla(Tabla_Productos, CheckBoxP);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSucursalesMouseClicked
        bgVentas.setVisible(false);
        bgProductos.setVisible(false);
        bgSucursales.setVisible(true);
        bgReportes.setVisible(false);
        barVentas.setBackground(new Color(255, 255, 255));
        barProductos.setBackground(new Color(255, 255, 255));
        barSucursales.setBackground(new Color(0, 255, 0));
        barReportes.setBackground(new Color(255, 255, 255));
        sucursales.CrearTabla(Tabla_Sucursales, CheckBoxS);
    }//GEN-LAST:event_btnSucursalesMouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        bgVentas.setVisible(false);
        bgProductos.setVisible(false);
        bgSucursales.setVisible(false);
        bgReportes.setVisible(true);
        barVentas.setBackground(new Color(255, 255, 255));
        barProductos.setBackground(new Color(255, 255, 255));
        barSucursales.setBackground(new Color(255, 255, 255));
        barReportes.setBackground(new Color(0, 255, 0));
        setCbSucursales(cbSucursal);
        setCbFolio();
    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseClicked
        JOptionPane.showMessageDialog(null, "Hecho por:\n"
                + "Sergio Armando Felix Placencia\n"
                + "Magdiel Moreno Urrea\n"
                + "Cesar Dubois Gutierrez Mendez");
    }//GEN-LAST:event_btnInformacionMouseClicked

    //Ventas 
    public void BuscarVP(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select top 1 * from Ventas order by folio desc");
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("folio");
                int subtotal = rs.getInt("subtotal");
                int Total = rs.getInt("total");
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
                int Total = rs.getInt("total");
                int subtotal = rs.getInt("subtotal");
                txtID_Venta.setText(String.valueOf(id));
                txtTotal.setText(String.valueOf(Total));
                txtSubtotal.setText(String.valueOf(subtotal));
                foundV = true;
            } else {
                foundV = false;
                JOptionPane.showMessageDialog(null, "Venta no encontrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Venta no encontrada");
        }
    }

    private void btnNuevaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVActionPerformed
        if (btnNuevaV.getBackground().equals(new Color(0,153,153))) { //Iniciar Nueva
            btnNuevaV.setBackground(new Color(0, 220, 0));
            txtID_Venta.setEnabled(false);
            txtTotal.setEnabled(false);
            txtSubtotal.setEnabled(false);
            cbProductos.setEnabled(true);
            cbCantidad.setEnabled(true);
            cbIVA.setEnabled(false);
            btnAgregarP.setEnabled(true);
            btnEditarV.setEnabled(false);
            barSubtotal.setBackground(new Color(187, 187, 187));
            barTotal.setBackground(new Color(187, 187, 187));
            barID_Venta.setBackground(new Color(187, 187, 187));
            if (getID_Sucursal(cbSucursales) == 0) {
                ResetVentas();
                JOptionPane.showMessageDialog(null, "Selecciona una sucursal");
            } else {
                ventas.Insertar(getID_Sucursal(cbSucursales), getIva());
                BuscarVP(getID_Producto());
            }
        } else { //Confirmar Nueva
            String subtotal = txtSubtotal.getText();
            if (subtotal.equals("0")) {
                JOptionPane.showMessageDialog(null, "Añade un producto");
            } else {
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                ID_Sucursal = 0;
                ResetVentas();
            }
        }
    }//GEN-LAST:event_btnNuevaVActionPerformed

    private void btnEditarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVActionPerformed
        if (btnEditarV.getBackground().equals(new Color(0,153,153))) { //Iniciar Editar
            if (Tabla_Ventas.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una venta");
            } else {
                Object id = Tabla_Ventas.getModel().getValueAt(Tabla_Ventas.getSelectedRow(), 0);
                int idV = Integer.parseInt(id.toString());
                BuscarV(idV);
                if (foundV != false) {
                    btnEditarV.setBackground(new Color(0, 220, 0));
                    txtID_Venta.setEnabled(false);
                    txtTotal.setEnabled(true);
                    txtSubtotal.setEnabled(true);
                    barTotal.setBackground(new Color(0,153,153));
                    barSubtotal.setBackground(new Color(187, 187, 187));
                    barID_Venta.setBackground(new Color(187, 187, 187));
                } else {
                    ResetVentas();
                }
            }
        } else { //Confirmar Editar
            String txtotal = txtTotal.getText().trim();
            if (txtotal.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                try {
                    int idV = Integer.valueOf(txtID_Venta.getText());
                    int subtotal = Integer.valueOf(txtSubtotal.getText());
                    int total = Integer.valueOf(txtTotal.getText());
                    ventas.Modificar(idV, subtotal, getIva(), total);
                    JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos");
                }
                ResetVentas();
            }
        }
    }//GEN-LAST:event_btnEditarVActionPerformed

    public void InsertarDetalleVenta() {
        int idV = Integer.valueOf(txtID_Venta.getText());
        int idP = getID_Producto();
        int cantidadV = getCantidad();
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
        productos.Vendido(idP, cantidadV);
        BuscarVP(idV);
        ventas.CrearTabla(Tabla_Ventas);
    }

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        if (cbProductos.getSelectedIndex() == 0 || cbCantidad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un producto y cantidad");
        } else {
            InsertarDetalleVenta();
            cbProductos.setSelectedIndex(0);
            cbCantidad.setSelectedIndex(0);
            ID_Producto = 0;
        }
    }//GEN-LAST:event_btnAgregarPActionPerformed

    public void setCbProductos() {
        cbProductos.removeAllItems();
        cbProductos.addItem("Seleccionar");
        try {
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement("select nombreProducto, descripcionProducto from Productos where estatus = 1");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cbProductos.addItem(rs.getString("nombreProducto"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int getID_Producto() {
        String Producto = String.valueOf(cbProductos.getSelectedItem());
        try {
            PreparedStatement pst = cn.prepareStatement("select idProducto from Productos where nombreProducto = ?");
            pst.setString(1, Producto);
            rs = pst.executeQuery();
            if (rs.next()) {
                ID_Producto = rs.getInt("idProducto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ID_Producto;
    }

    public void setCbCantidad(int id) {
        cbCantidad.removeAllItems();
        cbCantidad.addItem("Seleccionar");
        try {
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement("select cantidadProducto from Productos where idProducto = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 1; i <= rs.getInt("cantidadProducto"); i++) {
                    cbCantidad.addItem(String.valueOf(i));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int getCantidad() {
        int cantidad = Integer.parseInt(String.valueOf(cbCantidad.getSelectedItem()));
        return cantidad;
    }

    public int getIva() {
        String str;
        str = String.valueOf(cbIVA.getSelectedItem());
        str = str.substring(0, str.length() - 1);
        int iva = Integer.valueOf(str);
        return iva;
    }

    private void btnCancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVActionPerformed
        ResetVentas();
    }//GEN-LAST:event_btnCancelarVActionPerformed
    //Fin Ventas

    //Productos
    public void BuscarP(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Productos where idProducto = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                ID_Producto = rs.getInt("idProducto");
                String nombre = rs.getString("nombreProducto");
                String descripcion = rs.getString("descripcionProducto");
                int precio = rs.getInt("precioProducto");
                int cantidad = rs.getInt("cantidadProducto");
                txtID_Producto.setText(String.valueOf(ID_Producto));
                txtNombre.setText(nombre);
                txtDescripcion.setText(descripcion);
                txtPrecio.setText(String.valueOf(precio));
                txtCantidad.setText(String.valueOf(cantidad));
                foundP = true;
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
                foundP = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }

    private void btnNuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPActionPerformed
        if (btnNuevoP.getBackground().equals(new Color(0,153,153))) { //Iniciar Nuevo
            btnNuevoP.setBackground(new Color(0, 220, 0));
            txtNombre.requestFocus();
            txtNombre.setEnabled(true);
            txtDescripcion.setEnabled(true);
            txtPrecio.setEnabled(true);
            txtCantidad.setEnabled(true);
            txtID_Producto.setEnabled(false);
            btnEliminarP.setEnabled(false);
            btnEditarP.setEnabled(false);
            barNombre.setBackground(new Color(0,153,153));
            barDescripcion.setBackground(new Color(0,153,153));
            barCantidad.setBackground(new Color(0,153,153));
            barPrecio.setBackground(new Color(0,153,153));
            barID_Producto.setBackground(new Color(187, 187, 187));
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
        if (btnEditarP.getBackground().equals(new Color(0,153,153))) {
            if (Tabla_Productos.getSelectedRow() == -1) { //Iniciar Editar
                JOptionPane.showMessageDialog(null, "Selecciona un producto");
            } else {
                Object id = Tabla_Productos.getModel().getValueAt(Tabla_Productos.getSelectedRow(), 0);
                int idP = Integer.parseInt(id.toString());
                BuscarP(idP);
                if (foundP != false) {
                    btnEditarP.setBackground(new Color(0, 220, 0));
                    txtNombre.setEnabled(true);
                    txtDescripcion.setEnabled(true);
                    txtPrecio.setEnabled(true);
                    txtCantidad.setEnabled(true);
                    txtID_Producto.setEnabled(false);
                    btnEliminarP.setEnabled(false);
                    btnNuevoP.setEnabled(false);
                    barNombre.setBackground(new Color(0,153,153));
                    barDescripcion.setBackground(new Color(0,153,153));
                    barCantidad.setBackground(new Color(0,153,153));
                    barPrecio.setBackground(new Color(0,153,153));
                    barID_Producto.setBackground(new Color(187, 187, 187));
                } else {
                    ResetProductos();
                }
            }
        } else { //Confirmar Editar
            String txtnombre = txtNombre.getText();
            String txtdescripcion = txtDescripcion.getText();
            String txtprecio = txtPrecio.getText().trim();
            String txtcantidad = txtCantidad.getText().trim();
            if (txtnombre.equals("") || txtdescripcion.equals("") || txtprecio.equals("") || txtcantidad.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                try {
                    int precio = Integer.parseInt(txtprecio);
                    int cantidad = Integer.parseInt(txtcantidad);
                    String nombre = txtNombre.getText().trim();
                    String descripcion = txtDescripcion.getText().trim();
                    productos.Modificar(ID_Producto, nombre, descripcion, precio, cantidad);
                    JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos");
                }
                ResetProductos();
            }
        }
    }//GEN-LAST:event_btnEditarPActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        if (btnEliminarP.getBackground().equals(new Color(0,153,153))) { //Iniciar Eliminar
            if (Tabla_Productos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona un producto");
            } else {
                Object id = Tabla_Productos.getModel().getValueAt(Tabla_Productos.getSelectedRow(), 0);
                int idP = Integer.parseInt(id.toString());
                BuscarP(idP);
                if (foundP != false) {
                    btnEliminarP.setBackground(new Color(0, 220, 0));
                    txtID_Producto.setEnabled(false);
                    btnNuevoP.setEnabled(false);
                    btnEditarP.setEnabled(false);
                    barID_Producto.setBackground(new Color(187, 187, 187));
                } else {
                    ResetProductos();
                }
            }
        } else { //Confirmar Eliminar
            productos.Desactivar(ID_Producto);
            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
            ResetProductos();
        }
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        ResetProductos();
    }//GEN-LAST:event_btnCancelarPActionPerformed
    //Fin Productos

    //Sucursales     
    public void BuscarS(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Sucursales where idSucursal = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                ID_Sucursal = rs.getInt("idSucursal");
                String nombre = rs.getString("nombre");
                String domicilio = rs.getString("domicilio");
                txtID_Sucursal.setText(String.valueOf(ID_Sucursal));
                txtNombreS.setText(nombre);
                txtDomicilio.setText(domicilio);
                foundS = true;
            } else {
                foundS = false;
                JOptionPane.showMessageDialog(null, "Sucursal no encontrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sucursal no encontrada");
        }
    }

    private void btnNuevaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSActionPerformed
        if (btnNuevaS.getBackground().equals(new Color(0,153,153))) { //Iniciar Nueva
            btnNuevaS.setBackground(new Color(0, 220, 0));
            txtNombreS.requestFocus();
            txtNombreS.setEnabled(true);
            txtDomicilio.setEnabled(true);
            txtID_Sucursal.setEnabled(false);
            btnEliminarS.setEnabled(false);
            btnEditarS.setEnabled(false);
            barNombreS.setBackground(new Color(0, 90, 195));
            barDomicilio.setBackground(new Color(0, 90, 195));
            barID_Sucursal.setBackground(new Color(187, 187, 187));
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
                setCbSucursales(cbSucursales);
                ResetSucursales();
            }
        }
    }//GEN-LAST:event_btnNuevaSActionPerformed

    private void btnEditarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSActionPerformed
        if (btnEditarS.getBackground().equals(new Color(0,153,153))) { //Iniciar Editar
            if (Tabla_Sucursales.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una sucursal");
            } else {
                Object id = Tabla_Sucursales.getModel().getValueAt(Tabla_Sucursales.getSelectedRow(), 0);
                int idS = Integer.parseInt(id.toString());
                BuscarS(idS);
                if (foundS != false) {
                    btnEditarS.setBackground(new Color(0, 220, 0));
                    txtNombreS.setEnabled(true);
                    txtDomicilio.setEnabled(true);
                    txtID_Sucursal.setEnabled(false);
                    btnNuevaS.setEnabled(false);
                    btnEliminarS.setEnabled(false);
                    barNombreS.setBackground(new Color(0,153,153));
                    barDomicilio.setBackground(new Color(0,153,153));
                    barID_Sucursal.setBackground(new Color(187, 187, 187));
                } else {
                    ResetSucursales();
                }
            }
        } else { //Confirmar Editar
            String nombre = txtNombreS.getText();
            String domicilio = txtDomicilio.getText();
            if (nombre.equals("") || domicilio.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                sucursales.Modificar(ID_Sucursal, nombre, domicilio);
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                ResetSucursales();
            }
        }
    }//GEN-LAST:event_btnEditarSActionPerformed

    private void btnEliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSActionPerformed
        if (btnEliminarS.getBackground().equals(new Color(0,153,153))) { //Iniciar Eliminar
            if (Tabla_Sucursales.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una sucursal");
            } else {
                Object id = Tabla_Sucursales.getModel().getValueAt(Tabla_Sucursales.getSelectedRow(), 0);
                int idS = Integer.parseInt(id.toString());
                BuscarS(idS);
                if (foundS != false) {
                    btnEliminarS.setBackground(new Color(0, 220, 0));
                    txtID_Sucursal.setEnabled(false);
                    btnNuevaS.setEnabled(false);
                    btnEditarS.setEnabled(false);
                    barID_Sucursal.setBackground(new Color(187, 187, 187));
                } else {
                    ResetSucursales();
                }
            }
        } else { //Confirmar Eliminar
            sucursales.Desactivar(ID_Sucursal);
            JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
            ResetSucursales();
        }
    }//GEN-LAST:event_btnEliminarSActionPerformed

    public void setCbSucursales(JComboBox<String> cb) {
        if (cb.getSelectedItem() == "Seleccionar") {
            cb.removeAllItems();
            cb.addItem("Seleccionar");
        } else {
            cb.removeAllItems();
            cb.addItem("Sucursales");
        }
        try {
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement("select nombre from Sucursales where estatus = 1");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cb.addItem(rs.getString("nombre"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int getID_Sucursal(JComboBox<String> cb) {
        String Sucursal = String.valueOf(cb.getSelectedItem());
        try {
            PreparedStatement pst = cn.prepareStatement("select idSucursal from Sucursales where nombre = ?");
            pst.setString(1, Sucursal);
            rs = pst.executeQuery();
            if (rs.next()) {
                ID_Sucursal = rs.getInt("idSucursal");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ID_Sucursal;
    }

    private void btnCancelarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSActionPerformed
        ResetSucursales();
    }//GEN-LAST:event_btnCancelarSActionPerformed
    //Fin Sucursales

    //Reportes
    public void setCbFolio() {
        cbFolio.removeAllItems();
        cbFolio.addItem("Seleccionar");
        try {
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement("select folio from Ventas");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cbFolio.addItem(String.valueOf(rs.getInt("folio")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int getFolio() {
        String folio = String.valueOf(cbFolio.getSelectedItem());
        int folioV = 0;
        try {
            PreparedStatement pst = cn.prepareStatement("select folio from ventas where folio = ?");
            pst.setString(1, folio);
            rs = pst.executeQuery();
            if (rs.next()) {
                folioV = rs.getInt("folio");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return folioV;
    }

    private void btnReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed
        reportes.Reporte1(Tabla_Reportes);
    }//GEN-LAST:event_btnReporte1ActionPerformed

    private void btnReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte2ActionPerformed
        btnReporte3.setEnabled(false);
        btnReporte4.setEnabled(false);
        btnReporte1.setEnabled(false);
        btnReporte2.setVisible(false);
        btnCheck2.setVisible(true);
        cbFolio.setEnabled(true);
    }//GEN-LAST:event_btnReporte2ActionPerformed

    private void btnReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte3ActionPerformed
        btnReporte3.setVisible(false);
        btnReporte4.setEnabled(false);
        btnReporte1.setEnabled(false);
        btnReporte2.setEnabled(false);
        btnCheck3.setVisible(true);
        cbSucursal.setEnabled(true);
        txtFecha_Inicio.setEnabled(true);
        txtFecha_Fin.setEnabled(true);
    }//GEN-LAST:event_btnReporte3ActionPerformed

    private void btnReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte4ActionPerformed
        btnReporte3.setEnabled(false);
        btnReporte4.setVisible(false);
        btnReporte1.setEnabled(false);
        btnReporte2.setEnabled(false);
        btnCheck4.setVisible(true);
        txtFecha_Inicio.setEnabled(true);
    }//GEN-LAST:event_btnReporte4ActionPerformed

    private void btnCheck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheck2ActionPerformed
        if (cbFolio.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un folio");
        } else {
            reportes.Reporte2(Tabla_Reportes);
            btnReporte2.setVisible(true);
            btnCheck2.setVisible(false);
            btnReporte3.setEnabled(true);
            btnReporte4.setEnabled(true);
            btnReporte1.setEnabled(true);
            btnReporte2.setEnabled(true);
            cbFolio.setEnabled(false);
            cbFolio.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnCheck2ActionPerformed

    private void btnCheck3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheck3ActionPerformed
        if (cbSucursal.getSelectedIndex() == 0 || txtFecha_Inicio.getDate() == null || txtFecha_Fin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Selecciona una sucursal y las fechas");
        } else {
            java.util.Date date1 = txtFecha_Inicio.getDate();
            java.sql.Date fecha_inicio = new java.sql.Date(date1.getTime());
            java.util.Date date2 = txtFecha_Fin.getDate();
            java.sql.Date fecha_fin = new java.sql.Date(date2.getTime());
            reportes.Reporte3(Tabla_Reportes, cbSucursal, fecha_inicio, fecha_fin);
            btnReporte3.setVisible(true);
            btnCheck3.setVisible(false);
            btnReporte3.setEnabled(true);
            btnReporte4.setEnabled(true);
            btnReporte1.setEnabled(true);
            btnReporte2.setEnabled(true);
            cbSucursal.setEnabled(false);
            cbSucursal.setSelectedIndex(0);
            txtFecha_Inicio.setEnabled(false);
            txtFecha_Fin.setEnabled(false);
            txtFecha_Inicio.setDate(null);
            txtFecha_Fin.setDate(null);
        }
    }//GEN-LAST:event_btnCheck3ActionPerformed

    private void btnCheck4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheck4ActionPerformed
        if (txtFecha_Inicio.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Selecciona una fecha");
        } else {
            java.util.Date date1 = txtFecha_Inicio.getDate();
            java.sql.Date fecha = new java.sql.Date(date1.getTime());
            reportes.Reporte4(Tabla_Reportes, fecha);
            btnReporte4.setVisible(true);
            btnCheck4.setVisible(false);
            btnReporte3.setEnabled(true);
            btnReporte4.setEnabled(true);
            btnReporte1.setEnabled(true);
            btnReporte2.setEnabled(true);
            txtFecha_Inicio.setEnabled(false);
            txtFecha_Inicio.setDate(null);
        }
    }//GEN-LAST:event_btnCheck4ActionPerformed
    //Fin Reportes

    //Extras
    public void DisenarTabla(JTable table, int x) {
        table.getTableHeader().setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(0,153,153));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.setRowHeight(25);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < x; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public void ResetVentas() {
        cbProductos.setEnabled(false);
        cbCantidad.setEnabled(false);
        cbIVA.setEnabled(true);
        txtTotal.setEnabled(false);
        txtSubtotal.setEnabled(false);
        btnEditarV.setEnabled(true);
        btnAgregarP.setEnabled(false);
        barSubtotal.setBackground(new Color(187, 187, 187));
        barTotal.setBackground(new Color(187, 187, 187));
        btnNuevaV.setBackground(new Color(0,153,153));
        btnEditarV.setBackground(new Color(0,153,153));
        cbIVA.setSelectedIndex(16);
        ventas.CrearTabla(Tabla_Ventas);
        ventas.vaciarTxt(txtID_Venta, txtTotal, txtSubtotal, cbProductos, cbCantidad);
    }

    public void ResetProductos() {
        txtNombre.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCantidad.setEnabled(false);
        btnNuevoP.setEnabled(true);
        btnEditarP.setEnabled(true);
        btnEliminarP.setEnabled(true);
        barNombre.setBackground(new Color(187, 187, 187));
        barDescripcion.setBackground(new Color(187, 187, 187));
        barCantidad.setBackground(new Color(187, 187, 187));
        barPrecio.setBackground(new Color(187, 187, 187));
        btnNuevoP.setBackground(new Color(0,153,153));
        btnEditarP.setBackground(new Color(0,153,153));
        btnEliminarP.setBackground(new Color(0,153,153));
        productos.CrearTabla(Tabla_Productos, CheckBoxP);
        productos.vaciarTxt(txtID_Producto, txtNombre, txtDescripcion, txtPrecio, txtCantidad);
    }

    public void ResetSucursales() {
        txtNombreS.setEnabled(false);
        txtDomicilio.setEnabled(false);
        btnNuevaS.setEnabled(true);
        btnEditarS.setEnabled(true);
        btnEliminarS.setEnabled(true);
        barNombreS.setBackground(new Color(187, 187, 187));
        barDomicilio.setBackground(new Color(187, 187, 187));
        btnNuevaS.setBackground(new Color(0,153,153));
        btnEditarS.setBackground(new Color(0,153,153));
        btnEliminarS.setBackground(new Color(0,153,153));
        sucursales.CrearTabla(Tabla_Sucursales, CheckBoxS);
        sucursales.vaciarTxt(txtID_Sucursal, txtNombreS, txtDomicilio);
        setCbSucursales(cbSucursales);
        if (cbSucursales.getItemAt(1) != null) {
            cbSucursales.setSelectedIndex(1);
        }
    }

    public void ResetReportes() {
        btnReporte1.setVisible(true);
        btnReporte2.setVisible(true);
        btnReporte3.setVisible(true);
        btnReporte4.setVisible(true);
        btnCheck2.setVisible(false);
        btnCheck3.setVisible(false);
        btnCheck4.setVisible(false);
        btnReporte1.setEnabled(true);
        btnReporte2.setEnabled(true);
        btnReporte3.setEnabled(true);
        btnReporte4.setEnabled(true);
        txtFecha_Inicio.setEnabled(false);
        txtFecha_Fin.setEnabled(false);
        txtFecha_Inicio.setDate(null);
        txtFecha_Fin.setDate(null);
        cbSucursal.setEnabled(false);
        cbSucursal.setSelectedIndex(0);
        cbFolio.setEnabled(false);
        cbFolio.setSelectedIndex(0);
        DefaultTableModel dfm = new DefaultTableModel();
        Tabla_Reportes.setModel(dfm);
    }

    private void cbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductosItemStateChanged
        if (cbProductos.getSelectedIndex() == 0) {
            //
        } else {
            setCbCantidad(getID_Producto());
        }
    }//GEN-LAST:event_cbProductosItemStateChanged

    private void CheckBoxSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxSActionPerformed
        sucursales.CrearTabla(Tabla_Sucursales, CheckBoxS);
    }//GEN-LAST:event_CheckBoxSActionPerformed

    private void CheckBoxPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPActionPerformed
        productos.CrearTabla(Tabla_Productos, CheckBoxP);
    }//GEN-LAST:event_CheckBoxPActionPerformed

    private void btnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRActionPerformed
        ResetReportes();
    }//GEN-LAST:event_btnCancelarRActionPerformed

    //Eventos Mouse Entered / Mouse Exited
    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        btnReportes.setForeground(new Color(0, 220, 0));
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        btnReportes.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnInformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseEntered
        btnInformacion.setForeground(new Color(0, 220, 0));
    }//GEN-LAST:event_btnInformacionMouseEntered
    private void btnInformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseExited
        btnInformacion.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnInformacionMouseExited
    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        btnVentas.setForeground(new Color(0, 220, 0));
    }//GEN-LAST:event_btnVentasMouseEntered
    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnVentasMouseExited
    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setForeground(new Color(0, 220, 0));
    }//GEN-LAST:event_btnProductosMouseEntered
    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnProductosMouseExited
    private void btnSucursalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSucursalesMouseEntered
        btnSucursales.setForeground(new Color(0, 220, 0));
    }//GEN-LAST:event_btnSucursalesMouseEntered
    private void btnSucursalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSucursalesMouseExited
        btnSucursales.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSucursalesMouseExited
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(new Color(0, 220, 0));
    }//GEN-LAST:event_btnSalirMouseEntered
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseExited

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
    private javax.swing.JCheckBox CheckBoxP;
    private javax.swing.JCheckBox CheckBoxS;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JTable Tabla_Reportes;
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
    private javax.swing.JPanel barReportes;
    private javax.swing.JPanel barSalir;
    private javax.swing.JPanel barSubtotal;
    private javax.swing.JPanel barSucursales;
    private javax.swing.JPanel barTotal;
    private javax.swing.JPanel barVentas;
    private javax.swing.JPanel bgProductos;
    private javax.swing.JPanel bgReportes;
    private javax.swing.JPanel bgSucursales;
    private javax.swing.JPanel bgVentas;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnCancelarR;
    private javax.swing.JButton btnCancelarS;
    private javax.swing.JButton btnCancelarV;
    private javax.swing.JButton btnCheck2;
    private javax.swing.JButton btnCheck3;
    private javax.swing.JButton btnCheck4;
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
    private javax.swing.JButton btnReporte1;
    private javax.swing.JButton btnReporte2;
    private javax.swing.JButton btnReporte3;
    private javax.swing.JButton btnReporte4;
    private javax.swing.JLabel btnReportes;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSucursales;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JComboBox<String> cbCantidad;
    private javax.swing.JComboBox<String> cbFolio;
    private javax.swing.JComboBox<String> cbIVA;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JComboBox<String> cbSucursal;
    private javax.swing.JComboBox<String> cbSucursales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadVenta;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblFecha_Fin;
    private javax.swing.JLabel lblFecha_Inicio;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblID_Producto;
    private javax.swing.JLabel lblID_Producto2;
    private javax.swing.JLabel lblID_Sucursal;
    private javax.swing.JLabel lblID_Venta;
    private javax.swing.JLabel lblNombreS;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal2;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lnlNombre;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JScrollPane table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDomicilio;
    private com.toedter.calendar.JDateChooser txtFecha_Fin;
    private com.toedter.calendar.JDateChooser txtFecha_Inicio;
    private javax.swing.JTextField txtID_Producto;
    private javax.swing.JTextField txtID_Sucursal;
    private javax.swing.JTextField txtID_Venta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreS;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
