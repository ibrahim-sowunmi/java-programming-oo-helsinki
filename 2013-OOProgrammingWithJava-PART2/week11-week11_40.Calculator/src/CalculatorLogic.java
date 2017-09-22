/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class CalculatorLogic {
    private String operation = "";
    private int value = 0;
    private int store = 0;   
    
    public void calculate () {
        if (operation.equals("+")) {
            store += value;
        }
        if (operation.equals("-")) {
            store -= value;
        }
        if (operation.equals("Z")) {
            store = 0;
        }
        this.value = 0;
    }
    
    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public String getStore() {
        return this.store + "";
    } 
}
