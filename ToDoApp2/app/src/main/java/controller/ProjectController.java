/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
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
            
            //Setando valores do statement
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
           
            //Executando query
            statement.execute();
            
        } catch (Exception ex) {
            throw new RuntimeException("Error saving project." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    
    }
    
    public void update (Project project) {
        String sql = "UPDATE projects SET name = ?, description = ?, createdAt = ?, updatedAt = ?  WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            
            statement.execute();
            
        } catch (Exception ex) {
            throw new RuntimeException("Error updating project." + ex.getMessage(), ex);
        } finally {
           ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void removeById(int projectId) {
        
    }
    
    public List<Project> getAll(int projectId) { //search all projects using projectId
        
    }
}
