/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author ibz
 */
public class PersonalInfo {
    private Map<String, List<String>> nameAndNumber;
    private Map<String, String> nameAndAddress;
    private Scanner reader;
    
    public PersonalInfo(Scanner reader) {
        this.nameAndNumber = new HashMap<String, List<String>>();
        this.nameAndAddress = new HashMap<String, String>();
        this.reader = reader;
        
    }
    
    public void addNumber(String name, String phoneNumber) {
        if (!this.nameAndNumber.containsKey(name)) {
            this.nameAndNumber.put(name, new ArrayList<String>());
        }
        this.nameAndNumber.get(name).add(phoneNumber);
        
    } 
    
    public void addAddress(String name, String address, String city) {
        if (!this.nameAndAddress.containsKey(name)) {
            return;
        }
        String format = address + "\n" + city;
        this.nameAndAddress.put(name, format);
    }
    
    private boolean checkAddress(String name) {System.out.println(name + " the name");
        return this.nameAndAddress.containsKey(name);
        
    }
    
    public void removeInfo(String name) {
        
        try {
            this.nameAndAddress.remove(name);
            this.nameAndNumber.remove(name);
        } catch (Exception e) {
            System.out.println("Returned error!");
        }
    
    } 
    
    public void start() {
        
    
        System.out.println("phone search\n" +
        "available operations:\n" +
        " 1 add a number\n" +
        " 2 search for a number\n" +
        " 3 search for a person by phone number\n" +
        " 4 add an address\n" +
        " 5 search for personal information\n" +
        " 6 delete personal information\n" +
        " 7 filtered listing\n" +
        " x quit");
        
        while (true) {
            System.out.println("");
            
            System.out.print("command: ");
            String input = reader.nextLine();
            String input2 = "";
            
            if (input.equals("1")) {
                System.out.print("whose number: ");
                input = reader.nextLine();
                System.out.print("number: ");
                input2 = reader.nextLine();
                this.addNumber(input, input2);
            
            }
            if (input.equals("2")) {
                System.out.print("whose number: ");
                input = reader.nextLine();
                
                if (this.nameAndNumber.containsKey(input)) {
                    for (String number : this.nameAndNumber.get(input)) {
                        System.out.println(number);
                    }
                } else {
                    System.out.println("  not found");
                }
                
             
                
            }
            if (input.equals("3")) {
                System.out.print("number: ");
                input = reader.nextLine();
          
                if (this.nameAndNumber.values().contains(input)) {
                    System.out.println("in here!");
                    for (String person : this.nameAndNumber.keySet()) {
                        System.out.println(person);
                        List<String> temp = this.nameAndNumber.get(person);
                        if (temp.contains(input)) {
                            System.out.println(person);
                        }
                    }
                } else {
                    System.out.println("not found");
                }
                
            
 
            }
            if (input.equals("4")) {
                System.out.print("whose address: ");
                input = reader.nextLine();
                System.out.print("street: ");
                input2 = reader.nextLine();
                System.out.print("city ");
                String input3 = reader.nextLine();
                this.addAddress(input, input2, input3);
            }
            if (input.equals("5")) {
                input = reader.nextLine();
                //if num/address not found says number and or address not found;
                //use try catch
                if (this.nameAndAddress.containsKey(input) && this.nameAndNumber.containsKey(input)) {
                    
                }
            
            }
            if (input.equals("6")) {
                System.out.print("whose information: ");
                input = reader.nextLine();
                try {
                    this.nameAndAddress.remove(input);
                    this.nameAndNumber.remove(input);
                } catch (NullPointerException e) {
                    System.out.println("  not found");
                }
            }
            if (input.equals("7")) {
            //what?
            }
            if (input.equals("x")) {
                break;
            }
            
            
        }
        
    }
    
}
