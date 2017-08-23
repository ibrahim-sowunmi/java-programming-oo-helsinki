/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.ArrayList;
 
public class Database {
    private ArrayList<Aviant> Birds;
    
    public Database() {
        Birds = new ArrayList<Aviant>();
    }
    
    public void Add(Aviant birdToAdd) {
        this.Birds.add(birdToAdd);
    }
    
    public void Statistics() {
        for (Aviant bird : Birds) {
            System.out.println(bird);
        }
    }
    
    public void Observation(String find) {
        int i = 0;
        for (Aviant bird: Birds) {
            if (bird.getName().equals(find)) {
                i++;
                bird.Observe();
                break;
            } 
            
        }
        if (i == 0) {
             System.out.println("Is not a bird");   
            }
    }
    
    public void Show(String thisBird) {
        
        for (Aviant bird : Birds) {
            if (bird.getName().equals(thisBird)) {
                System.out.println(bird);
            }
        }
    }
    
    
}
