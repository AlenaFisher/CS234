/**
 * @author  Alena Fisher
 * 4/13/2024
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class Equipment {
    // Creating instance variables
    private String equipmentType;
    private int quantity;

    public Equipment(String equipmentType, int quantity) {
        /**
         * This constructor receives 'equipmentType' and 'quantity' as explicit parameters and assigns them to the instance variables
         */
        this.equipmentType = equipmentType;
        this.quantity = quantity;
    }

    public String getEquipmentType() {
        /**
         * This method returns the equipment type
         */
        return equipmentType;
    }

    public int getQuantity() {
        /**
         * This method returns the quantity
         */
        return quantity;
    }

    public void setEquipmentType(String equipmentType) {
        /**
         * This method receives 'equipmentType' as an explicit parameter and assigns it to the instance variable
         */
        this.equipmentType = equipmentType;
    }

    public void setQuantity(int quantity) {
        /**
         * This method receives 'quantity' as an explicit parameter and assigns it to the instance variable
         */
        this.quantity = quantity;
    }
}