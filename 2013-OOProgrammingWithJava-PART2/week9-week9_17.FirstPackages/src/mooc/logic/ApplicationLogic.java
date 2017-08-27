/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;
/**
 *
 * @author ibz
 */
public class ApplicationLogic  {
    private TextUserInterface ui; 
    
    public ApplicationLogic(UserInterface ui) {
        this.ui = (TextUserInterface) ui;
    }
    
    public void execute(int howManyTimes) {
        
        for (int i = 0 ; i < howManyTimes ; i++) {
            System.out.println("The application logic works");
            ui.update();
            
        }
    } 
}
