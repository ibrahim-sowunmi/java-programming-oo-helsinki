import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> grades = new ArrayList<Integer>();
        
        System.out.println("Type exam scores, -1 completes:");
 
        int num = score.nextInt();
        while (num != -1) {
            
            grades.add(num);
            num = score.nextInt();
            
        }
        
        System.out.println("Grade Distribution: ");
            System.out.print("Grade 5: ");
            for (int number : grades) {
                gradeDistro grade5 = new gradeDistro(number,50,60);
                if (grade5.rating() == true) {
                    System.out.print("*");
                }          
            }
            System.out.println("");
            
            System.out.print("Grade 4: ");
            for (int number : grades) {
                gradeDistro grade4 = new gradeDistro(number,45,49);
                if (grade4.rating() == true) {
                    System.out.print("*");
                }          
            }
            System.out.println("");
            
            System.out.print("Grade 3: ");
            for (int number : grades) {
                gradeDistro grade3 = new gradeDistro(number,40,44);
                if (grade3.rating() == true) {
                    System.out.print("*");
                }          
            }
            System.out.println("");
            
            System.out.print("Grade 2: ");
            for (int number : grades) {
                gradeDistro grade2 = new gradeDistro(number,35,39);
                if (grade2.rating() == true) {
                    System.out.print("*");
                }          
            }
            System.out.println("");
            
            System.out.print("Grade 1: ");
            for (int number : grades) {
                gradeDistro grade1 = new gradeDistro(number,30,34);
                if (grade1.rating() == true) {
                    System.out.print("*");
                }          
            }
            System.out.println("");
            
            System.out.print("Grade 0: ");
            for (int number : grades) {
                gradeDistro grade1 = new gradeDistro(number,0,29);
                if (grade1.rating() == true) {
                    System.out.print("*");
                }          
            }
            
            System.out.println("");
            System.out.print("Acceptance percentage: ");
            int acc = 0;
            double sum = 0;
            for (int number : grades) {
                if (number >= 30) {
                    acc ++;

                    sum += number;
                }
            }
            double accepted = acc * 1.0/grades.size();
            System.out.print(100 * accepted);
            
            
            
        }
            
    
//    34
//41
//53
//36
//55
//27
//43
//40
//-1
        
   
}