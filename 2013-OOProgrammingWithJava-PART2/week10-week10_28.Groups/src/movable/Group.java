/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.*;

/**
 *
 * @author ibz
 */
public class Group implements Movable{
    private List<Movable> group = new ArrayList<Movable>();
            
    @Override
    public void move(int dx, int dy) {
        for (Movable organism : group) {
            organism.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String l = "";
        for (Movable organism : group) {
            l += organism + "\n";
        }
        return l;
    }
    
    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }
    
    
}
