package com.frames;

import com.classes.MyConnection;
import static com.frames.LoginUI.main;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import javax.swing.JOptionPane;

public class VentasUI extends javax.swing.JPanel {

    Ventas ventas = new Ventas();
    Productos productos = new Productos();
    MainUI main = new MainUI();
    public VentasUI() {
        initComponents();
        ResetVentas();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgVentas = new javax.swing.JPanel();
        TablaV = new javax.swing.JScrollPane();
        Tabla_Ventas = new javax.swing.JTable();
        btnNuevaV = new javax.swing.JButton();
        btnAgregarP = new javax.swing.JButton();
        btnEditarV = new javax.swing.JButton();
        btnCancelarV = new javax.swing.JButton();
        barID_V = new javax.swing.JPanel();
        barTotal = new javax.swing.JPanel();
        barSubtotal = new javax.swing.JPanel();
        txtID_V = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        lblCantidadVenta = new javax.swing.JLabel();
        lblID_V = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        cbProductos = new javax.swing.JComboBox<>();
        cbCantidad = new javax.swing.JComboBox<>();
        cbIVA = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgVentas.setBackground(new java.awt.Color(255, 255, 255));
        bgVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Ventas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
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
        Tabla_Ventas.setShowGrid(false);
        Tabla_Ventas.getTableHeader().setResizingAllowed(false);
        Tabla_Ventas.getTableHeader().setReorderingAllowed(false);
        TablaV.setViewportView(Tabla_Ventas);

        bgVentas.add(TablaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 650, 320));

