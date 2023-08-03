public class StoreImplementation implements Store {
    private String storeId;
    private String storeName;
    private String storeAddress;

    // Constructor
    public StoreImplementation(String storeId, String storeName, String storeAddress) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
    }

    // Implementing getters

    public String getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreAddress() {
        return this.storeAddress;
    }

    // Implementing setters

    public void setStoreId(String id) {
        this.storeId = id;
    }


    public void setStoreName(String name) {
        this.storeName = name;
    }


    public void setStoreAddress(String address) {
        this.storeAddress = address;
    }
}
