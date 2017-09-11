/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;
/**
 *
 * @author ibz
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    

    @Override
    public void add(Thing thing) {
        int weight = 0;
        for (Thing item : things) {
            weight += item.getWeight();
        }
        if (thing.getWeight() + weight <= this.maxWeight) {
            this.things.add(thing);
        }
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (things.contains(thing)) {
            return true;
        }
        return false;
    }
    
}
