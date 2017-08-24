/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingyear;
    private final double weight = 0.1;
    
    public CD(String artist, String title, int publishingyear) {
        this.artist = artist;
        this.title = title;
        this.publishingyear = publishingyear;
    }
    
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingyear + ")";
    }
    
    public double weight() {
        return this.weight;
    }
    
}
