import java.util.*;

//Item class represents an item in the inventory
class Item {
    //ID of the item
    private final int id;
    //Name of the item
    private final String name;
    //Price of the item
    private final float price;

    //Constructor to initialize the item with an ID, name, and price
    public Item(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Gets and returns the item ID
    public int getId() {
        return id;
    }

    //Gets and returns the item name
    public String getName() {
        return name;
    }

    //Gets and returns the item price
    public float getPrice() {
        return price;
    }

    // Overriding the toString method to return a string representation of the item
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}