/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.ArrayList;
public class Team {
    
    private String teamName;
    private ArrayList<Player> Players = new ArrayList<Player>();
    private int maxSize = 16;
    
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    public String getName() {
        return this.teamName;
    }
    
    public void addPlayer(Player player) { 
        if (Players.size() >= maxSize) {
            //Do nothing
        } else {
            this.Players.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player person : Players) {
            System.out.println(person);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.Players.size();
    }
    
    public int goals() {
        int i = 0;
        for (Player person : Players) {
            i += person.goals();
        }
        return i;
    }
    
}
