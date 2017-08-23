
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        
        Integer base = 1;
        Integer roof = Integer.parseInt(reader.nextLine());
        while ( base <= roof ) {
            System.out.println(base);
            base++;
        }
        
    }
}
