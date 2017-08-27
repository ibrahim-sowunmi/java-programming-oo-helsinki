package file;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // test your code here

    File file = new File("test/testfile.txt");
    Analysis analysis;
        try {
            analysis = new Analysis(file);
                System.out.println("Lines: " + analysis.lines() + analysis.lines());
    System.out.println("Characters: " + analysis.characters());
        } catch (Exception ex) {
            System.out.println("errah");
        }

       
    }
}
