
package models;

public class Prosfora {
    private String storeName;
    private String itemName;
    private String description;
    private String deadline;

    public Prosfora(String storeName, String itemName, String description, String deadline){
        this.storeName = storeName;
        this.itemName = itemName;
        this.description = description;
        this.deadline = deadline;
    }
    
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }
}
