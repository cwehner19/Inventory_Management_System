import java.util.HashMap;
import java.util.Map;

public class DatabaseImplementation implements Database {
    // In-memory data store to simulate the database
    private Map<String, Map<String, String[]>> dataStore;

    public DatabaseImplementation() {
        dataStore = new HashMap<>();
    }

    @Override
    public void createRecord(String tableName, String[] data) {
        if (!dataStore.containsKey(tableName)) {
            dataStore.put(tableName, new HashMap<>());
        }

        String recordId = data[0];
        dataStore.get(tableName).put(recordId, data);
    }

    @Override
    public String[] readRecord(String tableName, String recordId) {
        if (dataStore.containsKey(tableName)) {
            return dataStore.get(tableName).get(recordId);
        }
        return null;
    }

    @Override
    public void updateRecord(String tableName, String recordId, String[] data) {
        if (dataStore.containsKey(tableName) && dataStore.get(tableName).containsKey(recordId)) {
            dataStore.get(tableName).put(recordId, data);
        }
    }

    @Override
    public void deleteRecord(String tableName, String recordId) {
        if (dataStore.containsKey(tableName)) {
            dataStore.get(tableName).remove(recordId);
        }
    }
}

