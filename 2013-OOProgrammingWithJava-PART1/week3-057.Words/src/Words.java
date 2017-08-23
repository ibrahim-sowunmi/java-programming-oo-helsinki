import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        String word = "1";
         
        if (word.isEmpty()) {
            return;
        } else {
            while (!word.equals("")) {
            word = reader.nextLine();
            words.add(word);
            
            }
        }
        
        System.out.println("You types the following words: ");
        for (String said : words) {
            System.out.println(said);
        }
        
        
    }
}
