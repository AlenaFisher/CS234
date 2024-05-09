/**
 * @author  Alena Fisher
 * 4/13/2024
 */
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Club {
    // Creating the linked list
    private LinkedList<Equipment> equipment;

    public Club() {
        /**
         * This constructor initializes a list to store the equipment
         */
        equipment = new LinkedList<>();
    }

    public void addEquipment(Equipment anEquipment) {
        /**
         * This method receives 'anEquipment' as an explicit parameter and adds it to the list of equipment
         */
        equipment.add(anEquipment);
    }

    public void getInformation() {
        /**
         * This method uses an iterator to iterate through the list of equipment and prints out the information
         */
        // Iterator for the equipment list
        ListIterator <Equipment> iter = equipment.listIterator();
        // While loop to iterate through the equipment list
        while(iter.hasNext()) {
            Equipment name = iter.next();
            // Printing out the information stored in the list
            System.out.println(name.getEquipmentType());
        }
    }

    public boolean equipmentExists(String equipmentType) {
        /**
         * This method uses an iterator to iterate through the list of equipment and searches for a specific equipment
         * If the equipment is found, the method returns true
         * If the equipment is not found, the method returns false
         */
        
        // Iterator to iterate through the equipment list
        ListIterator <Equipment> iter = equipment.listIterator();
        boolean found = false;

        // Iterating through the equipment list to find if a certain equipment exists
        for(int i = 0; i < equipment.size(); i++) {
            Equipment j = iter.next();

            // If the equipment is found in the list, the method returns true
            if(j.getEquipmentType().equals(equipmentType)) {
                found = true;
            }

            // If the equipment is not found in the list, the method returns false
            else {
                found = false;
            }

        }

        return found;
    }


    public void removeEquipment(String equipmentType, int quantity) {
        /**
         * This method uses an iterator to iterate through the list of equipment to be removed
         * If the equipment is found, both the equipment type and the quantity are removed from the list
         * If the equipment is not found, a message is printed to the user
         */
        
        // Iterator to iterate through the equipment list
        ListIterator <Equipment> iter = equipment.listIterator();
        
        boolean found = false;

        // Iterating through the list to locate a specific equipment
        for(int i = 0; i < equipment.size(); i++) {
            Equipment j = iter.next();

            // If the equipment is found, both the equipment and its quantity are removed from the list
            if(j.getEquipmentType().equals(equipmentType)) {
                found = true;
                iter.remove();
            }

        }

        // If the equipment is not found, a message is printed to the user
        if(!found) {
            System.out.println("Equipment does not exist");
        }
    }

    public void displayInformation(String equipmentType) {
        /**
         * This method uses an iterator to iterate through the list of equipment
         * It prints out the information for a specific equipment in the list
         * If the equipment is not found, it prints a message to the user
         */
        
        // Iterator to iterate through the equipement list
        ListIterator <Equipment> iter = equipment.listIterator();
        boolean found = false;

        // Iterating through the equipment list to display a specific equipment's information
        for(int i = 0; i < equipment.size(); i++) {
            Equipment j = iter.next();

            // If the equipment is found, both the equipment type and its quantity are printed out
            if(j.getEquipmentType().equals(equipmentType)) {
                found = true;
                System.out.println("Equipment: " + j.getEquipmentType());
                System.out.println("Quantity: " + j.getQuantity());
            }

        }

        // If the equipment is not found in the list, a message is printed to the user
        if(!found) {
            System.out.println("Equipment does not exist");
        }
    }


    public void updateInformation(String equipmentType, int quantity) {
        /**
         * This method uses an iterator to iterate through the list of equipment to search for a specific equipment to update
         * If the equipment is found, the new information for the equipment is stored
         * If the equipment is not found, it prints a message to the user
         */
        
        // Iterator to iterate through the equipment list
        ListIterator <Equipment> iter = equipment.listIterator();
        boolean found = false;

        // Iterating through the list to find the specified equipment
        for(int i = 0; i < equipment.size(); i++) {
            Equipment j = iter.next();

            // If the equipment is found, the new information is stored for the equipment
            if(j.getEquipmentType().equals(equipmentType)) {
                found = true;
                
                j.setEquipmentType(equipmentType);
                j.setQuantity(quantity);
                
            }

        }

        // If the equipment is not found in the list, a message is printed to the user
        if(!found) {
            System.out.println("Equipment does not exist");
        }
    }
}
