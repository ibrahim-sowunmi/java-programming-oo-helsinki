
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        Integer num = 0;
        for (Integer number : list) {
        num += number;
        }
        return num;
    }
    

    public static double average(ArrayList<Integer> list) {
        double k = 0;
        for (Integer val : list) {
        k ++;
        }
        double i = sum(list);
        System.out.println(i);
        System.out.println(k);
        double j = i/k;
        
        return j;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}