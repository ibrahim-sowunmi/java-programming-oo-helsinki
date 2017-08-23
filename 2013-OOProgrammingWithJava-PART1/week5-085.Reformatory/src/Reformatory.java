public class Reformatory {
    private int called = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        this.called++;
        return person.getWeight();
        
    }

    public void feed(Person person) {
        int num = person.getWeight() + 1;
        person.setWeight(num);
        
    }
    
    public int totalWeightsMeasured() {
       return this.called;
    }
}
