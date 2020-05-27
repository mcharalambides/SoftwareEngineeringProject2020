package models;

public class Pelatis {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String telephoneNumber;
    private String address;
    private int coordinates[];
    
    public Pelatis(String name,String surname,String email,String password,String telephoneNumber,String address){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
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

    public int[] getCoordinates() {
        return coordinates;
    }
    
    
}
