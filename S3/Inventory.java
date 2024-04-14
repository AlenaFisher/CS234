import java.util.*;

//Manages the items in the store
class Inventory {
    //Static variable to track the next item ID
    private static int nextItemID = 1;
    //Map to store items with their IDs
    private Map<Integer, Item> items;

    //Constructor to initialize the inventory and add default items
    public Inventory() {
        //Initalizing the items map
        this.items = new HashMap<>();
        //Adding default items to the inventory
        initializeInventory();
    }

    //Method to initialize the inventory with default items
    private void initializeInventory() {
        addItem("Hockey Pucks", 2.50f);
        addItem("Hockey Sticks", 25.0f);
        addItem("Hockey Skates", 80.0f);
        addItem("Figure Skates", 70.0f);
        addItem("Benches", 50.0f);
        addItem("Kettle Bell", 30.0f);
        addItem("Bike", 40.0f);
        addItem("Treadmills", 25.0f);
        addItem("Ellipticals", 85.0f);
        addItem("Lat Machines", 120.0f);
        addItem("Dumb Bells", 35.0f);
        addItem("Weight Racks", 30.0f);
        addItem("Weight Plates", 25.0f);
        addItem("Medicine Balls", 60.0f);
        addItem("Baseball", 15.0f);
        addItem("Softball", 15.0f);
        addItem("Baseball Gloves", 25.0f);
        addItem("Softball Gloves", 25.0f);
        addItem("Softball Bats", 20.0f);
        addItem("Baseball Bats", 20.0f);
        addItem("Basketball", 15.0f);
        addItem("Volleyball", 15.0f);
        addItem("Knee Pads", 10.0f);
        addItem("Basketball Nets", 5.0f);
        addItem("Volleyball Nets", 15.0f);
        // Add more items here...
    }

    //Method to add a new item to the inventory using name and price
    private void addItem(String name, float price) {
        //Creating a new item
        Item item = new Item(nextItemID++, name, price);
        //Adding the item to the inventory map
        items.put(item.getId(), item);
    }

    //Method to add an existing item to the inventory
    public void addItem(Item item) {
        //Adding the item to the inventory map
        items.put(item.getId(), item);
    }

    //Method to remove an item from the inventory by ID
    public boolean removeItem(int id) {
        //Removing the item and returning true if successful
        return items.remove(id) != null;
    }

    //Method to display all items in the inventory
    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        System.out.println("ID\tName\t\tPrice");
        //Iterating over all items in the inventory
        for (Item item : items.values()) {
            System.out.println(item.getId() + "\t" + item.getName() + "\t\t$" + item.getPrice());
        }
    }

    //Method to find an item in the inventory by ID
    public Item findItem(int id) {
        //Returing the item with the specified ID
        return items.get(id);
    }
}

    