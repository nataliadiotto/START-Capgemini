/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Natalia
 */
public class DeadlineColumnCellRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRenComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col); //retornar o componente que será renderizado na tela
        
        label.setHorizontalAlignment(CENTER);
        
        
        return null;
    }
    
}
