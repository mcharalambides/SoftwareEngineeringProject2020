
package models;
import java.util.List;

public class Paraggelia {
   private String customerName;
   private String storeName;
   private int storeTelehphoneNumber;
   private int customerTelehphoneNumber;
   List<Proion> itemList;
   private double cost;
   private int quantityPeritem;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuantityPeritem(int quantityPeritem) {
        this.quantityPeritem = quantityPeritem;
    }
   
}
