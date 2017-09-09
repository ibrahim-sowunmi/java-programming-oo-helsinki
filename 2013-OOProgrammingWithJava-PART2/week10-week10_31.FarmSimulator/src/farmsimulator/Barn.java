/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;
/**
 *
 * @author ibz
 */
public class Barn {
    private BulkTank barnTank;
    private MilkingRobot barnRobot;
    
    public Barn(BulkTank tank) {
        this.barnTank = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.barnTank;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barnRobot = milkingRobot;
        this.barnRobot.setBulkTank(barnTank);
    }
    
    public void takeCareOf(Cow cow) {
        try {
            this.barnRobot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
        
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        for (Cow cow : cows) {
            this.barnRobot.milk(cow);
        }
    }
    
    @Override
    public String toString() {
        return "" + this.barnTank;
    }
    
   
    
    
    
    
}
