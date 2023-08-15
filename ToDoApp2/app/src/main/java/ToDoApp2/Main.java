/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToDoApp2;

import controller.ProjectController;
import model.Project;

/**
 *
 * @author Natalia
 */
public class Main {
    
    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Test Project");
        project.setDescription("Created for testing purposes only.");
        projectController.save(project);
        
        project.setName("Updt: Created for testing purposes only.");
        projectController.update(project);
        
    }
    
}
