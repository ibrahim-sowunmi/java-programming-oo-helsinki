import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String name = reader.nextLine();
        Integer firstp = Integer.parseInt(reader.nextLine());
        Integer num = name.length() - firstp;
        
        System.out.println("Result: " + name.substring(num));
        
    }
}
