import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number:");
        Integer num1 = Integer.parseInt(reader.nextLine());
        Integer num2 = Integer.parseInt(reader.nextLine());
        if (num1 > num2 ) {
            System.out.println("Greater number: " + num1);
        } else if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number: " + num2);
        }
    
   
    }
}
