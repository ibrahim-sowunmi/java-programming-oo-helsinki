import java.util.*;

public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;
    private int seen = 0;
    

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    public boolean equals(Object obj) {
        if (obj == null ) {
            return false;
        }
        
        if (this.hashCode() == obj.hashCode()) {
            return true;
        }
        
        return false;
   }
    
    
    @Override
    public int hashCode() {
        return this.ringingYear + this.latinName.hashCode();
    }
    
    public void seen() {
        seen++;
    }
    
    public int getSeen() {
        return this.seen;
    }
 }


