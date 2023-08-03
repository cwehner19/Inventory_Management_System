public interface Transaction {

    String getTransactionID();

    // Implementing getters
    String getTransactionId();

    String getTransactionType();        //Incoming or Outgoing
    String getTransactionDate();        //Date type
    String getProductID();

    String getProductId();

    int getNumberOfItems();

    //outgoing transactions
    String getStoreId();

    //Setters
    void setTransactionID(String ID);

    // Implementing setters
    void setTransactionId(String id);

    void setTransactionType(String type);
    void setTransactionDate(String date);
    void setProductID(String productID);

    void setProductId(String productId);

    void setNumberOfItems(int numberOfItems);

    void setStoreID(String storeID);

    void setStoreId(String storeId);
}
