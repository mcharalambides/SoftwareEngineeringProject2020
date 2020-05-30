package models;

public class Pelatis {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String telephoneNumber;
    private String address;
    private int coordinates1;
    private int coordinates2;
    private Boolean premium;
    
    public Pelatis(String name,String surname,String email,String password,String telephoneNumber,String address,int coordinates1,int coordinates2,Boolean premium){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.coordinates1 = coordinates1;
        this.coordinates2 = coordinates2;
        this.premium = premium;
        
        }

    public Boolean getPremium() {
        return premium;
    }
        

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelephoneNumber() {
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
    
    
}
