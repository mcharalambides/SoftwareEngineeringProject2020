/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psoumnisma.interfaces;

import java.awt.Window;
import javax.swing.JFrame;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import models.Proion;
import pop_up_windows.addOffer;

/**
 *
 * @author Pavlos
 */
public class AddProductUI extends javax.swing.JFrame {
    
    List<Proion> productList;
    
    public AddProductUI(List<Proion> productList) {
        initComponents();
        this.productList = productList;
        test(productList);
    }
    
    public void test(List<Proion> productList){
        
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Product name");
        table.addColumn("Quantity");
        table.addColumn("Description");

        String row;
        int rows = productList.size();
        
        for (int i=0; i<rows; i++) {
            table.insertRow(i, new String[]{productList.get(i).getName(), String.valueOf(productList.get(i).getQuantity()), productList.get(i).getDescription()});
        }
              
        productsTable.setModel(table);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        add = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remove.setText("-");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(productsTable);

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Add offer");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Product List");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Log out");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jButton1)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.gc();
        for(Window window : Window.getWindows()) 
            window.dispose();
        SindesiUI sindesi = new SindesiUI();
        
        sindesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sindesi.setSize(700,600);
        sindesi.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void addProduct(String name,int quantity,String description, double price){
        //Prosthiki neou proiontos
    }
    
    private void saveChanges(String name,int quantity,String description, double price){
        //Perasma proionton me nees times
    }
    
    private void deleteProduct(){
        //Diagrafi proiontos apo tin lista proiontwn tou magazatora
        
    }
     
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        DefaultTableModel model = (DefaultTableModel)this.productsTable.getModel();
        model.addRow(new Vector<>());
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        DefaultTableModel model = (DefaultTableModel)this.productsTable.getModel();
        model.removeRow(this.productsTable.getSelectedRow());
    }//GEN-LAST:event_removeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HomeClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeClicked
        this.dispose();
    }//GEN-LAST:event_HomeClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        this.dispose();
        AddProductUI copy = new AddProductUI(productList);
        copy.setVisible(true);
        copy.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenu3MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable productsTable;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables
}
