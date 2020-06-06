
package models;

public class Proion {
    private String name;
    private String description;
    private int quantity;
    private double price;
    
    public Proion(String name,String description,int quantity,double price){
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
    
    public Proion(){};
    
    public void saveChanges(String name, int quantity, String description, double price){
        
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    
}
