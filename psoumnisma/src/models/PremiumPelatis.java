/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author Pavlos
 */
public class PremiumPelatis extends Pelatis {
    private int points;
    private List<Prosfora> offers;
    private List<Proion> favoriteItemList;
    
    public PremiumPelatis(Pelatis pelatis){
        super(pelatis.getName(),pelatis.getSurname(),pelatis.getEmail(),pelatis.getPassword(),pelatis.getTelephoneNumber(),pelatis.getPassword(),pelatis.getCoordinates1(),pelatis.getCoordinates2(),pelatis.getPremium());
    }
  // private List<Proion> favouriteItemsList;         
            
//public void setOffers(List<Prosfora> offers){
   //this.offers = new List<Prosfora>(offers);
//}

    public int getPoints() {
        return points;
    }
    
    public void setOffers(Prosfora offer) {
        this.offers.add(offer);
    }
    
    public List<Proion> getFavoriteItemList() {
        return this.favoriteItemList;
    }


   
}
