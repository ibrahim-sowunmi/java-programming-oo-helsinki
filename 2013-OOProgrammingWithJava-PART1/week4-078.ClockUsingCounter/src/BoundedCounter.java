/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }
    
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if (value <= 0 || value > upperLimit){ 
            this.value = 0;
        } else {
            this.value = value;
        }
    }
    
}
