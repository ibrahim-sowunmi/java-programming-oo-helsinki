/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class Book implements ToBeStored {
    private String writer;
    private String book;
    private double weight;
    
    public Book(String writer, String book, double weight) {
        this.writer = writer;
        this.book = book;
        this.weight = weight;
    }
    
    public String toString() {
        return this.writer + ": " + this.book;
    }
    
    public double weight() {
        return this.weight;
    }
}
