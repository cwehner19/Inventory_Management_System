import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;
    private Map<String, Transaction> transactions; // Added to manage transactions
    private Map<String, Store> stores; // Added to manage stores

    // Constructor
    public Inventory() {
        products = new HashMap<>();
        transactions = new HashMap<>(); // Initialize transactions
        stores = new HashMap<>(); // Initialize stores
    }

    // Method to add a new product to the inventory
    public void addProduct(Product product) {
        products.put(product.getProductID(), product);
    }

    // Method to remove a product from the inventory
    public void removeProduct(String productId) {
        products.remove(productId);
    }

    // Method to update the quantity of a product
    public void updateProductQuantity(String productId, int quantity) {
        Product product = products.get(productId);
        if (product != null) {
            product.setNumberOfItems(quantity);
        }
    }

    // Method to process an incoming transaction
    public void processIncomingTransaction(IncomingTransactions transaction) {
        // Logic to handle incoming transaction, such as updating product quantities
        transactions.put(transaction.getTransactionId(), transaction); // Save transaction
    }

    // Method to process an outgoing transaction
    public void processOutgoingTransaction(OutgoingTransactions transaction) {
        // Logic to handle outgoing transaction, such as updating product quantities
        transactions.put(transaction.getTransactionId(), transaction); // Save transaction
    }

    // Method to retrieve a transaction by ID
    public Transaction getTransactionById(String transactionId) {
        return transactions.get(transactionId); // Return the transaction by ID
    }

    // Method to add a store
    public void addStore(Store store) {
        stores.put(store.getStoreId(), store); // Save store
    }

    // Method to retrieve a store by ID
    public Store getStoreById(String storeId) {
        return stores.get(storeId); // Return the store by ID
    }

    // Methods to generate reports
    public List<Product> getAvailableItems() {
        // Logic to generate a report of available items
        return null;
    }

    public List<Transaction> getIncomingTransactions() {
        // Logic to generate a report of incoming transactions
        return null;
    }

    public List<Transaction> getOutgoingTransactions() {
        // Logic to generate a report of outgoing transactions
        return null;
    }

    public Product getProductID(String productId) {
        return products.get(productId); // Return the product by ID
    }
}
