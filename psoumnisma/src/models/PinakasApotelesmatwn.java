
package models;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Exception;

public class PinakasApotelesmatwn {
    private String storeName;
    private File storeImage;
    private Integer cost;
    private Double distance;
    private Integer storeRating;
    
    public PinakasApotelesmatwn(Lista lista){
        checkMagazatores(lista);
    }
    
    public void checkMagazatores(Lista lista) {
        try{
        String path = "src/magazatores.txt";
        BufferedReader csvReader = new BufferedReader(new FileReader(path));
        String row;
        
            while ((row = csvReader.readLine())!= null) {
                String[] data = row.split(",");
                System.out.println(data[6]);
                
            }

        csvReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
