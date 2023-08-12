/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToDoApp2;

import java.sql.Connection;
import utilities.ConnectionFactory;

/**
 *
 * @author Natalia
 */
public class Main {
    
    public static void main(String[] args) {
        
        Connection c = ConnectionFactory.getConnection();
        
        
        
        ConnectionFactory.closeConnection(c);
        
    }
    
}
