/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
            statement.setBoolean(4, task.isComplete());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime())); //converter data pois, apesar de terem o mesmo nome, são de pacotes diferentes (java.util e java.sql)
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Error saving task." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public void update (Task task) {
        String sql = "UPDATE tasks SET projectId = ?, name = ?, description = ?, completed = ?, notes = ?, deadline = ?, createdAt = ?, updatedAt = ?  WHERE id = ?"; //id da tarefa usado como filtro do update
                
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getProjectId());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isComplete());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Error updating task." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void removeById (int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection(); //criei a conexão
            statement = connection.prepareStatement(sql); //objeto que ajuda a preparar o comando sql que será executado no banco
            statement.setInt(1, taskId); //quero setar um valor naquele sql: substituir primeiro parametro (?) pelo valor da tarefa 
            statement.execute();
            
        }  catch (Exception ex) {
            throw new RuntimeException("Error deleting task." + ex.getMessage(), ex);
        }  finally {
            ConnectionFactory.closeConnection(connection, statement);
            
        }
    }
    
    public List<Task> getAll(int projectId) { //search all tasks using projectId
        
        String sql = "SELECT * FROM tasks WHERE projectId = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; //guarda a resposta do select no banco de dados
        
        List<Task> tasks = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, projectId);
            
            resultSet = statement.executeQuery(); //vai devolver o valor de resposta do banco de dados
            
            while (resultSet.next()) {
                
                Task task = new Task();
                //setar todos os campos
                task.setId(resultSet.getInt("id")); //pegar o resultSet na coluna id 
                task.setProjectId(resultSet.getInt("projectId"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setIsComplete(resultSet.getBoolean("completed"));
                task.setNotes(resultSet.getString("notes"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                tasks.add(task)
                
            }
            
        } catch (Exception ex) {
            throw new RuntimeException("Error filtering tasks." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
        
        return null;
                
    }
    
}
