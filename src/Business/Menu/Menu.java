/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author jshar
 */
public class Menu {
    private String itemName;
    private double price;
    private String restaurantName;
    
    public Menu(String item, double price, String restName) {
        this.itemName = item;
        this.price = price;
        this.restaurantName = restName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    @Override
    public String toString() {
        return itemName;
    }
    
    
    
}
