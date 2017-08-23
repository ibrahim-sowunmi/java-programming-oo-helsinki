import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer input = 0;
        
        NumberStatistics stat = new NumberStatistics();
        NumberStatistics statEven = new NumberStatistics();
        NumberStatistics statOdd = new NumberStatistics();
        
        System.out.println("Type numbers:");
        
        while (!input.equals(-1)) {
             input = Integer.parseInt(reader.nextLine());
             if (!input.equals(-1)) {
                 stat.addNumber(input);
                 
                 if (input % 2 == 0) {
                    statEven.addNumber(input);
                } else {
                    statOdd.addNumber(input);
                }
                 
             } else {
                    break;
             }
             
             
        }
        System.out.println("sum: " + stat.sum());
             System.out.println("sum of even: " + statEven.sum());
             System.out.println("sum of odd: " + statOdd.sum());

    }        
        
}

    
