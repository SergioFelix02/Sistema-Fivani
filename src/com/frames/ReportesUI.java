package com.frames;

import com.classes.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import javax.swing.*;
import javax.swing.table.*;
import org.jfree.chart.ChartPanel;

public class ReportesUI extends javax.swing.JPanel {
    
    Reportes reportes = new Reportes();

    public ReportesUI() {
        initComponents();
        ResetReportes();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgReportes = new javax.swing.JPanel();
        TablaR = new javax.swing.JScrollPane();
        Tabla_Reportes = new javax.swing.JTable();
        txtFecha_Fin = new com.toedter.calendar.JDateChooser();
        lblFecha_Inicio = new javax.swing.JLabel();
        lblFecha_Fin = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        txtFecha_Inicio = new javax.swing.JComboBox<>();
        btnReporte1 = new javax.swing.JButton();
        btnReporte2 = new javax.swing.JButton();
        btnReporte3 = new javax.swing.JButton();
        btnCancelarR = new javax.swing.JButton();
        cbFolio = new javax.swing.JComboBox<>();
        cbSucursal1 = new javax.swing.JComboBox<>();
        btnMostrarGrafica = new javax.swing.JButton();
        btnReporte4 = new javax.swing.JButton();
        btnReporte5 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgReportes.setBackground(new java.awt.Color(255, 255, 255));
        bgReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Reportes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
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
        Tabla_Reportes.setCellSelectionEnabled(false);
        Tabla_Reportes.setRowSelectionAllowed(true);
        Tabla_Reportes.setShowGrid(false);
        Tabla_Reportes.getTableHeader().setResizingAllowed(false);
        Tabla_Reportes.getTableHeader().setReorderingAllowed(false);
        TablaR.setViewportView(Tabla_Reportes);

        bgReportes.add(TablaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 650, 320));

