/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohit
 */
public class ManageRestaurantInfo extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private Restaurant restaurant;
    /**
     * Creates new form ManageRestaurantInforJPanel
     */
    public ManageRestaurantInfo(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        System.out.println(restaurantDirectory.getRestaurantDirectory().size() + "   ...... ");
        for(Restaurant res : this.restaurantDirectory.getRestaurantDirectory()) {
            System.out.println(res.getRestaurantName() + " " + account.getEmployee().getName());
            if(account.getEmployee().getName().equals(res.getRestaurantName())) {
                this.restaurant = res;
                break;
            }
        }
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblRestaurant3.getModel();
        dtm.setRowCount(0);
        Object [] row = new Object[4];
        row[0] = restaurant;
        row[1] = restaurant.getAddress();
        row[2] = restaurant.getManagerName();
        row[3] = restaurant.getPhoneNumber();
        
        dtm.addRow(row);
    }
    
    public void refreshTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblRestaurant3.getModel();
        dtm.setRowCount(0);
        
        Object [] row = new Object[4];
        row[0] = restaurant;
        row[1] = restaurant.getAddress();
        row[2] = restaurant.getManagerName();
        row[3] = restaurant.getPhoneNumber();
        dtm.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurant3 = new javax.swing.JTable();
        btnModify3 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblRestaurant3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Restaurant Name ", "Address", "Manager Name", "Mobile Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRestaurant3.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblRestaurant3.setSelectionForeground(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(tblRestaurant3);

        btnModify3.setText("Submit");
        btnModify3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModify3ActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        jLabel1.setText("Manage Restaurant Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModify3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnModify3)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModify3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModify3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurant3.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant restaurant = (Restaurant)tblRestaurant3.getValueAt(selectedRow,0);
        ModifyRestaurantInfo modifyManager = new ModifyRestaurantInfo(userProcessContainer, ecoSystem, restaurantDirectory, restaurant);
        userProcessContainer.add("ModifyRestaurantInfoJPanel",modifyManager);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModify3ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnModify3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurant3;
    // End of variables declaration//GEN-END:variables
}
