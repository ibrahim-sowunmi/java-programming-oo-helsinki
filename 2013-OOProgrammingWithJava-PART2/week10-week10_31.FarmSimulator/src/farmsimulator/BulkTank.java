/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author ibz
 */
public class BulkTank {
    private double capacity;
    private double volume = 0;
    
    public BulkTank() {
        //LEAVE ME ALONE, MAN IN MY ZONE!
        this(2000);
        
    }
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount) {
        if (this.volume + amount <= this.capacity) {
            this.volume += amount;
        } else {
            this.volume = this.capacity;
        }
    }
    
    public double getFromTank(double amount) {
        if (this.volume <= amount) {
            this.volume = 0;
            return this.volume;
        } else {
            this.volume -= amount;  
            return this.volume;
        }
    }
    
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
    
}
