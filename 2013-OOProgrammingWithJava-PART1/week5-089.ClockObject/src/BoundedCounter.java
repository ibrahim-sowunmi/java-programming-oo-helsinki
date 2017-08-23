
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }
    
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if (value <= 0 || value > upperLimit){ 
            this.value = 0;
        } else {
            this.value = value;
        }
    }
}
