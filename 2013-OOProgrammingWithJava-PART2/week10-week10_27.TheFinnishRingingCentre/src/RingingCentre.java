/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author ibz
 */
public class RingingCentre {
    private Map<Bird , List<String>> observationPlaces;
    
    public RingingCentre() {
        this.observationPlaces = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        //Records observation and place among bird information
        if (!this.observationPlaces.containsKey(bird)) {
            this.observationPlaces.put(bird, new ArrayList());
        }
        
        this.observationPlaces.get(bird).add(place);
        bird.seen();
    }
    
    public void observations(Bird bird) {

        if (this.observationPlaces.containsKey(bird)) {    
            List<String> temp = this.observationPlaces.get(bird);
            System.out.println(bird + " observations: " + temp.size()); 
            for (String location : temp) {
                System.out.println(location);
            }
        } else {
            System.out.println(bird + " observations: " + 0); 
        }
        
    }
    
    
    
    
    
}
