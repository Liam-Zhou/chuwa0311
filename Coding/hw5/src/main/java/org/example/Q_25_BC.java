package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class Q_25_BC {

    private static final HttpClient httpClient = HttpClient.newHttpClient();

    public static CompletableFuture<String> fetchData(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .exceptionally(ex -> {
                    System.out.println("Failed to fetch data from " + url + ": " + ex.getMessage());
                    return "Default Data"; // Return default data in case of exception
                });
    }

    public static void main(String[] args) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/1";

        // Simulate fetching data from three different APIs with exception handling
        CompletableFuture<String> productsFuture = fetchData(apiUrl); // Pretend this is the products API
        CompletableFuture<String> reviewsFuture = fetchData(apiUrl);  // Pretend this is the reviews API
        CompletableFuture<String> inventoryFuture = fetchData(apiUrl); // Pretend this is the inventory API

        // Combine the results of the three APIs
        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(productsFuture, reviewsFuture, inventoryFuture)
                .thenRun(() -> {
                    String products = productsFuture.join(); // This would block until the productsFuture is complete, but it's guaranteed to be completed at this point
                    String reviews = reviewsFuture.join();   // Same here
                    String inventory = inventoryFuture.join(); // And here

                    // Further processing with the fetched data
                    System.out.println("Products Data: " + products);
                    System.out.println("Reviews Data: " + reviews);
                    System.out.println("Inventory Data: " + inventory);

                    // Here you can merge and process the data as needed for the application
                });

        // Wait for all operations to complete
        combinedFuture.join();
    }
}
