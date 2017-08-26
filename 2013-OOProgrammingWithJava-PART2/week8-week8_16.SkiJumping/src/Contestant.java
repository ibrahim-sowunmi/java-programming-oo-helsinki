/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author ibz
 */
public class Contestant implements Comparable<Contestant> {
    private int score;
    private String name;
    private ArrayList<Integer> myJumpLengths;
    private int currentJump;
    
    public Contestant(String name, int score) {
        this.name = name;
        this.score = score;
        myJumpLengths = new ArrayList<Integer>();
    }
    
    public Contestant(String name) {
        this(name, 0);
    }
    
    public void jumpRecord() {
        for (Integer jump : myJumpLengths) {
            System.out.print(" " + jump +" m,");
        }
        System.out.println("");
    }
    
    public void raiseScore(int score) {
   
        this.score += score;
    }
    
    public void recordJumps(int jump) {
                this.myJumpLengths.add(jump);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public int currentLength() {
        return this.currentJump;
    }

    @Override
    public int compareTo(Contestant o) {
        if (this.score > o.score) {
            return -1;
        } else if (this.score < o.score) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
}
