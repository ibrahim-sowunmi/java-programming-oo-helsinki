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

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
            
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = new Dictionary();
    }
    
    public void start() {
        System.out.println("Statements:\n" +
"  add - adds a word pair to the dictionary\n" +
"  translate - asks a word and prints its translation\n" +
"  quit - quits the text user interface\n");                                        
        while (true) {
            
            System.out.print("Statement: ");
            String input = reader.nextLine();
            
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if(input.equals("add")) {
                System.out.print("In Finnish: ");
                input = reader.nextLine();
                System.out.print("Translation: ");
                String input1 = reader.nextLine();
                dictionary.add(input, input1);
                System.out.println("");
            }  else if(input.equals("translate")) {
                System.out.print("Give a word: ");
                input = reader.nextLine();
                String output = dictionary.translate(input);
                System.out.println("Translation: " + output);
                System.out.println("");
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
    
    
}
