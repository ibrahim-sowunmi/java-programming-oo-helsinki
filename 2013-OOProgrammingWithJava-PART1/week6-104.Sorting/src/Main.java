import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
  
        
    }
    
    public static int smallest(int[] array) {
        int num = array[0];
        for (int number : array) {
            if (number < num) {
                num = number;
            }
        }
        return num;
    } 
    
    public static int indexOfTheSmallest(int[] array) {
    // code goes here
        int num = array[0];
        int i = 0;
        int j = 0;
        for (int number : array) {
            i++;
            if (number < num) {
                num = number;
                j = i;
            }
        }
        return  j-1;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
    int store = array[index];
    int iStore = index;
    for (int i = index; i < array.length ; i++) {
        if (array[i] < store) {
            iStore = i;
            store = array[i];
        }
    }
    return iStore;
   }
    
    public static void swap(int[] array, int index1, int index2) {
    // code goes here
        int temp1 = array[index1];
        int temp2 = array[index2];
        array[index1] = temp2;
        array[index2] = temp1; 
        System.out.println(array);
        
    }
    
    public static void sort(int[] array) {
        int store1, store2 = 0;
        for (int i = 0; i < array.length ; i++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            System.out.println("Smallest index is " + smallestIndex);
            swap(array,i, smallestIndex );
            System.out.println(Arrays.toString(array));
        }
           
           
        
    }
  
  
}
