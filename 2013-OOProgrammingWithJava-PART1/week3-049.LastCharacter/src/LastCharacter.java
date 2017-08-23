import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        lastCharacter(name);    
        System.out.println(lastCharacter(name));
    }
    
    public static char lastCharacter(String text) {
        
        return text.charAt(text.length()-1);
    }
}
