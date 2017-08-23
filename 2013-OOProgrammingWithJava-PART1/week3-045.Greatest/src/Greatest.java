
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        Integer great1 ;
        Integer great2 ;
        if (number1 > number2) {
            great1 = number1;
        } else {
            great1 = number2;
        }
        if (number2 > number3) {
            great2 = number2;
        } else {
            great2 = number3;
        }
        if (great1 > great2) {
            return great1;
        } else {
            return great2;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}