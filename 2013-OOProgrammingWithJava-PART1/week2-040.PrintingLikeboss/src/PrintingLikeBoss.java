public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        Integer i = 0;
        while (i < amount) {
            i++;
            System.out.print("*");
        }
        System.out.println("");
        
    }

    public static void printWhitespaces(int amount) {
        Integer j = 0;
        while (j < amount) {
            j++;
            System.out.print(" ");
        }
        
        // 40.1
    }

    public static void printTriangle(int size) {
        // 40.2
        Integer k = 1;
        Integer spaces = size - 1;
        while (spaces != -1 ) {
            printWhitespaces(spaces);
            printStars(k);
            k++;
            spaces--;
            
        }
    }

    public static void xmasTree(int height) {
        Integer sidespace = height - 1;
        Integer stars = 1;
        while (sidespace != -1) {
            printWhitespaces(sidespace);
            printStars(stars);
            stars+=2;
            sidespace--;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
        }
        // 40.3
    

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
