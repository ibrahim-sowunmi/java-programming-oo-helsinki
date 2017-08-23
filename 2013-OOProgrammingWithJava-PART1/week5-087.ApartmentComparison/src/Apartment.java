
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if ((this.rooms * this.squareMeters) > (otherApartment.squareMeters * otherApartment.rooms)) {
            return true;
        }
            return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int num = (this.squareMeters * this.pricePerSquareMeter) - (otherApartment.pricePerSquareMeter * otherApartment.squareMeters);
        return Math.abs(num);
    } 
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if ((this.squareMeters * this.pricePerSquareMeter) > (otherApartment.pricePerSquareMeter * otherApartment.squareMeters)) {
            return true;
        }
            return false;
    }
   
}
