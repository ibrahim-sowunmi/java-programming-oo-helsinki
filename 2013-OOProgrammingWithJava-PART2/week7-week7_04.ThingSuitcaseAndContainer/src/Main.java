
public class Main {

   public static void main(String[] args) {
Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
   
   public static void addSuitcasesFullOfBricks(Container container) {
       Thing thing = new Thing("Brick",1);
       for (int i = 2; i < 100 ; i++) {
           Suitcase suitcase = new Suitcase(1000);
           suitcase.addThing(thing);
           container.addSuitcase(suitcase);
           thing = new Thing("Brick", i);
       } 
   }
    

}
