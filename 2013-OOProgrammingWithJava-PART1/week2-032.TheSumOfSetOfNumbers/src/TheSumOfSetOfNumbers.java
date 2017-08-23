
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer i = 0;
        Integer j = Integer.parseInt(reader.nextLine());
        Integer sum = 0;
        
        while (i < j) {
            i ++;
            i = i++;
            sum += i;
            
        }
        System.out.println(sum);

    }
}
