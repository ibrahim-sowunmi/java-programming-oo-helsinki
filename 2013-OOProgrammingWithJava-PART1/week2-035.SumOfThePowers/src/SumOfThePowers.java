
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Integer val = Integer.parseInt(reader.nextLine());
        Integer num = 0;
        Integer pow1 =  0;
        Integer sum = 0;
        
        while (num <= val) {
            pow1 =  (int)Math.pow(2,num);
            num++;
            sum += pow1;
        }
        System.out.println("The result is " + sum);        

    }
}
