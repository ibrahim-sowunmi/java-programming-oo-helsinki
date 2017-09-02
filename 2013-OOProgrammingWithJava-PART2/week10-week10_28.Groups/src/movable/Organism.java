/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author ibz
 */
public class Organism implements Movable{
    private int xPosition;
    private int yPosition;
    
    public Organism(int dx, int dy) {
        this.xPosition = dx;
        this.yPosition = dy;
    }

    @Override
    public void move(int dx, int dy) {
        xPosition += dx;
        yPosition += dy;
    }
    
    public String toString() {
        return "x: " + this.xPosition + "; y: " + yPosition;
    } 
    
}
