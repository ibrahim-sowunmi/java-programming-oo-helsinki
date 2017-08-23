
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Integer val = 0;
        String name = reader.nextLine();
        
        while ( val < name.length()) {
            System.out.println((val +1) + ". character: " + name.charAt(val));
            val++;
        }
    }
}
