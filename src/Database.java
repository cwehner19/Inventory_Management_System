public interface Database {
    // CRUD operations
    void createRecord(String tableName, String[] data);
    String[] readRecord(String tableName, String recordId);
    void updateRecord(String tableName, String recordId, String[] data);
    void deleteRecord(String tableName, String recordId);
}
