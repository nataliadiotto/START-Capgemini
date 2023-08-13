/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import model.Project;
import utilities.ConnectionFactory;

/**
 *
 * @author Natalia
 */
public class ProjectController {
    
    public void save (Project project ){
        String sql = "INSERT INTO projects (name, description, createdAt, updatedAt ) VALUES (?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            
        } catch (Exception ex) {
            
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    
    }
    
    public void update (Project project) {
        
    }
    
    public void removeById(int projectId) {
        
    }
    
    public List<Project> getAll(int projectId) { //search all projects using projectId
        
    }
}
