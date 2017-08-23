import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        Integer input = 0;
        Integer sum = 0;
        Integer loops = 0;
        Double davg = 1.0;
        Integer numodd = 0;
        Integer numeven = 0;
        
        while (input != -1) {
            input = Integer.parseInt(reader.nextLine());
            loops++;
            sum += input;
            if (input == -1) {
                sum++;
                loops--;
                numodd--;
                
            }
            
            if (input%2==0) {
            numeven++;
            System.out.println(numeven);
            } else {
            numodd++; 
            System.out.println(numodd);
            
            }
            
        }
        
        
        
        davg = (double)sum/(double)loops;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + (sum));
        System.out.println("How many numbers:" + loops);
        System.out.println("Average: " + davg);
        System.out.println("Even numbers: " + numeven);
        System.out.println("Odd numbers: " + numodd);
        

    }
}
