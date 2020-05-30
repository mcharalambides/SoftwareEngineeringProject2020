
package models;

public class Proion {
    private String name;
    private String description;
    private int quantity;
    private double price;
    private Boolean remove;
    
    public Proion(String name,String description,int quantity,double price,Boolean remove){
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.remove = remove;
    }
    
    public void saveChanges(String name, int quantity, String description, double price){
        
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }
}
