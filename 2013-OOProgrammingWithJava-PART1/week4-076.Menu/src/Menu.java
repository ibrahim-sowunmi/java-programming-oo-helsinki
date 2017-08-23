
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal) {
        if (meals.contains(meal)) {
        
        } else {
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String food: this.meals) {
            System.out.println(food);
        }
    }
    
    public void clearMenu() {
        this.meals.clear();
    }

    // add the methods here
}
