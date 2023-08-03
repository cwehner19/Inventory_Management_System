public class IncomingTransactions implements Transaction {
    private String transactionId;
    private String transactionType;
    private String transactionDate;
    private String productId;
    private int numberOfItems;

    // Constructor
    public IncomingTransactions(String transactionId, String transactionDate, String productId, int numberOfItems) {
        this.transactionId = transactionId;
        this.transactionType = "Incoming"; // Set the type as Incoming
        this.transactionDate = transactionDate;
        this.productId = productId;
        this.numberOfItems = numberOfItems;
    }

    @Override
    public String getTransactionID() {
        return null;
    }

    // Implementing getters
    @Override
    public String getTransactionId() {
        return this.transactionId;
    }

    @Override
    public String getTransactionType() {
        return this.transactionType;
    }

    @Override
    public String getTransactionDate() {
        return this.transactionDate;
    }

    @Override
    public String getProductID() {
        return null;
    }

    @Override
    public String getProductId() {
        return this.productId;
    }

    @Override
    public int getNumberOfItems() {
        return this.numberOfItems;
    }

    @Override
    public void setTransactionId(String id) {
        this.transactionId = id;
    }

    @Override
    public void setTransactionType(String type) {
        this.transactionType = type;
    }

    @Override
    public void setTransactionDate(String date) {
        this.transactionDate = date;
    }

    @Override
    public void setProductID(String productID) {

    }

    @Override
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public void setStoreID(String storeID) {

    }

    // If the storeId is not relevant for incoming transactions, you might omit these methods
    @Override
    public String getStoreId() {
        return null;
    }

    @Override
    public void setTransactionID(String ID) {

    }

    @Override
    public void setStoreId(String storeId) {
        // Do nothing or throw an UnsupportedOperationException if this method should not be used for incoming transactions
    }
}
