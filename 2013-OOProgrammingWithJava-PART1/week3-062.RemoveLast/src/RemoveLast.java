import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    public static void removeLast(ArrayList<String> list) {
        Integer num = 0;
        for (String item : list) {
            num++;
        }
        list.remove(num-1);
        
    }

    public static void main(String[] args) {
        // Here an example what you can do with the method 
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        System.out.println(persons);

        // sort the persons
        Collections.sort(persons);

        // and remove the last
        removeLast(persons);

        System.out.println(persons);
    }
}