/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.util.*;
import java.io.File;

/**
 *
 * @author ibz
 */
public class Analysis {
    private Scanner reader;
    private File file;
    
    public Analysis(File file) throws Exception {
        this.file = file;
        this.reader = new Scanner(file);
    }
    
    public int lines() throws Exception{
        
        this.reader = new Scanner(file);
        int numOfLines = 0;
        String f = "";
        while (reader.hasNextLine()) {
            f += reader.nextLine();
            numOfLines++;
           
        }
        return numOfLines;
    }
    
    public int characters() throws Exception {
        
        this.reader = new Scanner(this.file);
        int numOfCharacters = 0;
        String f = "";
        while (reader.hasNext()) {
            f = reader.nextLine();
            numOfCharacters++;
            char g[] = f.toCharArray();
            for (char character : g) {
                numOfCharacters++;
            }
            
        } 
        return numOfCharacters;
    }
}
