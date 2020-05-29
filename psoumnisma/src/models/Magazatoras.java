
package models;
import java.io.File;
import java.util.List;

public class Magazatoras {
    private String name;
    private String password;
    private int telephoneNumber;
    private String address;
    private int[] coordinates;
    private File image;
    private int rating;
    private List<Paraggelia> orderList;
    private List<Proion> productList;

    
    public Magazatoras(String name,String password,int telephoneNumber,String address,int[] coordinates,File image,int rating,List orderList,List productList){
        this.name = name;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.coordinates = coordinates;
        this.image = image;
        this.rating = rating;
        this.orderList = orderList;
        this.productList = productList;  
    }
    
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public File getImage() {
        return image;
    }

    public int getRating() {
        return rating;
    }

    public List<Paraggelia> getOrderList() {
        return orderList;
    }

    public List<Proion> getProductList() {
        return productList;
    }

    public double getDiscount() {
        return discount;
    }
    private double discount;
    
}
