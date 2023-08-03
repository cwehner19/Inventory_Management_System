public class ProductImplementation implements Product{
    private String productID;
    private String productName;
    private int numberOfProducts;


    //Constructor
    public ProductImplementation(String productID,String productName,int numberOfItems){
        this.productID = productID;
        this.productName = productName;
        this.numberOfProducts = numberOfItems;
    }

    //getters
    public String getProductID(){
        return this.productID;
    }

    public String getProductName(){
        return this.productName;
    }

    @Override
    public int getNumberOfItems() {
        return this.numberOfProducts;
    }

    public int getNumberOfProducts(){
        return this.numberOfProducts;
    }

    //Setters

    public void setProductID(String ID){
        this.productID = ID;
    }

    public void setProductName(String name){
        this.productName = name;
    }

    @Override
    public void setNumberOfItems(int numberOfItems) {
            this.numberOfProducts = numberOfItems;
    }

}