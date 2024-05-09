import java.util.*;

//SalesManager class manages the sales in the store
class SalesManager {
    //Map to store sales with their IDs
    private Map<Integer, Sales> sales;
    
    //Constructor to initialize the sales manager with an empty sales map
    public SalesManager() {
        this.sales = new HashMap<>();
    }

    //Method to add a sale to the sales manager
    public void addSale(Sales sale) {
        sales.put(sale.getSaleID(), sale);
    }

    //Method to find a sale in the sales manager by its ID
    public Sales findSale(int saleID) {
        return sales.get(saleID);
    }
}