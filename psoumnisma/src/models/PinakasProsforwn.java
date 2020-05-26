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
public class PinakasProsforwn {
    private List<Prosfora> offers;
    private List premiumCustomerNames;

    public void setOffers(List<Prosfora> offers) {
        this.offers = offers;
    }

    public void setPremiumCustomerNames(List premiumCustomerNames) {
        this.premiumCustomerNames = premiumCustomerNames;
    }
    
}
