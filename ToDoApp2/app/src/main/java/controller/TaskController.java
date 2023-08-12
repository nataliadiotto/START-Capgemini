/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
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
