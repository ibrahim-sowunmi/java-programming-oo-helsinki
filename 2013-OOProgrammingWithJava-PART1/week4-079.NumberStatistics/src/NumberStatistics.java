
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return (this.sum*1.0 / this.amountOfNumbers*1.0);
        }
    }
    
    public int sum() {
        return this.sum;
    }
    
}
