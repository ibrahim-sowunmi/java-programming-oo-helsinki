/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Player {
    private String playerName;
    private int AmountOfGoals;
    
    public Player(String playerName) {
        this.playerName = playerName;   
        this.AmountOfGoals = 0;
    }
    
    public Player(String playerName, int AmountOfGoals) {
        this(playerName);
        this.AmountOfGoals = AmountOfGoals;
    }

    public int goals() {
        return this.AmountOfGoals;
    }
    
    public String getName() {
        return this.playerName;
    }
    
    public String toString() {
        return this.playerName + ", goals " + this.AmountOfGoals;
    }
}
