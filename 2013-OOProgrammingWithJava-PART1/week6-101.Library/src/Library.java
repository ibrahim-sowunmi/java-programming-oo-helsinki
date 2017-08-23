/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> Books;
    
    public Library() {
        Books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.Books.add(newBook);
    }
    
    public void printBooks() {
        for (Book item : Books) {
            System.out.println(item);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
     
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book item : Books ) {
            if(StringUtils.included(item.title(), title)) {
                found.add(item);
            }
        }
        
        return found;       
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book item : Books ) {
            if(StringUtils.included(item.publisher(), publisher)) {
                found.add(item);
            }
        }
        
        return found;   
    }
    
    public ArrayList<Book> searchByYear(int year) {

        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book item : Books ) {
            if (item.year() == year) {
                found.add(item);
            }
        }
        
        return found;   
    }
    
}
