
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            
            if (name.equals("")) {
                for (Student student : list) {
                    System.out.println(student);
                    
                }
                break;
            }
            System.out.print("studentnumber: ");
            String id = reader.nextLine();
            Student template = new Student(name, id);
            list.add(template);
            
            
            
        }
        
        System.out.print("Give search term:");
        String searchTerm = reader.nextLine();
        System.out.print("result:");
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
        
     
        
    }
}