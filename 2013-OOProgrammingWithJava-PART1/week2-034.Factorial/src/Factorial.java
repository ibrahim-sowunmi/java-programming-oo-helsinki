import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        Integer val = Integer.parseInt(reader.nextLine());
        Integer mult = val;
        Integer sum = 0;
        
        if (val == 0 || val == 1) {
            sum = 1;
        } 
        
        while (mult > 0) {
            mult--;
            val *= mult;
            if (mult==0) {
                break;
            }
            sum = val; 
        }  
        System.out.println("Factorial is " + sum);

    }
}
