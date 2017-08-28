/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.*;

/**
 *
 * @author ibz
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private int AmountOfDuplicates = 0;
    private Set<String> list;
   
    
    public PersonalDuplicateRemover() {
        this.list = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if (list.contains(characterString)) {
            this.AmountOfDuplicates++;
        } else {
            this.list.add(characterString);
        }
        
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.AmountOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.list;
    }

    @Override
    public void empty() {
        this.list = new HashSet<String>();
        this.AmountOfDuplicates = 0;
    }
    
}
