/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Person {
    private String name;
    private String telNo;
    
    public Person(String name, String telNo) {
        this.name = name;
        this.telNo = telNo;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getNumber() {
        return this.telNo;
    }
    
    public String toString() {
        return this.name + " number: " + this.telNo;
    }
    
    public void changeNumber(String number) {
        this.telNo = number;
    }
    
    
}
