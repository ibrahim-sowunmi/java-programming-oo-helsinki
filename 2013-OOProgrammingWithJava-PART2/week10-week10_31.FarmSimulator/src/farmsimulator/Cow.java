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
public class Cow implements Alive, Milkable{
    private String name;
    private double capacity;
    private double volume = 0;
    private String[] NAMES  = new String[] {
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
   
    
    public Cow() {
       int index = (int) (Math.random() * 30);
       this.name = NAMES[index];
       this.capacity = 15 + new Random().nextInt(26);
       
    }
    
    public Cow(String name) {
        this.name = name;
        this.capacity =  15 + new Random().nextInt(26);
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        return this.capacity;
    }
    
    public double getAmount() {
        return this.volume;
    }
    
    public String toString() {
        return this.name + " " + Math.ceil(volume) + "/" + Math.ceil(capacity);
    }

    @Override
    public void liveHour() {
        Random random = new Random();
        this.volume += (7 + random.nextInt(20 - 7 + 1)) / 10.0;
        if (this.volume > this.capacity) {
            this.volume = this.capacity;
        }
    }

    @Override
    public double milk() {
        double myMilk = this.volume;
        this.volume = 0;
        return myMilk;
    }
    
    
}
