public class ReportImplementation implements Report {
    @Override
    public void generateProductReport(Product product) {
        // Simulate product report generation
        System.out.println("Product Report:");
        System.out.println("Product ID: " + product.getProductID());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Number of Items: " + product.getNumberOfItems());
        System.out.println("------------------------");
    }

    @Override
    public void generateTransactionReport(Transaction transaction) {
        // Simulate transaction report generation
        System.out.println("Transaction Report:");
        System.out.println("Transaction ID: " + transaction.getTransactionID());
        System.out.println("Transaction Type: " + transaction.getTransactionType());
        System.out.println("Transaction Date: " + transaction.getTransactionDate());
        System.out.println("Product ID: " + transaction.getProductID());
        System.out.println("Number of Items: " + transaction.getNumberOfItems());
        if (transaction instanceof OutgoingTransactions) {
            System.out.println("Store ID: " + ((OutgoingTransactions) transaction).getStoreId());
        }
        System.out.println("------------------------");
    }

    @Override
    public void generateStoreReport(Store store) {
        // Simulate store report generation
        System.out.println("Store Report:");
        System.out.println("Store ID: " + store.getStoreId());
        System.out.println("Store Name: " + store.getStoreName());
        System.out.println("Store Address: " + store.getStoreAddress());
        System.out.println("------------------------");
    }
}