/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Counter {
    private int number;
    private boolean option;
    
    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.option = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, true);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return this.number;
    }
    
    public void increase() {
        this.number++;
    }
    
    public void decrease() {
        if (this.option == true) {
            if (this.number == 0) {
            
            } else {
                this.number--;
            }
        } else {
            this.number--;
        }
    }
    
    public void increase(int amount) {
        if (amount < 0) {
            //Do nothing
        } else {
            this.number += amount;
        }
    }
     
    public void decrease(int amount) {
        if (amount < 0) {
            //Do nothing
        } else {
            if (this.option == true) {
                if (this.number - amount < 0) {
                    //Do nothing
                    this.number = 0;
                } else {
                    this.number -= amount;
                }
            } else {
                this.number -= amount;
            }
        }
        
        
    }
}
