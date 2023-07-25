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
        super(); //quero que ele tenha tudo que um employee tem
    }
    
    public double calculateSalary() {
        return super.getSalary() + (this.itemComission * totalItensSold);
    }

    public int getTotalItensSold() {
        return totalItensSold;
    }

    public void setTotalItensSold(int totalItensSold) {
        this.totalItensSold = totalItensSold;
    }

    public double getItemComission() {
        return itemComission;
    }

    public void setItemComission(double itemComission) {
        this.itemComission = itemComission;
    }
    
    
}
