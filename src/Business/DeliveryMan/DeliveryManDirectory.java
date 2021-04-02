/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;
    
    public DeliveryManDirectory() {
        deliveryManDirectory = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryMan newDeliveryMan(String name, String addr, String email, String phoneNum, int age) {
        DeliveryMan deliveryMan = new DeliveryMan(name, addr, email, phoneNum, age);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void removeDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManDirectory.remove(deliveryMan);
    }
}
