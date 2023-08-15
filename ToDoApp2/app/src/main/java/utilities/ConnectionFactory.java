/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Natalia
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/toDoApp"; 
    public static final String USER = "root";
    public static final String PASS = "";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);  //carregar o drive
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            throw new RuntimeException ("Error connecting to database.", ex);
        }
    }
    
    public static void closeConnection (Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException ("Error closing the connection to the database.", ex);     
        }
    }
    
    public static void closeConnection (Connection connection, PreparedStatement statement) { //metodo com a mesma assinatura do anterior mas parametros diferentes
        try {
            if (connection != null) {
                connection.close();
            }
            
            if (statement != null) {
                statement.close();
            }
            
        } catch (Exception ex) {
            throw new RuntimeException ("Error closing the connection to the database.", ex);     
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            
            if (statement != null) {
                statement.close();
            }
            
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Error closing connection to the database.", ex);
        }
    }
    
}
