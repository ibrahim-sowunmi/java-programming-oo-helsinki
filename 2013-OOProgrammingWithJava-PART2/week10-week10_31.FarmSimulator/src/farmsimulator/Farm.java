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
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private Collection<Cow> cowList;
    
    public Farm(String name, Barn barn) {
        this.owner = name;
        this.barn = barn;
        this.cowList = new LinkedList();
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    @Override
    public String toString() {
        return "Farm owner: " + this.getOwner() + "\n" + "Barn bulk tank: " +
                this.barn + "\n" + "Animals:" + "\n" + gotCows();
                
    }
    
    private String gotCows() {    
        if (this.cowList == null) {
            return "No cows.";
        } else {
            String s = "";
            for (Cow cow : cowList) {
                s +=  "        " + cow + "\n";
            }
            return s;
        } 
    }
    
    public void addCow(Cow cow) {
        this.cowList.add(cow);
    }

    @Override
    public void liveHour() {
        for (Cow cow : cowList) {
            cow.liveHour();
        }
    }
    
    public void manageCows() {
        this.barn.takeCareOf(cowList);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }
    
    
    
}
