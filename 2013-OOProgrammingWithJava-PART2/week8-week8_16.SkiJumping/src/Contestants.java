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

public class Contestants {
    private ArrayList<Contestant> contestants;
    private ArrayList<Integer> judgedScores;
    
    public Contestants() {
        this.judgedScores = new ArrayList<Integer>();
        this.contestants = new ArrayList<Contestant>();
    }
    
    public void addContestant(Contestant name) {
        this.contestants.add(name);
    }
    
    
    public ArrayList<Contestant> sortedList() {
        Collections.sort(contestants);
        return this.contestants;
    }
    
    public ArrayList<Integer> generateJudgeScores() {
        Random rand = new Random();
        int num = rand.nextInt(9) + 10;
        ArrayList<Integer>  temp = new ArrayList<Integer>();
        
        for (int i = 0 ; i < 5 ; i++) {
            num = rand.nextInt(9) + 10;
            temp.add(num);
        }
        Collections.sort(temp);
        return temp;
    }
    
    public int generateContestantScore(Contestant name) {
        Random rand = new Random();
        int num = rand.nextInt(60) + 60;
        name.raiseScore(num);
        return num;
    }
    
    public void judgeScore(String name) {
        
        if (this.contestants.contains(name)) {
            
        }
    }
    
    
 


    
}
