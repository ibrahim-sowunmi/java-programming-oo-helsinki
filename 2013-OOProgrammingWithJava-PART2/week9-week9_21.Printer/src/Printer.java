

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author ibz
 */
public class Printer {
    private File file;
    private Scanner reader;
    
    
    public Printer(String fileName)  {
        this.file = new File(fileName);
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException{
        reader = new Scanner(file);
        if (word.equals("")) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } else {
            String line = "";
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        }
    }
    
    
    
}
