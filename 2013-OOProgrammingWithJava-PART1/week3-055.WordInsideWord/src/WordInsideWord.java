
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String word = reader.nextLine();
        String inner = reader.nextLine();
        
        Integer index = word.indexOf(inner);
        
        if (index == -1) {
            System.out.println("The word '" + inner + "' is not found in the word '" + word + "' ");
        } else {
            System.out.println("The word '" + inner + "' is found in the word '" + word + "'. ");
        }
    }
}
