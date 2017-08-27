/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;

/**
 *
 * @author ibz
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> contains;
    
    public Box(int maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    this.contains = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if (thing.getVolume() + this.getVolume() <= maximumCapacity) {
            this.contains.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing item : contains) {
            volume += item.getVolume();
        }
        return volume;
    }
    
}
