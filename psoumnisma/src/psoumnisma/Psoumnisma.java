/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psoumnisma;
import javax.swing.JFrame;
import psoumnisma.interfaces.PelatisUI;

/**
 *
 * @author Marios
 */
public class Psoumnisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PelatisUI pelatis = new PelatisUI();
        
        pelatis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pelatis.setSize(900,600);
        pelatis.setVisible(true);
    }
    
}
