/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop_up_windows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import models.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class paraggeliaWindow extends javax.swing.JFrame {
    
    private String magazatoras;
    private List<Proion> shoppingList;
    private String customerName;
    private List<Double> costs;
    private double completeCost;
    
    public paraggeliaWindow(String magazatoras,List<Proion> shoppingList, String customerName) {
        initComponents();
        costs = new ArrayList<Double>();
        this.magazatoras = magazatoras;
        this.shoppingList = shoppingList;
        this.customerName = customerName;
        
        //Vriskw ta kostoi gia kathe proion
        getCost();
        
        //Dimiourgia tou pianka
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Product");
        table.addColumn("Quantity");
        table.addColumn("Cost(Euro)");
        
        for(int i=0; i<shoppingList.size(); i++){
            table.addRow(new Object[]{shoppingList.get(i).getName(),shoppingList.get(i).getQuantity(),costs.get(i)} );
            completeCost = completeCost + costs.get(i)*shoppingList.get(i).getQuantity();
        }

        this.orderTable.setModel(table);
        this.totalCost.setText(String.valueOf(String.format("%.2f", completeCost)));
        
        //Vriskw ta stoixeia tou magazatora
        getMagazatoras(); 
    }

    public void getMagazatoras(){
        try{
        BufferedReader csvReader = new BufferedReader(new FileReader("src/magazatores2.txt"));
        String address=null,telephone=null,row,data[];
        
        //Find address and telephone for the specific shop
        while((row = csvReader.readLine()) != null){
            data = row.split(",");
            if(data[0].equals(magazatoras)){
                telephone = data[2];
                address = data[3];
                break;
            } 
        }
        
        this.address.setText(address);
        this.telephone.setText(telephone);
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void getCost(){
        try{
        BufferedReader csvReader = new BufferedReader(new FileReader("src/proionta_magaziwn.txt"));
        csvReader.mark(1000);
        
        String address=null,telephone=null,row,data[];  
        List<String> items = new ArrayList<String>();
        
        //create a String List of the items
        for(Proion item:shoppingList)
            items.add(item.getName());
        
        //Find costs for the specific shop
        for(Proion item:shoppingList){
        while((row = csvReader.readLine()) != null){
            data = row.split(",");
            if(data[0].equals(magazatoras) && item.getName().equals(data[1]))
                   costs.add(Double.parseDouble(data[4]));
        }
        csvReader.reset();
        }
         
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        delivery = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        telephone = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        totalCost = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Total cost:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jCheckBox1.setText("APPLY DISCOUNT");

        delivery.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        delivery.setText("DELIVERY");
        delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Telephone:");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Cost (euro)"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        totalCost.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(56, 56, 56)
                .addComponent(delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryActionPerformed
      try{
          BufferedWriter writer = new BufferedWriter( new FileWriter("src/paraggelies.txt", true));
          
            String str1 = this.customerName;
            String str2 = this.magazatoras;
            String str3 = this.telephone.getText();
            String str4 = totalCost.getText();
            String str5 = orderTable.getValueAt(0,0).toString();
            String str6 = orderTable.getValueAt(0,1).toString();
            
            for(int i=1; i<orderTable.getRowCount(); i++){
                str5 = str5 + " " + orderTable.getValueAt(i,0);
                str6 = str6 + " " + orderTable.getValueAt(i,1); 
            }
            
            writer.write(str1 +","+ str2+","+str3+","+str4+","+str5+","+str6);  
            writer.newLine();
            writer.close();  
              
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        }  
        JOptionPane.showMessageDialog(null, "Order Added Successfully");
    }//GEN-LAST:event_deliveryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton delivery;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    private javax.swing.JLabel telephone;
    private javax.swing.JLabel totalCost;
    // End of variables declaration//GEN-END:variables
}
