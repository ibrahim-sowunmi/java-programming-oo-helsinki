
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type an integer:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number:");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers:");
        System.out.println(num1 + num2);
        
        // Implement your program here. Remember to ask the input from user
    }
}
