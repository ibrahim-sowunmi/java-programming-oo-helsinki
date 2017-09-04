/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author ibz
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory containerHistory = new ContainerHistory();
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        containerHistory.add(initialVolume);
        
    }
    
    public String history() {
       return this.containerHistory.toString();
    }
    
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        containerHistory.add(super.getVolume());
    }
    
    public double takeFromTheContainer(double amount) {
        double recieved = super.takeFromTheContainer(amount);
        containerHistory.add(super.getVolume());
        return recieved;
        
    }
    
    public void printAnalysis() {
        String results = "";
        results = "Product: " + super.getName() + "\n" + 
                "History: " + this.history() + "\n" + 
                "Greatest product amount: " + this.containerHistory.maxValue() + "\n" +
                "Smallest product amount: " + this.containerHistory.minValue() + "\n" + 
                "Average: " + this.containerHistory.average() + "\n" +
                "Greatest change: " + this.containerHistory.greatestFluctuation() + "\n" +
                "Variance: " + this.containerHistory.variance();
        System.out.println(results);
    }
    
    
        
    
    
}
