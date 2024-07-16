/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Tee Kai Nee
 */
public class medicine {
     private String name;
     private String category;
     private String descriptions;
     private double price;
     private int quantity;

     public medicine() {
         
     }
     
     public medicine(String name, String category, String descriptions, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.descriptions = descriptions;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescriptions() {
        return descriptions;
    }
    
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
