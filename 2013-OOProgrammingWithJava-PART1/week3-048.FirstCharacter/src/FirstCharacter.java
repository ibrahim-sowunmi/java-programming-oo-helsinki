import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        char char1 = firstCharacter(name);
        System.out.println(char1);
        
        
    }
    
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
