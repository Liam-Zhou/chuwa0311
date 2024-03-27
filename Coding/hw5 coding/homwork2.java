import java.util.concurrent.CompletableFuture;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OnlineStore {
    private static final OkHttpClient httpClient = new OkHttpClient();

    public static void main(String[] args) {
        CompletableFuture<JSONArray> productsFuture = fetchDataAsync("/posts");
        CompletableFuture<JSONArray> reviewsFuture = fetchDataAsync("/comments");
        CompletableFuture<JSONArray> inventoryFuture = fetchDataAsync("/todos");

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(
                productsFuture, reviewsFuture, inventoryFuture);

        combinedFuture.thenRun(() -> {
            try {
                JSONArray products = productsFuture.get();
                JSONArray reviews = reviewsFuture.get();
                JSONArray inventory = inventoryFuture.get();

                System.out.println("Products: " + products);
                System.out.println("Reviews: " + reviews);
                System.out.println("Inventory: " + inventory);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        combinedFuture.join();
    }

    private static CompletableFuture<JSONArray> fetchDataAsync(String endpoint) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Request request = new Request.Builder()
                        .url("https://jsonplaceholder.typicode.com" + endpoint)
                        .build();

                Response response = httpClient.newCall(request).execute();
                String responseBody = response.body().string();
                return new JSONArray(responseBody);
            } catch (Exception e) {
                e.printStackTrace();
                return new JSONArray();
            }
        });
    }
}