import java.util.Scanner;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Inventory Management System Menu");
            System.out.println("Select an option:");
            System.out.println("p. Add Product");
            System.out.println("s. Add Store");
            System.out.println("i. Process Incoming Transaction");
            System.out.println("o. Process Outgoing Transaction");
            System.out.println("r. View Reports");
            System.out.println("x. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "p": {
                    System.out.print("Enter the product's ID: ");
                    String productId = scanner.nextLine();

                    System.out.print("Enter the product's name: ");
                    String productName = scanner.nextLine();

                    System.out.print("Enter the number of items: ");
                    int numberOfItems = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    Product product = new ProductImplementation(productId, productName, numberOfItems);
                    inventory.addProduct(product);

                    System.out.println("Product added successfully!");
                    break;
                }
                case "s": {
                    System.out.print("Enter the store's ID: ");
                    String storeId = scanner.nextLine();

                    System.out.print("Enter the store's name: ");
                    String storeName = scanner.nextLine();

                    System.out.print("Enter the store's address: ");
                    String storeAddress = scanner.nextLine();

                    StoreImplementation store = new StoreImplementation(storeId, storeName, storeAddress);
                     inventory.addStore(store); // Uncomment if you want to add the store to a collection

                    System.out.println("Store added successfully!");
                    break;
                }
                case "i": {
                    System.out.print("Enter the transaction ID: ");
                    String transactionId = scanner.next();

                    System.out.print("Enter the transaction date (e.g., 2023-07-28): ");
                    String transactionDate = scanner.next();

                    System.out.print("Enter the product ID: ");
                    String productId_i = scanner.next(); // Renamed variable to avoid conflict

                    System.out.print("Enter the number of items: ");
                    int numberOfItems_i = scanner.nextInt(); // Renamed variable to avoid conflict

                    IncomingTransactions incomingTransaction = new IncomingTransactions(transactionId, transactionDate, productId_i, numberOfItems_i);
                    inventory.processIncomingTransaction(incomingTransaction); // Fixed variable name

                    System.out.println("Incoming transaction processed successfully!");
                    break;
                }

                case "o": {
                    System.out.print("Enter the transaction ID: ");
                    String transactionId = scanner.next();

                    System.out.print("Enter the transaction date (e.g., 2023-07-28): ");
                    String transactionDate = scanner.next();

                    System.out.print("Enter the product ID: ");
                    String productId_o = scanner.next(); // Renamed variable to avoid conflict

                    System.out.print("Enter the number of items: ");
                    int numberOfItems_o = scanner.nextInt(); // Renamed variable to avoid conflict

                    System.out.print("Enter the store ID: ");
                    String storeId = scanner.next();

                    OutgoingTransactions outgoingTransaction = new OutgoingTransactions(transactionId, transactionDate, productId_o, numberOfItems_o, storeId);
                    inventory.processOutgoingTransaction(outgoingTransaction); // Assuming this method exists

                    System.out.println("Outgoing transaction processed successfully!");
                    break;

                }

                case "r": {
                        boolean back = false;
                        while (!back) {
                            System.out.println("Select report type:");
                            System.out.println("1. Product Report");
                            System.out.println("2. Transaction Report");
                            System.out.println("3. Store Report");
                            System.out.println("b. Back to Main Menu");
                            String reportChoice = scanner.nextLine();

                            switch (reportChoice) {
                                case "1": {
                                    System.out.print("Enter the product's ID to generate the report: ");
                                    String productId = scanner.nextLine();
                                    Product product = inventory.getProductID(productId); // Assuming this method exists
                                    Report report = new ReportImplementation();
                                    report.generateProductReport(product);
                                    break;
                                }
                                case "2": {
                                    System.out.print("Enter the transaction's ID to generate the report: ");
                                    String transactionId = scanner.nextLine();
                                    Transaction transaction = inventory.getTransactionById(transactionId); // Assuming this method exists
                                    Report report = new ReportImplementation();
                                    report.generateTransactionReport(transaction);
                                    break;
                                }
                                case "3": {
                                    System.out.print("Enter the store's ID to generate the report: ");
                                    String storeId = scanner.nextLine();
                                    Store store = inventory.getStoreById(storeId); // Assuming this method exists
                                    Report report = new ReportImplementation();
                                    report.generateStoreReport(store);
                                    break;
                                }
                                case "b": {
                                    back = true; // Exit report submenu
                                    break;
                                }
                                default:
                                    System.out.println("Invalid choice, please try again.");
                            }
                        }
                        break;
                    }

                case "x": {
                    exit = true; // Exit the loop and end the program
                    break;
                }
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }


    }

