/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Aviant {

    final String name;
    private final String latName;
    private int Observe;
    
    public Aviant(String name, String latName) {
        this.name = name;
        this.latName = latName;
        this.Observe = 0;
                    
    }
    
    public int Observe() {
        return this.Observe++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatName() {
        return this.latName;
    }
    
    public int Observed() {
        return this.Observe();
    }
    
    public String toString() {
        return this.name + " (" + this.latName + "): " + this.Observe + " observations";
    }
}
