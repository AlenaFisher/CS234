import java.util.*;

//Sales class represents a sale in the store
class Sales {
    //Static variable to track the next sale ID
    private static int nextSaleID = 1;
    //Sale ID
    private final int saleID;
    //Date of the sale
    private final Date saleDate;
    //List of items in the sale
    private final List<Item> items;
    //Total cost of the sale
    private float totalCost;
    //Discount applied to the sale
    private float discount;

    //Constructor to initialize a sale with a unique ID, current date, and empty item list
    public Sales() {
        this.saleID = nextSaleID++;
        this.saleDate = new Date();
        this.items = new ArrayList<>();
        this.totalCost = 0.0f;
        this.discount = 0.0f;
    }

    
    //Gets and returns the sale ID
    public int getSaleID() {
        return saleID;
    }


    //Gets and returns the sale date
    public Date getSaleDate() {
        return saleDate;
    }

    
    //Gets and returns the discount
    public float getDiscount() {
        return discount;
    }
    
    //Sets the discount applied to the sale
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    //Gets and returns the total cost
    public float getTotalCost() {
        return totalCost;
    }

    //Sets the total cost of the sale
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    //Method to add an item to the sale and update the total cost
    public void addItem(Item item) {
        items.add(item);
        totalCost += item.getPrice();
    }

    //Method to remove an item from the sale and update the total cost
    public void removeItem(Item item) {
        if (items.remove(item)) {
            totalCost -= item.getPrice();
        }
    }

    //Method to calculate the discount based on loyalty points and update the discount
    public void calculateDiscount(int loyaltyPoints) {
        // Assume 1 loyalty point gives a discount of 0.01
        this.discount = loyaltyPoints * 0.01f;
        //Checking if the discount exceeds the total cost
        if (discount > totalCost) {
            //Setting the discount to the total cost
            discount = totalCost;
        }
    }
}
