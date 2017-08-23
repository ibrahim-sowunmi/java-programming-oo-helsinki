
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         // Use carrot as password when running tests.
        
        
        
        while (true) {
            System.out.println("Type the password: ");
            String password = reader.nextLine();
            System.out.println("Wrong!");
            if (password.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
            }
        }

        // Write your code here
    }

