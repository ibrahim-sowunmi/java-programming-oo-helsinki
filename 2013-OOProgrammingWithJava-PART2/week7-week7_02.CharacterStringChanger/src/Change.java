/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;
    
    public Change(char fromCharacter, char toCharacter) {
    this.fromCharacter = fromCharacter;
    this.toCharacter = toCharacter;
    }
    
    public String change(String characterString) {
        String StringVersionFrom = Character.toString(fromCharacter);
        String StringVertionTo = Character.toString(toCharacter);
        
       return characterString.replaceAll(StringVersionFrom, StringVertionTo);
    }
    
    
    
}
