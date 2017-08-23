/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Calculator {
    private Reader reader;
    private int val1, val2;
    private int calculations;
    
    public Calculator() {
        reader = new Reader();
        calculations = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            } else {
            
            }
        }

        statistics();
    }
    
    public void inputs() {
        System.out.print("Value1: ");
        this.val1 = reader.readInteger(); 
        System.out.print("value2: ");
        this.val2 = reader.readInteger(); 
        calculations++;
    }
    
    private void sum() {
        inputs();
        System.out.println("sum of the values " + (val1+val2));
    }
    
    private void difference() {
        inputs();
        System.out.println("difference of the values " + (val1-val2));
    }
    
    private void product() {
        inputs();
        System.out.println("product of the values  " + (val1*val2));
    }
    
    private void statistics() {
        System.out.println("calculations done " + calculations);
    }
    
}
