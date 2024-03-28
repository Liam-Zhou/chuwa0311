package org.example;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OnlineStore {
    private static final Logger logger = Logger.getLogger(OnlineStore.class.getName());
    public static void main(String[] args) {
        // Fetch data from three APIs concurrently
        CompletableFuture<String> productsFuture = fetchDataFromAPI("https://jsonplaceholder.typicode.com/posts");
        CompletableFuture<String> reviewsFuture = fetchDataFromAPI("https://jsonplaceholder.typicode.com/comments");
        CompletableFuture<String> inventoryFuture = fetchDataFromAPI("https://jsonplaceholder.typicode.com/todos");

        // Combine the results of all three CompletableFuture instances
        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(productsFuture, reviewsFuture, inventoryFuture);

        // When all futures complete, merge the fetched data
        combinedFuture.thenRun(() -> {
            // .join() is called, it waits for all of the CompletableFuture instances to complete.
            String productsData = productsFuture.join();
            String reviewsData = reviewsFuture.join();
            String inventoryData = inventoryFuture.join();

            // Merge the fetched data for further processing
            mergeData(productsData, reviewsData, inventoryData);
        });
        // Ensure the main thread waits for completion of all CompletableFuture instances
        combinedFuture.join();
    }
    private static CompletableFuture<String> fetchDataFromAPI(String apiUrl) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate fetching data from the API
                // Here, you would typically make an HTTP request to the API
                // and retrieve the data

                // For demonstration purposes, we'll just return a sample string
                return "Sample data from API: " + apiUrl;
            } catch (Exception e) {
                // Log the exception information
                logger.log(Level.SEVERE, "Error fetching data from API: " + apiUrl, e);
                // Return a default value in case of exception
                return "Default data";
            }
        }).exceptionally(ex -> {
            // Log the exception information
            logger.log(Level.SEVERE, "Error fetching data from API: " + apiUrl, ex);
            // Return a default value in case of exception
            return "Default data";
        });
    }
    private static void mergeData(String productsData, String reviewsData, String inventoryData) {
        // Merge the fetched data here for further processing
        System.out.println("Merging data:");
        System.out.println("Products data: " + productsData);
        System.out.println("Reviews data: " + reviewsData);
        System.out.println("Inventory data: " + inventoryData);
    }

}
