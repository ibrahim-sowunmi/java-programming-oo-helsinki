
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Scanner reader = new Scanner(System.in);
        
        PersonalInfo myMain = new PersonalInfo(reader);
        myMain.start();
    }
}
