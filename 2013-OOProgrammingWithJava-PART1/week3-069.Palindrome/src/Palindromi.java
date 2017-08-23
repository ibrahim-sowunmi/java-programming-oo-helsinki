import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String revtext = "";
        Integer length = text.length();
        
        while (0 < length) {
        revtext += text.charAt(length-1);
        length--;
        }
        System.out.println(revtext);
       return revtext.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
