

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.*;

public class Dictionary {
    private HashMap<String, String> translation = new HashMap<String, String>();
    
    public Dictionary() {

    }
    
    public String translate(String word) {
        if (translation.containsKey(word)) {
            return translation.get(word);
        } else {
            return null;
        }
        
    }
    
    public void add(String word, String translation) {
        this.translation.put(word, translation);
    }
    
    public int amountOfWords() {
        return translation.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> pairs = new ArrayList<String>();
        String keyValPair;
        for (String key : translation.keySet()) {
            keyValPair = key + " = " + translation.get(key);
            pairs.add(keyValPair);
        }
        return pairs;
    }
    
    
    
    
}


