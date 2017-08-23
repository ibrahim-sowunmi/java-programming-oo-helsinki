
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        Integer guess = 120;
        Integer guesses = 0;
        while (guess != numberDrawn) {
            guess = Integer.parseInt(reader.nextLine());
            guesses++;
            if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guesses);
            } else if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else {
                System.out.println("Congratulations, your guess is correct!");
            }
            
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
