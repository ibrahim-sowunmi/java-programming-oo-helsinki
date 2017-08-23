
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
   int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    // change the copied

    // print both

    }
    
    public static int[] reverseCopy(int[] array) {
        int[] copiedArray = copy(array);
        int i = array.length -1;
        
        for (int item : array) {
            copiedArray[i] = item;
            i--;
        }
        
        return copiedArray;
    }
    
    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length];
        
        for (int i = 0 ; i < array.length; i++) {
            copiedArray[i] = array[i];
            
        }
        
        return copiedArray;
    }
    
}
