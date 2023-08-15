/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToDoApp2;

import controller.ProjectController;
import java.util.List;
import model.Project;
import org.checkerframework.checker.units.qual.A;

/**
 *
 * @author Natalia
 */
public class Main {
    
    public static void main(String[] args) {
        
       /* ProjectController projectController = new ProjectController();
        
        Project project = new Project();
      ;
        project.setName("Test Project");
        project.setDescription("Created for testing purposes only.");
        projectController.save(project);*/
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setId(1);
        project.setName("Updated Test Project");
        project.setDescription("Updt: Created for testing purposes only");
        projectController.update(project);
        
        projectController.removeById(4);
        
        
        List<Project> projects = projectController.getAll(0);
        System.out.println("Total: " + projects.size());
        
        
        
        
    }
    
}
