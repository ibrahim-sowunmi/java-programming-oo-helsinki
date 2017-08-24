/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.HashMap; import java.util.HashSet;
import java.util.Map; import java.util.Set;

public class Storehouse {
     private Map<String, Integer> storageprice;
     private Map<String, Integer> storagestock;
     
    public Storehouse() {
        this.storageprice = new HashMap<String, Integer>();
        this.storagestock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.storageprice.put(product, price);
        this.storagestock.put(product, stock);
    }
    
    public int price(String product) {
        if (!storageprice.containsKey(product)) {
            return -99;
        }
        return storageprice.get(product);
    }
    
    public int stock(String product) {
        if (storagestock.containsKey(product) == true) {
            int instock = storagestock.get(product);
            return instock;
        }
        return 0;
    }
    
    public boolean take(String product) {
        int temp = 0;
        if (storagestock.containsKey(product)) {
            temp = this.storagestock.get(product);
            if (temp >= 1) {
            temp--;
            this.storagestock.put(product, temp);  
            return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        Set list = new HashSet<String>();
        for (String key : this.storagestock.keySet()) {
           list.add(key);
        }
        return list;
    }
    
    
}


