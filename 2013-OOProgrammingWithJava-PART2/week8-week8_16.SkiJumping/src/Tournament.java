/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author ibz
 */
public class Tournament {
    private Scanner reader;
    private Contestants group;
    
    
    public Tournament(Scanner reader) {
    this.reader = reader;
    this.group = new Contestants();
    
    }
    
    public void Start() {
        
      
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping ");   
        String input;
        while (true) {
         
        System.out.print("  Participant name: ");    
        input = reader.nextLine();
        
        if (input.equals("")) {
            break;
        } else {
                this.group.addContestant(new Contestant(input)); 
            }
        }
        
        System.out.println("\nThe tournament begins! \n");
        int round = 1;
        
        while (true) {
            
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            input = reader.nextLine();
            
            
            if (input.equals("jump")) {
                
                System.out.println("\n" + "Round " + round + "\n");
                
                
                System.out.println("Jumping order:");
                
                ArrayList<Contestant> niceList = group.sortedList();
                int i = 0;
                for (Contestant person : niceList) {
                    i++;
                    System.out.println( " " + i + ". " + person.getName() +  " (" + person.getScore() + " points)" );
                }
                System.out.println("");
                System.out.println("Results of round " + round);
                for (Contestant person : niceList) {

                    System.out.println("  " + person.getName());
                    int num = group.generateContestantScore(person);
                    person.recordJumps(num);
                    System.out.println("    length: " + num);
  
                    ArrayList<Integer> numJudge = group.generateJudgeScores();
                        for (int j = 1 ; j < 4; j++) {
                            num += numJudge.get(i);
                        }  
                    int score = num + person.getScore();
                    person.raiseScore(round);round++;                                       
                }      
                System.out.println("");
            } else {
                break; 
            }
            
        }
        
        System.out.println( "\n" + "Thanks!\n" +
        "\n" +
        "Tournament results:\n" +
        "Position    Name");
        int i = 0;
        for (Contestant person : group.sortedList()) {
            i++;
            System.out.println(i + "           " + person.getName() + " (" + person.getScore() + " points)" );
            System.out.print("            jump lengths: ");person.jumpRecord();
        }
    
    }
    
}
