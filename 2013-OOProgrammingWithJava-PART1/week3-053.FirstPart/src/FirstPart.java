
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String name = reader.nextLine();
        Integer firstp = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + name.substring(0,firstp));
        
        
        
    }
}
