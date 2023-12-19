package com.frames;

import com.classes.MyConnection;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class MainUI extends javax.swing.JFrame {
    //Timer timer = new Timer();
    //int temp = 0;
    public static String Sucursal = "";
    //Constructor
    public MainUI() {
        initComponents();
        setCbSucursales();
        //timer.scheduleAtFixedRate(new UpdateTask(), 0,5000);
        ((JLabel) cbSucursales.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ((JLabel) cbUsuarios.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        this.setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("com/images/Icono.png"))).getImage());
        lbl_icon.setIcon(new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("com/images/Icono.png"))).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }

    //Inicio InitComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        btnProductos = new javax.swing.JLabel();
        btnSucursales = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JLabel();
        btnReportes = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JLabel();
        barVentas = new javax.swing.JPanel();
        barProductos = new javax.swing.JPanel();
        barSucursales = new javax.swing.JPanel();
        barUsuarios = new javax.swing.JPanel();
        barReportes = new javax.swing.JPanel();
        barSalir = new javax.swing.JPanel();
        cbUsuarios = new javax.swing.JComboBox<>();
        cbSucursales = new javax.swing.JComboBox<>();
        bgMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Punto de Venta");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 90, 195));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon.setPreferredSize(new java.awt.Dimension(100, 100));
        sidePanel.add(lbl_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

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
        sidePanel.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, 130, -1));

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
        sidePanel.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, 130, 26));

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
        sidePanel.add(btnSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, 130, -1));

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
        sidePanel.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 314, 130, -1));

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
        sidePanel.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 359, 130, -1));

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
        sidePanel.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 130, -1));

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
        sidePanel.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, -1));

        barVentas.setBackground(new java.awt.Color(255, 255, 255));
        barVentas.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barVentasLayout = new javax.swing.GroupLayout(barVentas);
        barVentas.setLayout(barVentasLayout);
        barVentasLayout.setHorizontalGroup(
            barVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barVentasLayout.setVerticalGroup(
            barVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        sidePanel.add(barVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 130, 2));

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

        sidePanel.add(barProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, 130, 2));

        barSucursales.setBackground(new java.awt.Color(255, 255, 255));
        barSucursales.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barSucursalesLayout = new javax.swing.GroupLayout(barSucursales);
        barSucursales.setLayout(barSucursalesLayout);
        barSucursalesLayout.setHorizontalGroup(
            barSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barSucursalesLayout.setVerticalGroup(
            barSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        sidePanel.add(barSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 298, 130, 2));

        barUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        barUsuarios.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barUsuariosLayout = new javax.swing.GroupLayout(barUsuarios);
        barUsuarios.setLayout(barUsuariosLayout);
        barUsuariosLayout.setHorizontalGroup(
            barUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barUsuariosLayout.setVerticalGroup(
            barUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        sidePanel.add(barUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, 130, 2));

        barReportes.setBackground(new java.awt.Color(255, 255, 255));
        barReportes.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barReportesLayout = new javax.swing.GroupLayout(barReportes);
        barReportes.setLayout(barReportesLayout);
        barReportesLayout.setHorizontalGroup(
            barReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barReportesLayout.setVerticalGroup(
            barReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        sidePanel.add(barReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, 2));

        barSalir.setBackground(new java.awt.Color(255, 255, 255));
        barSalir.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barSalirLayout = new javax.swing.GroupLayout(barSalir);
        barSalir.setLayout(barSalirLayout);
        barSalirLayout.setHorizontalGroup(
            barSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barSalirLayout.setVerticalGroup(
            barSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        sidePanel.add(barSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 435, 130, 2));

        cbUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbUsuarios.setEnabled(false);
        sidePanel.add(cbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 130, -1));

        cbSucursales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSucursales.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSucursalesItemStateChanged(evt);
            }
        });
        cbSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbSucursalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbSucursalesMouseEntered(evt);
            }
        });
        sidePanel.add(cbSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 130, -1));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 560));

        bgMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(bgMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Fin InitComponents

//    public class UpdateTask extends TimerTask{
//        @Override
//        public void run(){
//            //setCbSucursales(cbSucursales);
//        }
//    }
//
    private void btnSalirMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.setVisible(false);
        LoginUI login = new LoginUI();
        login.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnVentasMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        btnVentasClick();
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnProductosMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        btnVentasClick();
        barVentas.setBackground(new Color(255, 255, 255));
        barProductos.setBackground(new Color(100, 255, 255)); //Enabled
        barSucursales.setBackground(new Color(255, 255, 255));
        barUsuarios.setBackground(new Color(255, 255, 255));
        barReportes.setBackground(new Color(255, 255, 255));

        bgMain.removeAll();
        ProductosUI panelProductos = new ProductosUI();
        bgMain.add(panelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 720, 560));
        panelProductos.setBounds(160, 0, 720, 560);
        panelProductos.ResetProductos();
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnSucursalesMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnSucursalesMouseClicked
        btnVentasClick();
        barVentas.setBackground(new Color(255, 255, 255));
        barProductos.setBackground(new Color(255, 255, 255));
        barSucursales.setBackground(new Color(100, 255, 255)); //Enabled
        barUsuarios.setBackground(new Color(255, 255, 255));
        barReportes.setBackground(new Color(255, 255, 255));
        bgMain.removeAll();
        SucursalesUI panelSucursales = new SucursalesUI();
        bgMain.add(panelSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 720, 560));
        panelSucursales.setBounds(160, 0, 720, 560);
        panelSucursales.ResetSucursales();
    }//GEN-LAST:event_btnSucursalesMouseClicked

    private void btnUsuariosMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        btnVentasClick();
        barVentas.setBackground(new Color(255, 255, 255));
        barProductos.setBackground(new Color(255, 255, 255));
        barSucursales.setBackground(new Color(255, 255, 255));
        barUsuarios.setBackground(new Color(100, 255, 255)); //Enabled
        barReportes.setBackground(new Color(255, 255, 255));

        bgMain.removeAll();
        UsuariosUI panelUsuarios = new UsuariosUI();
        bgMain.add(panelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 720, 560));
        panelUsuarios.setBounds(160, 0, 720, 560);
        panelUsuarios.ResetUsuarios();
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnReportesMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        btnReportesClick();
    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnInformacionMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseClicked
        JOptionPane.showMessageDialog(null, "©2023 - Sistema PDV");
    }//GEN-LAST:event_btnInformacionMouseClicked

    private void cbSucursalesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSucursalesItemStateChanged
        Sucursal = String.valueOf(cbSucursales.getSelectedItem());
    }//GEN-LAST:event_cbSucursalesItemStateChanged

    private void cbSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSucursalesMouseClicked
       
    }//GEN-LAST:event_cbSucursalesMouseClicked

    private void cbSucursalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSucursalesMouseEntered
         
    }//GEN-LAST:event_cbSucursalesMouseEntered

    public void btnReportesClick() {
        barVentas.setBackground(new Color(255, 255, 255));
        barProductos.setBackground(new Color(255, 255, 255));
        barSucursales.setBackground(new Color(255, 255, 255));
        barUsuarios.setBackground(new Color(255, 255, 255));
        barReportes.setBackground(new Color(100, 255, 255)); //Enabled

        bgMain.removeAll();
        ReportesUI panelReportes = new ReportesUI();
        bgMain.add(panelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 720, 560));
        panelReportes.setBounds(160, 0, 720, 560);
        panelReportes.ResetReportes();
    }

    public void btnVentasClick(){
        setCbSucursales();
        barVentas.setBackground(new Color(100, 255, 255)); //Enabled
        barProductos.setBackground(new Color(255, 255, 255));
        barSucursales.setBackground(new Color(255, 255, 255));
        barUsuarios.setBackground(new Color(255, 255, 255));
        barReportes.setBackground(new Color(255, 255, 255));

        bgMain.removeAll();
        VentasUI panelVentas = new VentasUI();
        bgMain.add(panelVentas, new AbsoluteConstraints(160, 0, 720, 560));
        panelVentas.setBounds(160, 0, 720, 560);
        panelVentas.ResetVentas();
    }
    public void setCbSucursales() {
        //JComboBox<String> cb2 = new JComboBox<>();
        if (cbSucursales.getSelectedItem() == "Seleccionar") {
            cbSucursales.removeAllItems();
        } else {
            cbSucursales.removeAllItems();
        }
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select nombre from Sucursales where estatus = 1 order by nombre");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cbSucursales.addItem(rs.getString("nombre"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        cbSucursales.setSelectedIndex(0);
    }
    public int getID_Sucursal() {
        int ID_Sucursal = 0;
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select idSucursal from Sucursales where nombre = ?");
            pst.setString(1, Sucursal);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ID_Sucursal = rs.getInt("idSucursal");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ID_Sucursal;
    }

    public void setCbUsuarios(int id) {
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select usuario from Usuarios where idUsuario = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cbUsuarios.removeAllItems();
                cbUsuarios.addItem(rs.getString("usuario"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int getPermisos() {
        int id = LoginUI.getID_Usuario();
        int Permisos = 0;
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select permisos from Usuarios where idUsuario = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Permisos = rs.getInt("permisos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Permisos;
    }

    public void DisenarTabla(JTable table, int x) {
        table.getTableHeader().setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(0, 90, 195));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.setRowHeight(25);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < x; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    //Eventos Mouse Entered / Mouse Exited
    private void btnReportesMouseEntered(MouseEvent evt) {
        btnReportes.setForeground(new Color(200, 255, 255));
    }

    private void btnReportesMouseExited(MouseEvent evt) {
        btnReportes.setForeground(new Color(255, 255, 255));
    }

    private void btnInformacionMouseEntered(MouseEvent evt) {
        btnInformacion.setForeground(new Color(200, 255, 255));
    }

    private void btnInformacionMouseExited(MouseEvent evt) {
        btnInformacion.setForeground(new Color(255, 255, 255));
    }

    private void btnVentasMouseEntered(MouseEvent evt) {
        btnVentas.setForeground(new Color(200, 255, 255));
    }

    private void btnVentasMouseExited(MouseEvent evt) {
        btnVentas.setForeground(new Color(255, 255, 255));
    }

    private void btnProductosMouseEntered(MouseEvent evt) {
        btnProductos.setForeground(new Color(200, 255, 255));
    }

    private void btnProductosMouseExited(MouseEvent evt) {
        btnProductos.setForeground(new Color(255, 255, 255));
    }

    private void btnSucursalesMouseEntered(MouseEvent evt) {
        btnSucursales.setForeground(new Color(200, 255, 255));
    }

    private void btnSucursalesMouseExited(MouseEvent evt) {
        btnSucursales.setForeground(new Color(255, 255, 255));
    }

    private void btnUsuariosMouseEntered(MouseEvent evt) {
        btnUsuarios.setForeground(new Color(200, 255, 255));
    }

    private void btnUsuariosMouseExited(MouseEvent evt) {
        btnUsuarios.setForeground(new Color(255, 255, 255));
    }

    private void btnSalirMouseEntered(MouseEvent evt) {
        btnSalir.setForeground(new Color(200, 255, 255));
    }

    private void btnSalirMouseExited(MouseEvent evt) {
        btnSalir.setForeground(new Color(255, 255, 255));
    }

    public static void main(String[] args) {
        //Look and feel
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Mostrar Form
        java.awt.EventQueue.invokeLater(() -> new MainUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barProductos;
    private javax.swing.JPanel barReportes;
    private javax.swing.JPanel barSalir;
    private javax.swing.JPanel barSucursales;
    private javax.swing.JPanel barUsuarios;
    private javax.swing.JPanel barVentas;
    private javax.swing.JPanel bgMain;
    private javax.swing.JLabel btnInformacion;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel btnReportes;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSucursales;
    private javax.swing.JLabel btnUsuarios;
    private javax.swing.JLabel btnVentas;
    public javax.swing.JComboBox<String> cbSucursales;
    public javax.swing.JComboBox<String> cbUsuarios;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