        btnNuevaV.setBackground(new java.awt.Color(0, 90, 195));
        btnNuevaV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevaV.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cash_register_32px.png"))); // NOI18N
        btnNuevaV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVActionPerformed(evt);
            }
        });
        bgVentas.add(btnNuevaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 40, 40));

        btnAgregarP.setBackground(new java.awt.Color(0, 90, 195));
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
        bgVentas.add(btnAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 40, 40));

        btnEditarV.setBackground(new java.awt.Color(0, 90, 195));
        btnEditarV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarV.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edit_property_32px.png"))); // NOI18N
        btnEditarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVActionPerformed(evt);
            }
        });
        bgVentas.add(btnEditarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 40, 40));

        btnCancelarV.setBackground(new java.awt.Color(0, 90, 195));
        btnCancelarV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarV.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cancel_2_32px.png"))); // NOI18N
        btnCancelarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVActionPerformed(evt);
            }
        });
        bgVentas.add(btnCancelarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 40, 40));

        barID_V.setBackground(new java.awt.Color(204, 204, 204));
        barID_V.setPreferredSize(new java.awt.Dimension(2, 29));

        javax.swing.GroupLayout barID_VLayout = new javax.swing.GroupLayout(barID_V);
        barID_V.setLayout(barID_VLayout);
        barID_VLayout.setHorizontalGroup(
            barID_VLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barID_VLayout.setVerticalGroup(
            barID_VLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bgVentas.add(barID_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 2));

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

        bgVentas.add(barTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 120, 2));

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

        txtID_V.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID_V.setBorder(null);
        txtID_V.setEnabled(false);
        bgVentas.add(txtID_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setEnabled(false);
        bgVentas.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 120, -1));

        txtSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSubtotal.setBorder(null);
        txtSubtotal.setEnabled(false);
        bgVentas.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 120, -1));

        lblCantidadVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidadVenta.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidadVenta.setText("Cantidad");
        bgVentas.add(lblCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, -1));

        lblID_V.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID_V.setForeground(new java.awt.Color(153, 153, 153));
        lblID_V.setText("Folio");
        bgVentas.add(lblID_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        lblProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(153, 153, 153));
        lblProductos.setText("Producto");
        bgVentas.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 153));
        lblTotal.setText("Total");
        bgVentas.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 110, -1));

        lblIVA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIVA.setForeground(new java.awt.Color(153, 153, 153));
        lblIVA.setText("IVA");
        bgVentas.add(lblIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 100, -1));

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(153, 153, 153));
        lblSubtotal.setText("Subtotal");
        bgVentas.add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 110, -1));

        cbProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbProductos.setEnabled(false);
        cbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductosItemStateChanged(evt);
            }
        });
        bgVentas.add(cbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 30));

        cbCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbCantidad.setEnabled(false);
        bgVentas.add(cbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 110, 30));

        cbIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "0%", "1%", "2%", "3%", "4%", "5%", "6%", "7%", "8%", "9%", "10%", "11%", "12%", "13%", "14%", "15%", "16%", "17%", "18%", "19%", "20%" }));
        cbIVA.setSelectedIndex(17);
        cbIVA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgVentas.add(cbIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 30));

        add(bgVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVActionPerformed
        if (btnNuevaV.getBackground().equals(new Color(0, 90, 195))) { //Iniciar Nueva
            btnNuevaV.setBackground(new Color(0, 220, 0));
            txtID_V.setEnabled(false);
            txtTotal.setEnabled(false);
            txtSubtotal.setEnabled(false);
            cbProductos.setEnabled(true);
            cbCantidad.setEnabled(true);
            cbIVA.setEnabled(false);
            btnAgregarP.setEnabled(true);
            btnEditarV.setEnabled(false);
            barSubtotal.setBackground(new Color(187, 187, 187));
            barTotal.setBackground(new Color(187, 187, 187));
            barID_V.setBackground(new Color(187, 187, 187));
            if (main.getID_Sucursal() == 0) {
                ResetVentas();
                JOptionPane.showMessageDialog(null, "Selecciona una sucursal");
            } else {
                ventas.Insertar(main.getID_Sucursal(), LoginUI.getID_Usuario(), getIva());
                ventas.getPrecio(getID_Producto(), txtID_V, txtTotal, txtSubtotal);
            }
        } else { //Confirmar Nueva
            String subtotal = txtSubtotal.getText();
            if (subtotal.equals("0")) {
                JOptionPane.showMessageDialog(null, "Añade un producto");
            } else {
                JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                ResetVentas();
            }
        }
    }//GEN-LAST:event_btnNuevaVActionPerformed

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        if (cbProductos.getSelectedIndex() == 0 || cbCantidad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un producto y cantidad");
        } else {
            int idV = Integer.parseInt(txtID_V.getText());
            int idP = getID_Producto();
            int cantidad = getCantidad();
            int precio = ventas.getPrecio(idP, txtID_V, txtTotal, txtSubtotal);
            ventas.InsertarDetalleVenta(idV, idP, cantidad, precio);
            productos.Vendido(idP, cantidad);
            ventas.getPrecio(getID_Producto(), txtID_V, txtTotal, txtSubtotal);
            ventas.CrearTabla(Tabla_Ventas);
            cbProductos.setSelectedIndex(0);
            cbCantidad.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnAgregarPActionPerformed

    private void btnEditarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVActionPerformed
        if (btnEditarV.getBackground().equals(new Color(0, 90, 195))) { //Iniciar Editar
            if (Tabla_Ventas.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una venta");
            } else {
                Object id = Tabla_Ventas.getModel().getValueAt(Tabla_Ventas.getSelectedRow(), 0);
                int idV = Integer.parseInt(id.toString());
                ventas.Buscar(idV, txtID_V, txtTotal, txtSubtotal);
                btnEditarV.setBackground(new Color(0, 220, 0));
                txtID_V.setEnabled(false);
                txtTotal.setEnabled(true);
                txtSubtotal.setEnabled(true);
                barTotal.setBackground(new Color(0, 90, 195));
                barSubtotal.setBackground(new Color(187, 187, 187));
                barID_V.setBackground(new Color(187, 187, 187));
            }
        } else { //Confirmar Editar
            String txtotal = txtTotal.getText().trim();
            if (txtotal.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                try {
                    int idV = Integer.parseInt(txtID_V.getText());
                    int subtotal = Integer.parseInt(txtSubtotal.getText());
                    int total = Integer.parseInt(txtTotal.getText());
                    ventas.Modificar(idV, subtotal, getIva(), total);
                    JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el tipo de datos");
                }
                ResetVentas();
            }
        }
    }//GEN-LAST:event_btnEditarVActionPerformed

    private void btnCancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVActionPerformed
        ResetVentas();
    }//GEN-LAST:event_btnCancelarVActionPerformed

    private void cbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductosItemStateChanged
        if (cbProductos.getSelectedIndex() != 0) {
            setCbCantidad(getID_Producto());
        }
    }//GEN-LAST:event_cbProductosItemStateChanged

    public void setCbProductos() {
        cbProductos.removeAllItems();
        cbProductos.addItem("Seleccionar");
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = cn.prepareStatement("select nombreProducto, descripcionProducto from Productos where estatus = 1 order by nombreProducto");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cbProductos.addItem(rs.getString("nombreProducto"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setCbCantidad(int id) {
        cbCantidad.removeAllItems();
        cbCantidad.addItem("Seleccionar");
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
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

    public int getID_Producto() {
        String Producto = String.valueOf(cbProductos.getSelectedItem());
        int ID_Producto = 0;
        try {
            Connection cn = MyConnection.getConnection();
            assert cn != null;
            PreparedStatement pst = Objects.requireNonNull(cn).prepareStatement("select idProducto from Productos where nombreProducto = ?");
            pst.setString(1, Producto);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ID_Producto = rs.getInt("idProducto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ID_Producto;
    }

    public int getCantidad() {
        return Integer.parseInt(String.valueOf(cbCantidad.getSelectedItem()));
    }

    public int getIva() {
        String str;
        str = String.valueOf(cbIVA.getSelectedItem());
        str = str.substring(0, str.length() - 1);
        return Integer.parseInt(str);
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
        btnNuevaV.setBackground(new Color(0, 90, 195));
        btnEditarV.setBackground(new Color(0, 90, 195));
        cbIVA.setSelectedIndex(17);
        ventas.CrearTabla(Tabla_Ventas);
        ventas.vaciarTxt(txtID_V, txtTotal, txtSubtotal, cbProductos, cbCantidad);
        setCbProductos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TablaV;
    private javax.swing.JTable Tabla_Ventas;
    private javax.swing.JPanel barID_V;
    private javax.swing.JPanel barSubtotal;
    private javax.swing.JPanel barTotal;
    private javax.swing.JPanel bgVentas;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnCancelarV;
    private javax.swing.JButton btnEditarV;
    private javax.swing.JButton btnNuevaV;
    private javax.swing.JComboBox<String> cbCantidad;
    private javax.swing.JComboBox<String> cbIVA;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JLabel lblCantidadVenta;
    private javax.swing.JLabel lblID_V;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtID_V;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
