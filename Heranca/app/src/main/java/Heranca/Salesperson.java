/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author Natalia
 */
public class Salesperson  extends Employee {
    
    private int totalItensSold;
    private double itemComission;
    
    public Salesperson() {
        super();
    }
    
    public double calculateSalary() {
        return super.getSalary() + (this.itemComission * totalItensSold);
    }
}
