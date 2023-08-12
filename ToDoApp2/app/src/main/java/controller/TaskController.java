/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import utilities.ConnectionFactory;

/**
 *
 * @author Natalia
 */
public class TaskController {
    
    public void save (Task  task ){
        
        String sql = "INSERT INTO tasks (projectId, name, description, completed, notes, deadline, createdAt, updatedAt ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getProjectId());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsComplete());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime())); //converter data pois, apesar de terem o mesmo nome, são de pacotes diferentes (java.util e java.sql)
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            
        } catch (Exception e) {
            
        }
        
    }
    
    public void update (Task task) {
        
    }
    
    public void removeById (int taskId) throws SQLException {
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            
            conn = ConnectionFactory.getConnection(); //criei a conexão
            statement = conn.prepareStatement(sql); //objeto que ajuda a preparar o comando sql que será executado no banco
            statement.setInt(1, taskId); //quero setar um valor naquele sql: substituir primeiro parametro (?) pelo valor da tarefa 
            statement.execute();
            
        }  catch (SQLException e) {
            throw new SQLException("Error deleting task.");
        }  finally {
            ConnectionFactory.closeConnection(conn);
            
        }
    }
    
    public List<Task> getAll(int idProject) { //search all tasks using idProject
        return null;
    }
    
}