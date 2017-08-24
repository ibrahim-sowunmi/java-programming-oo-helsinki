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

public class Box implements ToBeStored {
    private double maximumweight;
    private int things;
    private ArrayList<ToBeStored> stored;
    
    
    public Box(double maximumweight) {
    this.maximumweight = maximumweight;
    this.stored = new ArrayList<ToBeStored>();
    }
    
    public double weight() {
        double current = 0;
        for (ToBeStored item : stored) {
            current += item.weight();
        }
        return current;
    }
    
    public void add(ToBeStored item) {
        if (item.weight() + weight()> maximumweight) {
        } else {
            this.things++;
            stored.add(item);
        }
    }
    
    public String toString() {
        return "Box: " + this.things + " things, total weight " + weight() + " kg";
    }
    
    public double getWeight() {
        return 0;
    }
}
