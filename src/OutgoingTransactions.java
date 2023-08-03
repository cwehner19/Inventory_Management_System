public class OutgoingTransactions implements Transaction{
    private String transactionId;
    private String transactionType; // You may set this to "Outgoing" in the constructor
    private String transactionDate;
    private String productId;
    private int numberOfItems;
    private String storeId;

    // Constructor
    public OutgoingTransactions(String transactionId, String transactionDate, String productId, int numberOfItems, String storeId) {
        this.transactionId = transactionId;
        this.transactionType = "Outgoing"; // Set the type as Outgoing
        this.transactionDate = transactionDate;
        this.productId = productId;
        this.numberOfItems = numberOfItems;
        this.storeId = storeId; // Initialize the storeId
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
    public String getStoreId() {
        return this.storeId; // Return the storeId for outgoing transactions
    }

    @Override
    public void setTransactionID(String ID) {

    }

    // Implementing setters
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

    @Override
    public void setStoreId(String storeId) {
        this.storeId = storeId; // Set the storeId for outgoing transactions
    }
}
