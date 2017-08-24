/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.*;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        Purchase purchase = null;
        if (purchases.containsKey(product)) {
            purchase = this.purchases.get(product);
            purchase.increaseAmount();
        } else {
            purchase = new Purchase(product, price);
            this.purchases.put(product, purchase);
        }
        
    } 
    
    public int price() {
        int num = 0;
        for (String key : purchases.keySet()) {
            Purchase temp = purchases.get(key);
            num += temp.price();
        }
        return num;
    }
    
    public void print() {
        for (String key : purchases.keySet()) {
            Purchase temp = purchases.get(key);
            System.out.println(temp.toString());
        }
    }
    
    
    
   
}
