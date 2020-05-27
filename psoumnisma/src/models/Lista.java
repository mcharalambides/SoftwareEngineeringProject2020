package models;
import java.util.List;
import java.util.ArrayList;

public class Lista {
    private List<String> itemList;
    private double maxDistance;
    private int maxCost;
    private int maxRating;
    
    public Lista(double maxDistance,int maxCost,int maxRating,List<String> items){
        this.maxCost = maxCost;
        this.maxDistance = maxDistance;
        this.maxRating = maxRating;
        this.itemList = new ArrayList<String>(items);
        
        
    }

    public void setItemList(String item) {
        this.itemList.add(item);
    }

        
    public void setFilters(double maxDistance, int maxCost, int maxRating) {
        this.maxDistance = maxDistance;
        this.maxCost = maxCost;
        this.maxRating = maxRating;
    }
    
    /*public boolean validateList() {
    }*/
}
