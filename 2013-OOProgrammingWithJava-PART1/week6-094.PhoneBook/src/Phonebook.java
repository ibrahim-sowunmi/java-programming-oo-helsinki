/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook;
    
    public Phonebook() {
        this.phonebook =  new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        this.phonebook.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person people : phonebook) {
            System.out.println(people);
        }
    }
    
    public String searchNumber(String name) {
        for (Person people : phonebook) {
            if (people.getName().contains(name)) {
                return people.getNumber();
            } 
                
        }    
        return "number not known";  
    }
}
