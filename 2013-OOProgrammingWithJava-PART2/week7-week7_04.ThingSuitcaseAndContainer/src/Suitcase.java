/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> Things;
    private int weightLimit;
    
    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        Things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeightSoFar() <= weightLimit) {
            Things.add(thing);
        }
    }
    
    private int totalWeightSoFar() {
        int suitcaseCurrent = 0;
        for ( Thing item : Things) {
            suitcaseCurrent += item.getWeight();
        }
        return suitcaseCurrent;
    }
    
    public String toString() {
        int val = 0;
        int  kg = 0;
        for (Thing item : Things) {
           val++;
           kg += item.getWeight();
        }
        if (val == 0) {
            return "empty ("  + kg + ") kg";
        }
        if (val == 1) {
            return val + " thing (" + kg + ") kg" ;
        }
        return val + " things (" + kg + ") kg" ;
    }
    
    public void printThings() {
        for (Thing item : Things) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int val = 0;
        for (Thing item : Things) {
            val += item.getWeight();
        }        
        return val;
    }
    
    public Thing heaviestThing() {

        if (Things.isEmpty()) {
            return null;
        } else {
            Thing heaviest = Things.get(0);
            for (Thing item : Things) {
                if (heaviest.getWeight() <= item.getWeight()) {
                    heaviest = item;
            }
        }  
            return heaviest;
        }
        
    }
    
    
    
    
}
