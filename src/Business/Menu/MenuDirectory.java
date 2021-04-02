/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public class MenuDirectory {
    private ArrayList<Menu> menuDirectory;
    
    public MenuDirectory() {
        menuDirectory = new ArrayList();
    }

    public ArrayList<Menu> getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(ArrayList<Menu> menuDirectory) {
        this.menuDirectory = menuDirectory;
    }
    
    public Menu newItem(String item, double price, String restaurant) {
        Menu menu = new Menu(item, price, restaurant);
        menuDirectory.add(menu);
        return menu;
    }
    
    public void removeMenu(Menu menu) {
        menuDirectory.remove(menu);
    }
}
