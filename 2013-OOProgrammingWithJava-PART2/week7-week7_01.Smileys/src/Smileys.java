
public class Smileys {

    public static void main(String[] args) {
//         Test your method at least with the following
         printWithSmileys("Mikael");
         printWithSmileys("Arto");
         printWithSmileys("Matti");
    }
    
    private static void printWithSmileys(String characterString) {
        lengthOfSmileys(characterString);
        System.out.println(":) " + innerSmiley(characterString) + " :)");
        lengthOfSmileys(characterString);
    }
    
    private static String innerSmiley(String characterString) {
        if (characterString.length() % 2 == 1) {
           characterString = characterString + " "; 
        }
        return characterString;
    }
    
    private static void lengthOfSmileys(String characterString) {
        int cycles = characterString.length();
        if (cycles < 6) {
            cycles++;
        }
        for (int i = 0; i < cycles ; i++) {
            System.out.print(":)");
        }
        System.out.println("");
       
    }
    
    

}
