import java.util.*;

//Manages inventory and sales of a sports store
public class SportsManagementSystem {
    //Creating an inventory object
    private static final Inventory inventory = new Inventory();
    //Creating a sales manager object
    private static final SalesManager salesManager = new SalesManager();
 
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int choice;
        //Displaying main menu options and processing user choice
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Inventory Management");
            System.out.println("2. Sales Management");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            //Reading user choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Calling inventory management method
                    inventoryManagement(scanner);
                    break;
                case 2:
                    //Calling sales management method
                    salesManagement(scanner);
                    break;
                case 3:
                    //Exiting the program
                    System.out.println("Exiting program...");
                    break;
                default:
                    //Handling invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
            //Repeating until user chooses to exit
        } while (choice != 3);
        //Closing the scanner
        scanner.close();
    }

    //Method to manage inventory operations
    private static void inventoryManagement(Scanner scanner) {
        int choice;
        //Displaying inventory management options and processing user choice
        do {
            System.out.println("\nInventory Management:");
            System.out.println("1. Add new item");
            System.out.println("2. Remove item");
            System.out.println("3. Display inventory");
            System.out.println("4. Exit to main menu");
            System.out.print("Enter your choice: ");
            //Reading user choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Calling method to add item
                    addItem();
                    break;
                case 2:
                    //Calling method to remove item
                    removeItem(scanner);
                    break;
                case 3:
                    //Calling method to display inventory
                    displayInventory();
                    break;
                case 4:
                    //Exiting to main menu
                    System.out.println("Exiting to main menu...");
                    break;
                default:
                    //Handling invaild input
                    System.out.println("Invalid choice. Please try again.");
            }
            //Repeating until user chooses to exit to main menu
        } while (choice != 4);
    }

    //Method to add a new item to the inventory
    private static void addItem() {
        System.out.print("Enter item name: ");
        //Reading item name
        String name = scanner.next();
        System.out.print("Enter item price: ");
        //Reeading item price
        float price = scanner.nextFloat();
        //Creating a new item object
        Item item = new Item(name, price);
        //Adding the item to the inventory
        inventory.addItem(item);
        //Confirming item addition
        System.out.println("Item added successfully.");
    }

    //Method to remove an item from the inventory
    private static void removeItem(Scanner scanner) {
        System.out.print("Enter item ID to remove: ");
        //Reading item ID to remove
        int id = scanner.nextInt();
        //Removing the item if found in the inventory
        if (inventory.removeItem(id)) {
            //Confirming item removal
            System.out.println("Item removed successfully.");
        } else {
            //Displaying message if item not found
            System.out.println("Item not found.");
        }
    }

    //Method to diaplay the inventory
    private static void displayInventory() {
        //Displaying the inventory
        inventory.displayInventory();
    }

    //Method to manage sales operations
    private static void salesManagement(Scanner scanner) {
        int choice;
        //Displaying sales management options and processing user choice
        do {
            System.out.println("\nSales Management:");
            System.out.println("1. Create new sale");
            System.out.println("2. Add item to sale");
            System.out.println("3. Remove item from sale");
            System.out.println("4. Calculate total cost");
            System.out.println("5. Exit to main menu");
            System.out.print("Enter your choice: ");
            //Reading user choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Calling method to create a new sale
                    createSale();
                    break;
                case 2:
                    //Calling method to add item to sale
                    addItemToSale(scanner);
                    break;
                case 3:
                    //Calling method to remove item from sale
                    removeItemFromSale(scanner);
                    break;
                case 4:
                    //Calling method to calculate total cost of sale
                    calculateTotalCost();
                    break;
                case 5:
                    //Exiting to main menu
                    System.out.println("Exiting to main menu...");
                    break;
                default:
                    //Handling invaild input
                    System.out.println("Invalid choice. Please try again.");
            }
        //Repeating until user chooses to exit to main menu
        } while (choice != 5);
    }

    //Method to create a new sale
    private static void createSale() {
        //Creating a new sale object
        Sales sale = new Sales();
        //Adding the sale to the sales manager
        salesManager.addSale(sale);
        //Displaying the created sale ID
        System.out.println("Sale created with ID: " + sale.getSaleID());
    }

    //Method to add an item to a sale
    private static void addItemToSale(Scanner scanner) {
        System.out.print("Enter sale ID: ");
        //Reading sale ID
        int saleID = scanner.nextInt();
        //Finding the sale with the given ID
        Sales sale = salesManager.findSale(saleID);
        if (sale != null) {
            System.out.print("Enter item ID to add: ");
            //Reading item ID to add
            int itemID = scanner.nextInt();
            //Finding the item in the inventory
            Item item = inventory.findItem(itemID);
            if (item != null) {
                //Adding the item to the sale
                sale.addItem(item);
                //Confirming item addition
                System.out.println("Item added to sale.");
            } else {
                //Displaying message if item not found
                System.out.println("Item not found in inventory.");
            }
        } else {
            //Displaying message if sale not found
            System.out.println("Sale not found.");
        }
    }

    //Method to remove an item from a sale
    private static void removeItemFromSale(Scanner scanner) {
        System.out.print("Enter sale ID: ");
        //Reading sale ID
        int saleID = scanner.nextInt();
        //Finding the sale with the given ID
        Sales sale = salesManager.findSale(saleID);
        if (sale != null) {
            System.out.print("Enter item ID to remove: ");
            //Reading item ID to remove
            int itemID = scanner.nextInt();
            //Finding the item in the sale
            Item item = inventory.findItem(itemID);
            if (item != null) {
                //Removing the item from the sale
                sale.removeItem(item);
                //Confirming item removal
                System.out.println("Item removed from sale.");
            } else {
                //Displaying message if item not found 
                System.out.println("Item not found in sale.");
            }
        } else {
            //Displaying message if sale not found
            System.out.println("Sale not found.");
        }
    }

    //Method to calculate total cost of a sale
    private static void calculateTotalCost() {
        //Creating a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sale ID: ");
        //Reading sale ID
        int saleID = scanner.nextInt();
        //Finding the sale with the given ID
        Sales sale = salesManager.findSale(saleID);
        //Displaying total cost before discount
        System.out.println("Total cost before discount: $" + sale.getTotalCost());
        if (sale != null) {
            System.out.print("Enter loyalty points to use as discount: ");
            //Reading loyalty points for discount
            int loyaltyPoints = scanner.nextInt();
            //Calculating discount based on loyalty points
            sale.calculateDiscount(loyaltyPoints);
            //Calculating total cost after discount
            float discountedAmount = sale.getTotalCost() - sale.getDiscount();
            //Displaying total cost after discount
            System.out.println("Total cost after discount: $" + discountedAmount );
        } 
        //Closing the scanner
        scanner.close();
    }
}

