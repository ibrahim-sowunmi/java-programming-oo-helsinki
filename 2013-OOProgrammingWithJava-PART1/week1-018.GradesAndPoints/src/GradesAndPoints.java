
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Integer num1 = Integer.parseInt(reader.nextLine());
        
        if (num1 >= 0 && num1 <= 29) {
            System.out.println("failed");
        } else if ( num1 >= 30 && num1 <= 34 ) {
            System.out.println("Grade: 1");
        } else if ( num1 >= 35 && num1 <= 39 ) {
            System.out.println("Grade: 2");
        } else if ( num1 >= 40 && num1 <=  44 ) {
            System.out.println("Grade: 3");
        } else if ( num1 >= 45 && num1 <= 49 ) {
            System.out.println("Grade: 4"); 
        } else {
            System.out.println("Grade: 5");
        }

    }
}