        txtFecha_Fin.setEnabled(false);
        txtFecha_Fin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bgReportes.add(txtFecha_Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, -1));

        lblFecha_Inicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFecha_Inicio.setForeground(new java.awt.Color(153, 153, 153));
        lblFecha_Inicio.setText("Mes");
        bgReportes.add(lblFecha_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        lblFecha_Fin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFecha_Fin.setForeground(new java.awt.Color(153, 153, 153));
        lblFecha_Fin.setText("Fecha");
        bgReportes.add(lblFecha_Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 110, -1));

        lblFolio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFolio.setForeground(new java.awt.Color(153, 153, 153));
        lblFolio.setText("Folio");
        bgReportes.add(lblFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, -1));

        lblSucursal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSucursal.setForeground(new java.awt.Color(153, 153, 153));
        lblSucursal.setText("Sucursal");
        bgReportes.add(lblSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, -1));

        txtFecha_Inicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFecha_Inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        txtFecha_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtFecha_Inicio.setEnabled(false);
        bgReportes.add(txtFecha_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        btnReporte1.setBackground(new java.awt.Color(0, 90, 195));
        btnReporte1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte1.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte1.setText("Productos más Vendidos");
        btnReporte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 210, 30));

        btnReporte2.setBackground(new java.awt.Color(0, 90, 195));
        btnReporte2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte2.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte2.setText("Sucursales con más Ventas");
        btnReporte2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte2ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 210, 30));

        btnReporte3.setBackground(new java.awt.Color(0, 90, 195));
        btnReporte3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte3.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte3.setText("Total de Ventas (Mes)");
        btnReporte3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte3ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 210, 30));

        btnCancelarR.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarR.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRActionPerformed(evt);
            }
        });
        bgReportes.add(btnCancelarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 40, 40));

        cbFolio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbFolio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbFolio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbFolio.setEnabled(false);
        bgReportes.add(cbFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 30));

        cbSucursal1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbSucursal1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbSucursal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSucursal1.setEnabled(false);
        bgReportes.add(cbSucursal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, 30));

        btnMostrarGrafica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMostrarGrafica.setText("Mostrar Grafica");
        btnMostrarGrafica.setEnabled(false);
        btnMostrarGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarGraficaActionPerformed(evt);
            }
        });
        bgReportes.add(btnMostrarGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnReporte4.setBackground(new java.awt.Color(0, 90, 195));
        btnReporte4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte4.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte4.setText("Ganancias por Mes");
        btnReporte4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte4ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 210, 30));

        btnReporte5.setBackground(new java.awt.Color(0, 90, 195));
        btnReporte5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporte5.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte5.setText("Ganancias por Año");
        btnReporte5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte5ActionPerformed(evt);
            }
        });
        bgReportes.add(btnReporte5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 210, 30));

        add(bgReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed
        reportes.Reporte1(Tabla_Reportes);
        btnMostrarGrafica.setEnabled(true);
        txtFecha_Inicio.setEnabled(false);
    }//GEN-LAST:event_btnReporte1ActionPerformed

    private void btnReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte2ActionPerformed
        reportes.Reporte2(Tabla_Reportes);
        btnMostrarGrafica.setEnabled(true);
        txtFecha_Inicio.setEnabled(false);
    }//GEN-LAST:event_btnReporte2ActionPerformed

    private void btnReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte3ActionPerformed
        int fecha_inicio = (txtFecha_Inicio.getSelectedIndex());
        String mes = Objects.requireNonNull(txtFecha_Inicio.getSelectedItem()).toString();
        reportes.Reporte3(Tabla_Reportes, fecha_inicio, mes);
        btnReporte3.setVisible(true);
        btnReporte3.setEnabled(true);
        btnReporte1.setEnabled(true);
        btnReporte2.setEnabled(true);
        txtFecha_Fin.setEnabled(false);
        txtFecha_Fin.setDate(null);
        btnMostrarGrafica.setEnabled(false);
        txtFecha_Inicio.setEnabled(true);
    }//GEN-LAST:event_btnReporte3ActionPerformed

    private void btnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRActionPerformed
        ResetReportes();
    }//GEN-LAST:event_btnCancelarRActionPerformed

    private void btnMostrarGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarGraficaActionPerformed
        MostrarGrafico();
    }//GEN-LAST:event_btnMostrarGraficaActionPerformed

    private void btnReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte4ActionPerformed
        reportes.Reporte4(Tabla_Reportes);
        btnMostrarGrafica.setEnabled(true);
        txtFecha_Inicio.setEnabled(false);
    }//GEN-LAST:event_btnReporte4ActionPerformed

    private void btnReporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte5ActionPerformed
        reportes.Reporte5(Tabla_Reportes);
        btnMostrarGrafica.setEnabled(true);
        txtFecha_Inicio.setEnabled(false);
    }//GEN-LAST:event_btnReporte5ActionPerformed
   
    public void setCbFolio() {
        cbFolio.removeAllItems();
        cbFolio.addItem("Seleccionar");
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select folio from Ventas");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cbFolio.addItem(String.valueOf(rs.getInt("folio")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void MostrarGrafico(){
        Graficas frmGraficas = new Graficas();
        ChartPanel panel = new ChartPanel(reportes.grafica);
        frmGraficas.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));
        panel.setBounds(0, 0, 800, 450);
        frmGraficas.setVisible(true);
    }   
    
    public void ResetReportes() {
        txtFecha_Inicio.setEnabled(false);
        btnReporte1.setVisible(true);
        btnReporte2.setVisible(true);
        btnReporte3.setVisible(true);
        btnReporte1.setEnabled(true);
        btnReporte2.setEnabled(true);
        btnReporte3.setEnabled(true);
        txtFecha_Fin.setEnabled(false);
        txtFecha_Fin.setDate(null);
        cbFolio.setEnabled(false);
        btnMostrarGrafica.setEnabled(false);
        cbFolio.setSelectedIndex(0);
        DefaultTableModel dfm = new DefaultTableModel();
        Tabla_Reportes.setModel(dfm);
        setCbFolio();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TablaR;
    private javax.swing.JTable Tabla_Reportes;
    private javax.swing.JPanel bgReportes;
    private javax.swing.JButton btnCancelarR;
    private javax.swing.JButton btnMostrarGrafica;
    private javax.swing.JButton btnReporte1;
    private javax.swing.JButton btnReporte2;
    private javax.swing.JButton btnReporte3;
    private javax.swing.JButton btnReporte4;
    private javax.swing.JButton btnReporte5;
    private javax.swing.JComboBox<String> cbFolio;
    private javax.swing.JComboBox<String> cbSucursal1;
    private javax.swing.JLabel lblFecha_Fin;
    private javax.swing.JLabel lblFecha_Inicio;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblSucursal;
    private com.toedter.calendar.JDateChooser txtFecha_Fin;
    private javax.swing.JComboBox<String> txtFecha_Inicio;
    // End of variables declaration//GEN-END:variables
}
