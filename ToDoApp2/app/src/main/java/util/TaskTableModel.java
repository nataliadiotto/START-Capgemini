/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
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
    
    @Override //imprimir nomes das colunas na GUI
    public String getColumnName(int columnIndex) {   
        return columns[columnIndex];
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3; //equivalente a uma comparação if/else
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) { //retorna a classe do componente que esta na coluna: se é texto, String, boolean, etc
    
            if (tasks.isEmpty()) {
                return Object.class;
            }
    
            return this.getValueAt(0, columnIndex).getClass(); //vai procurar algum dado na coluna
    
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        switch (columnIndex) {
            case 0 -> {
                return tasks.get(rowIndex).getName();
            }
            case 1 -> {
                return tasks.get(rowIndex).getDescription();
            }
            case 2 -> {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            }
            case 3 -> {
                return tasks.get(rowIndex).getIsComplete();
            }
            case 4 -> {
                return "";
            }
            case 5 -> {
                return "";
            }
            default -> {
                return "Values not found.";
            }
        }
 
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
