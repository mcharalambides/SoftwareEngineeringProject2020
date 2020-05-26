
package models;

public class Proion {
    private String name;
    private String description;
    private int quantity;
    private double price;
    
    public void saveChanges(String name, int quantity, String description, double price){
        
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }
}
