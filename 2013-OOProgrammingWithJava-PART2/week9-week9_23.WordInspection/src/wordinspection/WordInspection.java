/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.*;
import java.util.*;
/**
 *
 * @author ibz
 */
public class WordInspection {
    private Scanner reader;
    private File file;
    
    public WordInspection(File file) {
        this.file = file;
    }
    
    public int wordCount() {
        String words = readFile();
        System.out.println(words);
        
      return words.split("\\s+").length;
    }
    
    public String readFile() {
        try {
            String str = "";
            
            Scanner reader = new Scanner(file, "UTf-8");
            
            while (reader.hasNextLine()) {
                str += reader.nextLine();
                str += "\n";
            }
            
            return str;
        } catch (FileNotFoundException e) {
            
            System.out.println("Does nothing");
            return "";
            
        }
    
    }
    
    public List<String> wordsContainingZ() {
        List<String> hold = new ArrayList<String>();
        
        String words = readFile();
        String[] cWords = words.split("\\s+");
        for (String word : cWords) {
            if (word.contains("z")) {
                hold.add(word);
            }           
        }
        return hold;
    }
    
    
    
    public List<String> palindromes() {
        List<String> hold = new ArrayList<String>();
        
        String words = readFile();
        String[] wordList = words.split("\\s");
        for (String word : wordList) {
            if (checkIfPalindrome(word) == true) {
                hold.add(word);
            }
        }
                
   
        return hold;
    }
    
    private Boolean checkIfPalindrome(String word) {
        String[] temp = word.split("");
        int i1 = 0; int i2 = temp.length -1;
        while (i1 < i2) {
            if (!temp[i1].equals(temp[i2]) ) {
                return false;
            }
            i1++;i2--;
        }
        return true;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        List<String> contained = new ArrayList<String>();
        String words = readFile();
        String[] temp = words.split("\\s+");
        
        for (String word : temp) {
            if (word.contains("a") && word.contains("e")
                    && word.contains("i") && word.contains("o") && word.contains("u")
                            && word.contains("y") && word.contains("ä") && word.contains("ö"))
            {
                contained.add(word);
            }
               
            
        }
        return contained;
    }
    
    public List<String> wordsEndingInL() {
        List<String> hold = new ArrayList<String>();
        
        String words = readFile();
        String[] cWords = words.split("\\s+");
        for (String word : cWords) {
            char lastChar = word.charAt(word.length()-1);
            if (lastChar == 'l') {
                hold.add(word);
            }           
        }
        return hold;
    }
    
    
}

