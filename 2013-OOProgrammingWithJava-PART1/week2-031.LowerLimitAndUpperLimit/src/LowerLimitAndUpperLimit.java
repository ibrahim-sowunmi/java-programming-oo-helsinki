
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        Integer num1 = Integer.parseInt(reader.nextLine());
        Integer num2 = Integer.parseInt(reader.nextLine());
        
        
        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
            if (num2 >= num1) {
                System.out.println("");
            }
            
            
        }
    }
}
