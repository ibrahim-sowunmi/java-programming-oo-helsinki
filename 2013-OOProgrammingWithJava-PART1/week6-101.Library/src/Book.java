/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */

public class Book {
    private String title;
    private String publisher;
    private int year;
    
    public Book(String BookTitle, String BookPublisher, int YearReleased) {
        this.title = BookTitle;
        this.publisher = BookPublisher;
        this.year = YearReleased;
    }
    
    public String title() {
        return this.title;
    }
    
    public String publisher() {
        return this.publisher;
    }
    
    public int year() {
        return this.year;
    }
    
    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}
