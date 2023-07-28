/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise04;

/**
 *
 * @author Natalia
 */
public class Invoice {
    
    private int itemNumber;
    private String itemDescription;
    private int quantity;
    private double unitPrice;

    public Invoice(int itemNumber, String itemDescription, int quantity, double unitPrice) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        
        if (quantity < 0) {
            this.quantity = 0;
        }
        this.quantity = quantity;
        
        if (unitPrice < 0) {
            this.unitPrice = 0;
        }
        this.unitPrice = unitPrice;
        
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getInvoiceAmount(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }
}

