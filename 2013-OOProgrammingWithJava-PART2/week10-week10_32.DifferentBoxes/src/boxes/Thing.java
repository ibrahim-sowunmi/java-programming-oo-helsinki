package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
            this.weight = weight;
        }
        
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.hashCode() == this.hashCode()) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = 4;
        hash = hash + this.name.hashCode();
        return hash;
    }
    
    

}
