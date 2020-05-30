/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psoumnisma;
import javax.swing.JFrame;
import psoumnisma.interfaces.SindesiUI;
import models.*;
import psoumnisma.interfaces.MagazatorasUI;

/**
 *
 * @author Marios
 */
public class Psoumnisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pelatis pelatis1 = new Pelatis("Marios","Charalambides","mcharalampidis@ceid.upatras.gr","1234","6941523843","Mourouzi 25",false);
        //Pelatis pelatis2 = new Pelatis("Pavlos","Kwnstantinou","pavlkwn@ceid.upatras.gr","5678","6942569831","Gkotsi 28",false);
        //Pelatis pelatis3 = new Pelatis("Rafael","Neofytou","rafaneof@ceid.upatras.gr","4786","6947858311","Giannitswn 15",true);
        //Pelatis pelatis4 = new Pelatis("Christos","Costa","chkosta@ceid.upatras.gr","9933","6957849000","Favierou 23",true);
        
        SindesiUI sindesi = new SindesiUI();
        
        sindesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sindesi.setSize(700,600);
        sindesi.setVisible(true);
        
        //Magazatoras
        //Magazatoras magaz1 = new Magazatoras();
        
        //MagazatorasUI magazUI = new MagazatorasUI();
        
        //magazUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //magazUI.setSize(900,600);
        //magazUI.setVisible(true);
    }
    
}
