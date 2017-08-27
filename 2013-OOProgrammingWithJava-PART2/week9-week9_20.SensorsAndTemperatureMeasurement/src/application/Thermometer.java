/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author ibz
 */
public class Thermometer implements Sensor{
    private boolean isOn;
    private Random rand = new Random();
    
    public Thermometer() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if ( isOn == true ) {            
            return rand.nextInt(60) - 30; 
        }
        throw new IllegalStateException("Kill the coons!");
    }
    
    
    
}
