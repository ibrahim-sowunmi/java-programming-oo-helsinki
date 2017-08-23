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

public class Container {
    private final int MAX_WEIGHT_LIMIT;
    private ArrayList<Suitcase> Suitcases;
    
    public Container(int maxWeightLimit) {
        this.MAX_WEIGHT_LIMIT = maxWeightLimit;
        this.Suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeightSoFar()  <= MAX_WEIGHT_LIMIT) {
            Suitcases.add(suitcase);
        }
    }
    
    private int totalWeightSoFar() {
        int containerCurrent = 0;
        for ( Suitcase item : Suitcases) {
            containerCurrent += item.totalWeight();
        }
        return containerCurrent;
    }
    
    public String toString() {
        int val = 0;
        int num = 0;
        for (Suitcase item : Suitcases) {
            val += item.totalWeight();
            num++;
        }
        return num + " suitcases (" + val + " kg)";
    }
    
    
    public void printThings() {
        for (Suitcase item : Suitcases ) {
            item.printThings();
        }
    }
}
