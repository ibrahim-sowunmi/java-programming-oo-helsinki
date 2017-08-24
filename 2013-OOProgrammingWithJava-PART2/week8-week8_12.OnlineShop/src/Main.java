import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write some test code here
Storehouse v = new Storehouse(); 
v.addProduct("coffee",2, 25);
v.addProduct("milk",3, 10);
        System.out.println(v.stock("milk"));
           System.out.println(v.stock("lol")); 
            
    }
}
