
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Integer num1 = Integer.parseInt(reader.nextLine());
        System.out.println("How old are you?");
        
        if (num1 >= 0 && num1 <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
        
    }
}
