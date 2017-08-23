import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passlength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passlength = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "abcdefghijklmnopqrstuvwxyz";
        int i = 0;
        String temppass = "";
        int number = random.nextInt(26);
        
        while (i < this.passlength) {
            temppass += password.charAt(number);
            i++;
            number = random.nextInt(26);
        }
        
        
        return temppass;
    }
}
