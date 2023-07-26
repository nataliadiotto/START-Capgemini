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
        int totalCars = 0;
        int totalCars2000 = 0;
        double discountPercentage = 0;  
        char repeat = 'Y';
        
        while (repeat == 'Y') {
            
            System.out.print("Type the vehicle's manufacturing year: ");
            manufactYear = sc.nextInt();
            
            System.out.print("Type the vehicle's price: ");
            carPrice = sc.nextDouble();
                      
            if (manufactYear <= 2000) {
                discountPercentage = 0.12;
                totalCars2000 ++;
            } else  {
                discountPercentage =  0.007;
            }
            totalCars ++;
            
            System.out.println("The discount is: $" + carPrice * discountPercentage);
            
            System.out.println("\nDo you want to continue? (Y/N)");
            repeat = sc.next().charAt(0);
                        
        }
        
         System.out.println("\nTotal cars: " + totalCars + "\nTotal cars until 2000: " + totalCars2000);
         
       sc.close(); 
    }
    
}
