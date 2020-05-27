/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psoumnisma.interfaces;

/**
 *
 * @author Christos
 */
public class ResultsScreenUI extends javax.swing.JFrame {

    /**
     * Creates new form ResultsScreenUI
     */
    public ResultsScreenUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alphabetical = new javax.swing.JButton();
        rating = new javax.swing.JButton();
        cost = new javax.swing.JButton();
        distance = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alphabetical.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        alphabetical.setText("Alphabetical");
        alphabetical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphabeticalActionPerformed(evt);
            }
        });

        rating.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rating.setText("Rating");

        cost.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cost.setText("Cost");

        distance.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        distance.setText("Distance");

        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Shop Image", "Shop Name", "List Cost (euro)", "Distance", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultsTable);

        jMenu1.setText("Home");
        menuBar.add(jMenu1);

        jMenu2.setText("Create List");
        menuBar.add(jMenu2);

        jMenu3.setText("Completed Lists");
        menuBar.add(jMenu3);

        jMenu4.setText("FAVOURITE PRODUCTS");
        menuBar.add(jMenu4);

        jMenu5.setText("Log out");
        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(alphabetical)
                .addGap(18, 18, 18)
                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alphabetical)
                    .addComponent(distance)
                    .addComponent(cost)
                    .addComponent(rating))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alphabeticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphabeticalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alphabeticalActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alphabetical;
    private javax.swing.JButton cost;
    private javax.swing.JButton distance;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton rating;
    private javax.swing.JTable resultsTable;
    // End of variables declaration//GEN-END:variables
}
