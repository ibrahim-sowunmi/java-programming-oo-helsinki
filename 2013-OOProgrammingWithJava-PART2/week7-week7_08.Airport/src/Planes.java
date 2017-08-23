/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Planes {
    final private String name;
    final private String capacity;
    private String flight;
    
    public Planes(String name, String capacity, String flight) {
        this.name = name;
        this.capacity = capacity;
        this.flight = flight;
    }
    
    public Planes(String name, String capacity) {
        this(name, capacity, null);
    }            
    
    public String planeName() {
        return this.name;
    }
    
    public String planeCapacity() {
        return "(" + this.capacity + " ppl)";
    }
    
    public String planeFlight() {
        return this.flight;
    }
    
    public String planeInfo() {
        return this.name + " (" + this.capacity + " ppl)";
    }
}
