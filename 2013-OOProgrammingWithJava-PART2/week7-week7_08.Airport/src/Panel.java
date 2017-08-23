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

public class Panel {
    private Scanner reader;
    private HashMap<String, Planes> planesstored;
    private ArrayList<String> flights;
    
    public Panel(Scanner reader) {
        this.reader = reader;
        this.planesstored = new HashMap<String, Planes>();
        this.flights = new ArrayList<String>();
    }
    
    public void start() {
                    
        System.out.println("Airport panel\n" +
        "--------------------");
        
        while (true) {
            System.out.println("Choose operation:\n" +
            "[1] Add airplane\n" +
            "[2] Add flight\n" +
            "[x] Exit");
            
            System.out.print(">");

            String input = takeUserInput();
            if (input.equals("1")) {
                AddPlaneObject();
            } else if (input.equals("2")) {
                AddFlightObject();
            } else if (input.equals("x")) {
                break;
            }
            
        }
        
        while (true) {
            System.out.println("Flight service\n" +
            "------------");

            System.out.println("Choose operation:\n" +
            "[1] Print planes\n" +
            "[2] Print flights\n" +
            "[3] Print plane info\n" +
            "[x] Quit");
            
            System.out.print(">");
            String input = takeUserInput();
            
            if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printPlaneInfo();
            } else if (input.equals("x")) {
                break;
            }
                    
        }
    }
    
    public String takeUserInput() {
        return reader.nextLine();
        
    }
    
    public Planes AddPlaneObject() {
        System.out.print("Give plane ID: ");
        String planeId = takeUserInput();
       
        System.out.print("Give plane capacity: ");
        String planeCapacity = takeUserInput();
        
        Planes plane = new Planes(planeId, planeCapacity);
        planesstored.put(planeId, plane);
        
        return plane;
    }
    
    public void AddFlightObject() {
        System.out.print("Give plane ID: ");
        String planeId = takeUserInput();
        
        if(this.planesstored.containsKey(planeId)) {
            System.out.print("Give departure airport code: ");
            String depcode = takeUserInput();
            System.out.print("Give destination airport code: ");
            String arrcode = takeUserInput();
            Planes plane = planesstored.get(planeId);
            flights.add(plane.planeInfo() + " (" + depcode + "-" + arrcode + ")");
        } else {
        
            System.out.print("Give plane capacity: ");
            String planeCapacity = takeUserInput();
            System.out.print("Give departure airport code: ");
            String depcode = takeUserInput();
            System.out.print("Give destination airport code: ");
            String arrcode = takeUserInput();

            Planes plane = new Planes(planeId, planeCapacity);
            this.planesstored.put(planeId, plane);

            flights.add(plane.planeInfo() +  " (" + depcode + "-" + arrcode + ")"); 
        }
    }
    
    public void printPlanes() {
        for (String plane : planesstored.keySet()) {
            Planes planeId = planesstored.get(plane);
            
            System.out.println(planeId.planeInfo());
        }
    }
    
    public void printFlights() {
        for (String flight : this.flights) {
            System.out.println(flight);
        }
    }
    
    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String input = takeUserInput();
        System.out.println("");
        
        Planes plane = this.planesstored.get(input);
        System.out.println(plane.planeInfo());
    }
    
}
