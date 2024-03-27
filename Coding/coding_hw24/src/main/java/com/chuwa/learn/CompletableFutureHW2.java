package com.chuwa.learn;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureHW2 {
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Block and wait for the combinedFuture to complete
        combinedFuture.join();
    }

    // Method to fetch data from a fake API
    public static CompletableFuture<String> fetchFromAPI(String apiUrl) {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate fetching data from the API
            try {
                // Assume we are fetching JSON data from the API
                Thread.sleep(2000); // Simulate delay
                return "Fake Data from " + apiUrl;
            } catch (InterruptedException e) {
                e.printStackTrace();
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
