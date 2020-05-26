package models;

public class Lista {
    //private list<Proion> itemList;
    private double maxDistance;
    private int maxCost;
    private int maxRating;
    
    /*public void setItemList(Proion itemList) {
        this.itemList = itemList;
    }*/
        
    public void setFilters(double maxDistance, int maxCost, int maxRating) {
        this.maxDistance = maxDistance;
        this.maxCost = maxCost;
        this.maxRating = maxRating;
    }
    
    /*public boolean validateList() {
    }*/
}
