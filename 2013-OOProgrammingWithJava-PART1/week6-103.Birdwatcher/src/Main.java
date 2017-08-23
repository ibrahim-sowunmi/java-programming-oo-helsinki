import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    Database database = new Database();
    Scanner reader = new Scanner(System.in);
    
    String input = "";
    while (!input.equals("Quit")) {
        System.out.print("? ");
        input = reader.nextLine();
        if (input.equals("Add")) {
            System.out.print("Name: ");
            input = reader.nextLine();
            String name = input; 
            System.out.print("Latin Name: ");
            input = reader.nextLine();
            String latName = input;
            Aviant birdy = new Aviant(name, latName);
            database.Add(birdy);        
        }

        if (input.equals("Observation")) {
            System.out.print("What was observed: ");
            input = reader.nextLine();
            database.Observation(input);
        }
        
        if (input.equals("Statistics")) {
            database.Statistics();
        }
        
        if (input.equals("Show")) {
            System.out.print("What? ");
            String thisBird = reader.nextLine();
            database.Show(thisBird);
            
        }
    }
    
    
           
  }

}
