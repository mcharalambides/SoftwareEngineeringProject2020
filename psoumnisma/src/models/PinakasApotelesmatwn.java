
package models;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Exception;
import java.util.*;

public class PinakasApotelesmatwn {
    private List<String> storeName;
    private File storeImage;
    private List<Integer> cost;
    private List<Double> distance;
    private List<Integer> storeRating;
    
    public PinakasApotelesmatwn(Lista lista){
        storeName = new ArrayList<String>();
        cost = new ArrayList<Integer>();
        distance = new ArrayList<Double>();
        storeRating = new ArrayList<Integer>();
        checkMagazatores(lista);
        
    }
    
    public void checkMagazatores(Lista lista) {
        try{
        BufferedReader csvReader = new BufferedReader(new FileReader("src/magazatores.txt"));
        String row;
        Set<String> shopItems = new HashSet<String>();
        int rowNum = 0;
        
            while ((row = csvReader.readLine())!= null) {
                String[] data = row.split(",");
                List<String> copy = Arrays.asList(data[6].split(" "));
                shopItems.addAll(copy);
                if(shopItems.containsAll(lista.getItemList())){
                    this.storeName.add(data[0]);
                    this.storeRating.add(Integer.parseInt(data[4]));
                }
                shopItems.clear();
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

    public File getStoreImage() {
        return storeImage;
    }

    public List<Integer> getCost() {
        return cost;
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
    
//    public double calculateCost(){
//        
//    }
//    
    
    
}
