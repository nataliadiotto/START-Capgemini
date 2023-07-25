/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Natalia
 */
public class Main {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
    
        Salesperson s = new Salesperson();
        s.setName("Mario");
        s.setSalary(1000.00);
        s.setCpf("40040040");
        s.setBirthDate(new Date());
        s.setItemComission(10.0);
        s.setTotalItensSold(10);
        
        System.out.println("The salesperson salary is: $" + s.calculateSalary());
        
        sc.close();
    
    }
    
    
    
    
}
