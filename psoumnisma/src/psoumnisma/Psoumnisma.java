/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psoumnisma;
import javax.swing.JFrame;
import psoumnisma.interfaces.PelatisUI;
import models.*;

/**
 *
 * @author Marios
 */
public class Psoumnisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelatis pelatis1 = new Pelatis("Marios","Charalambides","mcharalampidis@ceid.upatras.gr","1234","6941523843","Mourouzi 25",false);
        Pelatis pelatis2 = new Pelatis("Pavlos","Kwnstantinou","pavlkwn@ceid.upatras.gr","5678","6942569831","Gkotsi 28",false);
        Pelatis pelatis3 = new Pelatis("Rafel","Neofytou","rafaneof@ceid.upatras.gr","4786","694785831","Giannitswn 15",true);
        
        PelatisUI pelatis = new PelatisUI(pelatis3);
        
        pelatis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pelatis.setSize(900,600);
        pelatis.setVisible(true);
        
        //Magazatoras
        //Magazatoras magaz1 = new Magazatoras();
        
        //MagazatorasUI magaz = new MagazatorasUI(magaz1);
        
        //magaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //magaz.setSize(900,600);
        //magaz.setVisible(true);
    }
    
}
