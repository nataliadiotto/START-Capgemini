/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise04;

import java.util.Scanner;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        char repeat = 'Y';
      
        while (repeat == 'Y') 
            System.out.print("Insert the item number: ");
            int itemNumber = sc.nextInt();

            System.out.print("Insert the description: ");
            String itemDescription = sc.next();

            System.out.print("Insert the quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Insert the unit price: ");
            double unitPrice = sc.nextDouble();

            Invoice invoice = new Invoice(itemNumber, itemDescription, quantity, unitPrice);

            System.out.println("The total price is: $" + invoice.getInvoiceAmount(unitPrice, quantity));

            System.out.println("\nDo you want to create another invoice?");
            repeat = sc.next().charAt(0);
           
        
    }
    
}
