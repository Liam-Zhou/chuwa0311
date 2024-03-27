package com.chuwa.learn;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CompletableFutureHW3 {
    private static final Logger logger = Logger.getLogger(CompletableFutureHW3.class.getName());

    public static void main(String[] args) {
        CompletableFuture<String> productsFuture = fetchFromAPI("https://jsonplaceholder.typicode.com/products");
        CompletableFuture<String> reviewsFuture = fetchFromAPI("https://jsonplaceholder.typicode.com/reviews");
        CompletableFuture<String> inventoryFuture = fetchFromAPI("https://jsonplaceholder.typicode.com/inventory");

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(productsFuture, reviewsFuture, inventoryFuture);

        combinedFuture.thenRun(() -> {
            try {
                String productsData = productsFuture.get();
                String reviewsData = reviewsFuture.get();
                String inventoryData = inventoryFuture.get();

                // Merge the fetched data for further processing
                System.out.println("Products Data: " + productsData);
                System.out.println("Reviews Data: " + reviewsData);
                System.out.println("Inventory Data: " + inventoryData);

                // Process the merged data
                processMergedData(productsData, reviewsData, inventoryData);
            } catch (InterruptedException | ExecutionException e) {
                logger.log(Level.SEVERE, "Exception occurred during API call.", e);
                // Return default value or handle the exception as needed
                System.out.println("Error fetching data. Using default values.");
            }
        });

        // Block and wait for the combinedFuture to complete
        combinedFuture.join();
    }

    // Method to fetch data from a fake API
    public static CompletableFuture<String> fetchFromAPI(String apiUrl) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate fetching data from the API
                Thread.sleep(2000); // Simulate delay
                return "Fake Data from " + apiUrl;
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "InterruptedException occurred during API call.", e);
                Thread.currentThread().interrupt(); // Restore interrupted status
                return null;
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Exception occurred during API call.", e);
                return null;
            }
        });
    }

    // Method to process the merged data
    public static void processMergedData(String productsData, String reviewsData, String inventoryData) {
        // Implement your logic to process the merged data here
        System.out.println("Processing merged data...");
    }
}
