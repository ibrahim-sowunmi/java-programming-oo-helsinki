/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

/**
 *
 * @author ibz
 */
public class BlackHoleBox extends Box{
    private int weight;
    private List<Thing> things = new ArrayList<Thing>();

    @Override
    public void add(Thing thing) {
        this.weight += thing.getWeight();
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
}
