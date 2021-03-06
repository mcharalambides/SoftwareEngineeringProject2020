
package models;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Exception;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class PinakasApotelesmatwn {
    private List<String> storeName;
    private List<ImageIcon> storeImage;
    private List<Double> cost;
    private List<Double> distance;
    private List<Integer> storeRating;
    private List<Proion>  shoppingList; 
    private String customerName;


    public PinakasApotelesmatwn(Lista lista, Paraggelia paraggelia){
        storeName = new ArrayList<String>();
        cost = new ArrayList<Double>();
        distance = new ArrayList<Double>();
        storeRating = new ArrayList<Integer>();
        storeImage = new ArrayList<ImageIcon>();
        shoppingList = paraggelia.getItemList();
        customerName = paraggelia.getCustomerName();
        
        if(lista.getItemList().size()>0){
            checkMagazatores(lista,paraggelia);
            setRating();
            setStoreImage();
        }
        
    }
    
    public void checkMagazatores(Lista lista, Paraggelia paraggelia) {
        try{
        BufferedReader csvReader = new BufferedReader(new FileReader("src/proionta_magaziwn.txt"));
        String row,shopName;
        List<String> shopItems = new ArrayList<String>();
        List<String> shopNames = new ArrayList<String>();
        int rowNum = 0;
        List<Set> list = new ArrayList<Set>();
        List<String> tableRow = new ArrayList<String>();
        String temp[] = new String[5];
        double cost=0;
        
  
        //Vrisko ola ta magazia
        csvReader.mark(10000);
        while ((row = csvReader.readLine())!= null) {
            if(!shopNames.contains(row.split(",")[0]))    
                shopNames.add(row.split(",")[0]);
            //if(!shopItems.contains(row.split(",")[1]))    
                //shopItems.add(row.split(",")[1]);
        }
        
        csvReader.reset();
        int i=0;
        int j=0;
        while(i<shopNames.size()){
            while ((row = csvReader.readLine())!= null)
                if(row.split(",")[0].equals(shopNames.get(i)))
                    shopItems.add(row.split(",")[1]);
            
            csvReader.reset();
            if(shopItems.containsAll(lista.getItemList()) )
               this.storeName.add(shopNames.get(i));
            
            shopItems.clear();
            i++;   
        }
        
        csvReader.reset();
        i=0;
        
        //Ypologismos kostous lista gia kathe magazi
        while(i<this.storeName.size()){
            while ((row = csvReader.readLine())!= null)
                if(row.split(",")[0].equals(this.storeName.get(i)) && lista.getItemList().contains(row.split(",")[1]))
                    cost = cost + Double.parseDouble(row.split(",")[4])*paraggelia.getQuantityPeritem(row.split(",")[1]);       
            
            this.cost.add(cost);
            csvReader.reset();
            cost=0;
            i++;
        }
 
                   
        csvReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getStoreName(int i) {
        return storeName.get(i);
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public List<Proion> getShoppingList() {
        return shoppingList;
    }
    
    public void setStoreImage(){
        storeImage.add(new ImageIcon("src/images/download.jpg"));
    }

    public ImageIcon getStoreImage(int i) {
        return storeImage.get(i);
    }

    public double getCost(Integer i) {
        return cost.get(i);
    }

    public List<Double> getDistance() {
        return distance;
    }

    public int getStoreRating(int i) {
        return storeRating.get(i);
    }
    
    public int getSizeOfPinaka(){
        return this.storeName.size();
    }
    
    public void setRating(){
        try{
        BufferedReader csvReader = new BufferedReader(new FileReader("src/magazatores2.txt"));
        String row;
        String data[];
        csvReader.mark(10000);
        
        for(int i=0; i<storeName.size(); i++){
            while((row = csvReader.readLine()) != null)
                if(storeName.get(i).equals(row.split(",")[0])){
                    storeRating.add(Integer.parseInt(row.split(",")[6]));
                    break;
                }
            csvReader.reset();
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }   
    }
    
    
        
    
}
