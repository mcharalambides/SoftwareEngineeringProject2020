
package models;
import java.util.ArrayList;
import java.util.List;

public class Paraggelia {
   private String customerName;
   private String storeName;
   private int storeTelehphoneNumber;
   private int customerTelehphoneNumber;
   List<Proion> itemList;
   private double cost;
   private int quantityPeritem;
   
   public Paraggelia(){
       itemList = new ArrayList<Proion>();
   };

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setStoreTelehphoneNumber(int storeTelehphoneNumber) {
        this.storeTelehphoneNumber = storeTelehphoneNumber;
    }

    public void setCustomerTelehphoneNumber(int customerTelehphoneNumber) {
        this.customerTelehphoneNumber = customerTelehphoneNumber;
    }

    public void setItemList(List<Proion> itemList) {
        this.itemList = itemList;
    }
    
    public void setItemList(Proion proion) {
        this.itemList.add(proion);
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuantityPeritem(int quantityPeritem) {
        this.quantityPeritem = quantityPeritem;
    }
    
    public List<Proion> getItemList() {
        return this.itemList;
    }
    
    public List<String> getItemNames() {
        List<String> names = new ArrayList<String>();
        
        for(int i=0; i<itemList.size();i++)
            names.add(itemList.get(i).getName());
        
        return names;
    }
    
    public int getQuantityPeritem(String proion) {
        for(int i=0;i<itemList.size();i++)
            if(itemList.get(i).getName().equals(proion))
                return itemList.get(i).getQuantity();
       return 1;
    }
   
}
