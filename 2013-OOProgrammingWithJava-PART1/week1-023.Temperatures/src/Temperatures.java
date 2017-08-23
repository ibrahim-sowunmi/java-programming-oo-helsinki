
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Type a number: ");
            Double num = Double.parseDouble(reader.nextLine());
            
            if (num < 40 && num > -30) {
                Graph.addNumber(num);
            } else {
                num += 0;
            }
        }
        // Graph is used as follows:
   
        // Remove or comment out these lines above before trying to run the tests.
    }
}