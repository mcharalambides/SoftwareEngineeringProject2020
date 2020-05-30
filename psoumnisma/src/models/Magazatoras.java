
package models;
import java.io.File;
import java.util.List;

public class Magazatoras {
    private String name;
    private String password;
    private long telephoneNumber;
    private String address;
    private int coordinates1;
    private int coordinates2;
    //private File image;
    private float rating;
    //private List<Paraggelia> orderList;
    private List<Proion> productList;

    
    public Magazatoras(String name,String password,long telephoneNumber,String address,int coordinates1,int coordinates2,float rating,List productList){
        this.name = name;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.coordinates1 = coordinates1;
        this.coordinates2 = coordinates2;
        //this.image = image;
        this.rating = rating;
        //this.orderList = orderList;
        this.productList = productList;  
    }
    
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getCoordinates1() {
        return coordinates1;
    }

    public int getCoordinates2() {
        return coordinates2;
    }
    
    /*public File getImage() {
        return image;
    }*/

    public float getRating() {
        return rating;
    }

    /*public List<Paraggelia> getOrderList() {
        return orderList;
    }*/

    public List<Proion> getProductList() {
        return productList;
    }

    public double getDiscount() {
        return discount;
    }
    private double discount;
    
}
