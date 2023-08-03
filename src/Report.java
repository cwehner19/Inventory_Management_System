public interface Report {
    // Methods for generating different types of reports
    void generateProductReport(Product product);
    void generateTransactionReport(Transaction transaction);
    void generateStoreReport(Store store);
}
