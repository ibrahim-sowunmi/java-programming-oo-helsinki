/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> Notes;
    
    public PromissoryNote() {
        this.Notes = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWho, double value) {
        toWho = stringClean(toWho);
        this.Notes.put(toWho, value);
        
    }
    
    public double howMuchIsTheDebt(String whose) {
        whose = stringClean(whose);
        if (Notes.containsKey(whose)) {            
            double amount = this.Notes.get(whose);
            return amount;
           }
        return 0;
    }
        
    
    public String stringClean(String name) {
        name = name.toLowerCase();
        name = name.trim();
        return name;
    }
    
    
}
