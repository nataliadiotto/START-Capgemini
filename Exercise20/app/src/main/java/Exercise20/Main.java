/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise20;

import java.util.Scanner;

/**
 *
 * @author Natalia
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int manufactYear = 0;
        double carPrice = 0;
        
        boolean repeat = true;
        
        while (repeat == true) {
            
            System.out.println("Type the vehicle's manufacturing year: ");
            manufactYear = sc.nextInt();
            
            System.out.println("Type the vehicle's price: ");
            carPrice = sc.nextDouble();
        }
           
       sc.close(); 
    }
    
}
