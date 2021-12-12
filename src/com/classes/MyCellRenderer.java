
package com.classes;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class MyCellRenderer extends DefaultTableCellRenderer {

    public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column) {
  
        setEnabled(table == null || table.isEnabled()); 
        int x = Integer.parseInt(table.getValueAt(row, table.getRowCount() - 1).toString());
        if (x == 0)
            setBackground(new java.awt.Color(200, 0, 0));
        else
            setBackground(null);   
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        setHorizontalAlignment(SwingConstants.CENTER);
        return this;
    }
}