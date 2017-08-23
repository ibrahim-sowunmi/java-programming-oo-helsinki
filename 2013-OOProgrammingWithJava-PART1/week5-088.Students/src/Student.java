/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Student {
    
    private String studentName;
    private String idNumber;
    
    public Student(String studentName, String idNumber) {
        this.studentName = studentName;
        this.idNumber = idNumber;
    
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return this.studentName;
    }
    
    public String getStudentNumber() {
        return this.idNumber;
    }
    
    public String toString() {
        return this.studentName + " " + "(" + this.idNumber + ")";
    }

}

