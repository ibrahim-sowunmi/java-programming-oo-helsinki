/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;
import containers.*;

/**
 *
 * @author ibz
 */
public class ContainerHistory {
    private List<Double> containerHistory;
    
    public ContainerHistory() {
        this.containerHistory = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        this.containerHistory.add(situation);
    }
    
    public void reset() {
        this.containerHistory.clear();
    }
    
    public String toString() {
        return this.containerHistory.toString();
    }
    
    public double maxValue() {
        
        if (!this.containerHistory.isEmpty()) {
            double i = 0;
            for (Double number : this.containerHistory) {
                if (number >= i) {
                    i = number;
                } 
            }
            return i;
        } 
        return 0;
    }
    
    public double minValue() {
        
        if (!this.containerHistory.isEmpty()) {
            double i = this.containerHistory.get(0);
            for (Double number : this.containerHistory) {
                if (number <= i) {
                    i = number;
                } 
            }
            return i;
        } 
        return 0;
    }
    
    public double average() {
        double total = 0; 
        if (!this.containerHistory.isEmpty()) {
            for (Double number : this.containerHistory) {
                total += number;
            } 
            return total/this.containerHistory.size();
        }
        return 0;
    }
    
    public double greatestFluctuation() {
        if (!this.containerHistory.isEmpty()) {
            double j = 0;
            for (int i = 0 ; i < this.containerHistory.size()-1 ; i++) {
               double k =  Math.abs(this.containerHistory.get(i)-this.containerHistory.get(i+1));
                if (k > j ) {
                    j = k;
                }
            }
            return j;
        }
        return 0;
    }
    
    public double variance() {
        if (this.containerHistory.size() <= 1) {
            return 0;
        }
        
        double sum = 0;
        for (double number : this.containerHistory) {
            sum += number;
        }
        double avg = sum / this.containerHistory.size();
        List<Double> valStore = new ArrayList<Double>();
        
        for (double number : this.containerHistory) {
            valStore.add(Math.pow((number - avg), 2));
        }
        
        double result = 0;
        for (double number : valStore) {
            result += number;
        }
    
        result = result/(this.containerHistory.size() - 1 );
        return result;
    }
    
    
}
