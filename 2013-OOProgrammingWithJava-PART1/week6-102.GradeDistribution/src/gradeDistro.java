/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class gradeDistro {
    private int value;
    private int upperLimit;
    private int lowerLimit;
    
    public gradeDistro(int value,int lower, int upper) {
        this.lowerLimit = lower;
        this.upperLimit = upper;
        this.value = value;
    }
    
    public boolean rating() {
        return (this.value >= this.lowerLimit && this.value <= this.upperLimit);
    }
    
    
}
