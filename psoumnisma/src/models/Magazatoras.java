
package models;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
    private int numberOfReviews;

    
    public Magazatoras(String name,String password,long telephoneNumber,String address,int coordinates1,int coordinates2,float rating, int numberOfReviews){
        this.name = name;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.coordinates1 = coordinates1;
        this.coordinates2 = coordinates2;
        //this.image = image;
        this.rating = rating;
        this.numberOfReviews = numberOfReviews;
        //this.orderList = orderList;
        populateProducList();
        
    }
    
    public void populateProducList(){
        try{
        BufferedReader in2 = new BufferedReader(new FileReader("src/proionta_magaziwn.txt"));
        String row;
        String array[];
        
        while((row = in2.readLine()) != null){
            if(row.split(",")[0].equals(this.name)){
                array = row.split(",").clone();
                this.productList.add(new Proion(array[1],array[3],Integer.parseInt(array[2]),Double.parseDouble(array[4])));
            }
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
