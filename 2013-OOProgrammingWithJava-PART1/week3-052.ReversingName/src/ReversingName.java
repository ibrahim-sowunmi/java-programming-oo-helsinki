import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String name = reader.nextLine();
        
        Integer rev = name.length();
        String revname = "";
                
        while (rev > 0) {
            revname += name.charAt(rev-1);
            rev--;
               
        }
        System.out.println(revname);
    }
}
