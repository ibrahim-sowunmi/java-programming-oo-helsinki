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

public class SortAgainstSuit implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
       if (card1.getSuit() > card2.getSuit()) {
           return 1;
       } else {
           return -1;
       }
    }
    
}
