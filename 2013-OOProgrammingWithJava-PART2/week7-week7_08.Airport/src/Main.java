import java.util.*;

public class Main {
    public static void main(String[] args) {
        String test = "1\n" + "HA-LOL\n" + "42\n" + "1\n" + "G-OWAC\n"
                + "101\n" + "2\n" + "HA-LOL\n" + "HEL\n" + "BAL\n" + "2\n"
                + "G-OWAC\n" + "JFK\n" + "BAL\n" + "x\n" + "1\n" + "2\n"  + "3\n"+ "G-OWAC\n" + "x\n";
        Scanner reader = new Scanner(test);
        Panel panel = new Panel(reader);
        panel.start();

    }
}
