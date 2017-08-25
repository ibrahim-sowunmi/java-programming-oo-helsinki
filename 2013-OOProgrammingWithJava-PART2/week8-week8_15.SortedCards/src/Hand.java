/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
import java.util.*;

public class Hand implements Comparable<Hand>{
    private List<Card> myhand = new ArrayList<Card>();
    
    public void add(Card card) {
        myhand.add(card);
    }
    
    public void print() {
        for (Card card : myhand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(myhand);
        
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuit sortBySuit = new SortAgainstSuit();
        Collections.sort(myhand, sortBySuit);
    }

    @Override
    public int compareTo(Hand myhand) {
        if (this.handValue() > myhand.handValue()) {
            return 1;
        } else if (this.handValue() == myhand.handValue()) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public int handValue() {
        int val = 0;
        for (Card card : myhand) {
            val += card.cardValue();
        }
        return val;
    }
    
    
}
