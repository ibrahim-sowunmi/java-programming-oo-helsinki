import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        String test = "mikael\n" +"mika\n"+"jump\n"+"jump\n"+"jump\n"+"quit\n";
        Scanner reader = new Scanner(System.in);

        Tournament skiJump = new Tournament(reader);
        System.out.println("Kumpula ski jumping week\n");
        skiJump.Start();
        
    }
}
