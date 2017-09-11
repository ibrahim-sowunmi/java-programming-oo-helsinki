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
public class OneThingBox extends Box{
    private List<Thing> oneItem = new ArrayList<Thing>(); ;

    @Override
    public void add(Thing thing) {
        if (oneItem.isEmpty()) {
            this.oneItem.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (oneItem.contains(thing)) {
            return true;
        }
        return false;
    }
    

    
}
