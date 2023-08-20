/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author Natália Diotto
 */
public class TaskTableModel extends AbstractTableModel{
    
    String[] columns = {"Name", "Description", "Deadline", "Task Completed", "Edit", "Delete"};
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 1 -> tasks.get(rowIndex).getName();
            case 2 -> tasks.get(rowIndex).getDescription();
            case 3 -> tasks.get(rowIndex).getDeadline();
            case 4 -> tasks.get(rowIndex).getIsComplete();
            case 5 -> "";
            case 6 -> "";
            default -> "Values not found.";
        };
 
    }
    
    
    
}
