/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Pavlos
 */
public class Aksiologisi {
    private int rating;
    private String comments;
    private String storeName;
    private String premiumCustomerName;

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setPremiumCustomerName(String premiumCustomerName) {
        this.premiumCustomerName = premiumCustomerName;
    }
    
    
    
}
