import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        Integer num = 0;
        for (Integer number : list) {
        num += number;
        }
        return num;
    }
    // Copy here average from exercise 64 
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
    
    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        // write code here
        double numsum = -1;
        double many = 0;
        for (double item : list) {
            many += (item-(average))*(item-(average));
            numsum++;
        }
        return many/numsum;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
