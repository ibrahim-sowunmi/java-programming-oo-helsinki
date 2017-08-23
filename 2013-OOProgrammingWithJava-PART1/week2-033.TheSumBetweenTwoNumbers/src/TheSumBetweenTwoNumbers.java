
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        Integer lb = Integer.parseInt(reader.nextLine());
        Integer ub = Integer.parseInt(reader.nextLine());
        Integer sum = lb;
        Integer num = lb;
        
        while (ub > lb) {
            
            sum += 1;
            ub--;
            System.out.println("This is sum: " + sum);
            num += sum;
            
        }

        System.out.println("This is num: " + num);
        
        
        
    }
}
