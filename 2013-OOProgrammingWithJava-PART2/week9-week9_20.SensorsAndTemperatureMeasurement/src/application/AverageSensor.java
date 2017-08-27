/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;
/**
 *
 * @author ibz
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensorStore = new ArrayList<Sensor>();
    private List<Integer> tempList = new ArrayList<Integer>();
    
    public void addSensor(Sensor sensor) {
        sensorStore.add(sensor);
    }

    @Override
    public boolean isOn() {
        boolean store = true;
        for (Sensor item : sensorStore) {
            if (item.isOn() != true) {
                store = false;
            }
        }
        return store;
    }

    @Override
    public void on() {
        for (Sensor item : sensorStore) {
            item.on();
        }
   
    }

    @Override
    public void off() {
        for (Sensor item : sensorStore) {
            item.off();
        }
       
    }

    @Override
    public int measure() {
        if (isOn() == false) {
            throw new IllegalStateException("Not all sensors are on");
        } else {
        int num = 0;
        int total = 0;
        int val = 0;
        int average = 0;
        for (Sensor item : sensorStore) {
            val = item.measure();
            total += item.measure();
            num++;
        }
        
        average = total / num;
        this.tempList.add(average);
        return average;
        }
        
        
    }
    
    public List<Integer> readings() {
        return this.tempList;
    }
    
    
}
