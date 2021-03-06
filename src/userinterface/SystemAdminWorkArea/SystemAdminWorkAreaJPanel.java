/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Organization;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Mohit
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    CustomerDirectory customerDirectory;
    RestaurantDirectory restaurantDirectory;
    DeliveryManDirectory deliveryManDirectory;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerDirectory = ecosystem.getCustomerDirectory();
        this.deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        this.restaurantDirectory = ecosystem.getRestaurantDirectory();
        populateTree();
        //lblSelectedNode.setText();
        //System.out.println("EcoSYSTEM MAIN" + ecosystem.toString() + ecosystem.getCustomerDirectory().getCustomerDirectory().size());
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        
       // Add the code for draw your system structure shown by JTree
       
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("SystemAdmin");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        ArrayList<Customer> customerList=ecosystem.getCustomerDirectory().getCustomerDirectory();
        ArrayList<DeliveryMan> deliveryList = ecosystem.getDeliveryManDirectory().getDeliveryManDirectory();
        ArrayList<Restaurant> restaurantList = ecosystem.getRestaurantDirectory().getRestaurantDirectory();
        
        
        Customer customer;
        DeliveryMan deliveryMan;
        Restaurant restaurant;
        
        DefaultMutableTreeNode customerListNode = new DefaultMutableTreeNode("Customer");
        DefaultMutableTreeNode deliveryManListNode  = new DefaultMutableTreeNode("Delivery");
        DefaultMutableTreeNode restaurantListNode = new DefaultMutableTreeNode("Restaurant");
        networks.insert(customerListNode, 0);
        networks.insert(deliveryManListNode, 1);
        networks.insert(restaurantListNode, 2);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<customerList.size();i++){
            customer=customerList.get(i);
            networkNode=new DefaultMutableTreeNode(customer.getName());
            customerListNode.insert(networkNode, i);
            
        }    
        for(int j=0; j<deliveryList.size();j++){
            deliveryMan= deliveryList.get(j);
            enterpriseNode=new DefaultMutableTreeNode(deliveryMan.getName());
            deliveryManListNode.insert(enterpriseNode, j);
        }        
                
        for(int k=0;k<restaurantList.size();k++){
            restaurant=restaurantList.get(k);
            organizationNode=new DefaultMutableTreeNode(restaurant.getRestaurantName());
            restaurantListNode.insert(organizationNode, k);
        }
           
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnCustomer12 = new javax.swing.JButton();
        btnRestaurant12 = new javax.swing.JButton();
        btnDelivery12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 215, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnCustomer12.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomer12.setText("Manage All Customers");
        btnCustomer12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCustomer12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCustomer12MouseExited(evt);
            }
        });
        btnCustomer12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomer12ActionPerformed(evt);
            }
        });

        btnRestaurant12.setBackground(new java.awt.Color(255, 255, 255));
        btnRestaurant12.setText("Manage Restaurants");
        btnRestaurant12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestaurant12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestaurant12MouseExited(evt);
            }
        });
        btnRestaurant12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurant12ActionPerformed(evt);
            }
        });

        btnDelivery12.setBackground(new java.awt.Color(255, 255, 255));
        btnDelivery12.setText("Manage Deliveryman");
        btnDelivery12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelivery12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelivery12MouseExited(evt);
            }
        });
        btnDelivery12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelivery12ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shipper_conception_painting_delivery_man_icon_cartoon_character_6840190.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/benefit-for-your-customers-png-customer-customer-png-550_411.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Restaurant-Icon-Download-1024x842.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(btnCustomer12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRestaurant12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnDelivery12, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8)))))
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblSelectedNode))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCustomer12)
                            .addComponent(btnRestaurant12)
                            .addComponent(btnDelivery12))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(258, 258, 258))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomer12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomer12ActionPerformed

        ManageCustomer mcjp = new ManageCustomer(userProcessContainer, ecosystem, customerDirectory);
        userProcessContainer.add("ManageCustomersJPanel",mcjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCustomer12ActionPerformed

    private void btnRestaurant12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurant12ActionPerformed
        ManageRestaurant mrjp = new ManageRestaurant(userProcessContainer, ecosystem, restaurantDirectory);
        userProcessContainer.add("ManageRestaurantJPanel",mrjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRestaurant12ActionPerformed

    private void btnDelivery12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelivery12ActionPerformed
       ManageDeliveryMan mdmjp = new ManageDeliveryMan(userProcessContainer, ecosystem, deliveryManDirectory);
       userProcessContainer.add("ManageDeliveryManJPanel", mdmjp);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDelivery12ActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnCustomer12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomer12MouseEntered
        // TODO add your handling code here:
        btnCustomer12.setBackground(Color.orange);
    }//GEN-LAST:event_btnCustomer12MouseEntered

    private void btnCustomer12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomer12MouseExited
        // TODO add your handling code here:
        btnCustomer12.setBackground(Color.white);
    }//GEN-LAST:event_btnCustomer12MouseExited

    private void btnRestaurant12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaurant12MouseEntered
        // TODO add your handling code here:
        btnRestaurant12.setBackground(Color.orange);
    }//GEN-LAST:event_btnRestaurant12MouseEntered

    private void btnRestaurant12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaurant12MouseExited
        // TODO add your handling code here:
        btnRestaurant12.setBackground(Color.white);
    }//GEN-LAST:event_btnRestaurant12MouseExited

    private void btnDelivery12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelivery12MouseEntered
        // TODO add your handling code here:
        btnDelivery12.setBackground(Color.orange);
    }//GEN-LAST:event_btnDelivery12MouseEntered

    private void btnDelivery12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelivery12MouseExited
        // TODO add your handling code here:
        btnDelivery12.setBackground(Color.white);
    }//GEN-LAST:event_btnDelivery12MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer12;
    private javax.swing.JButton btnDelivery12;
    private javax.swing.JButton btnRestaurant12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
