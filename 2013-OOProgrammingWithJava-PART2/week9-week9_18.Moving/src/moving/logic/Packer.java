/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import moving.domain.*;

import java.util.*;

/**
 *
 * @author ibz
 */
public class Packer {
    private int boxesVolume;
    
    public Packer(int boxVolumes) {
        this.boxesVolume = boxVolumes;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> store = new ArrayList<Box>();
        for(Thing item : things ) {
            Box box = new Box(boxesVolume);
            if (box.addThing(item) == true) {
                store.add(box);
            }
            
        }
        return store;
    }
}
