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

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
            
    public VehicleRegister() {
       owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            owners.put(plate, owner);
            return false;
        }     
        owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate) {
        if (owners.get(plate) == null) {
            return null;
        }
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
        
    }
    
    public void printRegistrationPlates() {
    for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate.toString());
        }
    }
    
    public void printOwners() {
        ArrayList<String> toPrint = new ArrayList<String>();    
        for (RegistrationPlate plate : owners.keySet()) {
            if (!toPrint.contains(owners.get(plate))) {
                toPrint.add(owners.get(plate));
            }
        }
        for (String owner : toPrint) {
            System.out.println(owner);
        }
    }
    
}
