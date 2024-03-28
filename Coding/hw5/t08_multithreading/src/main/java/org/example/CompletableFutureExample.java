package org.example;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculate sum: ");
            return num1 + num2;
        });
        CompletableFuture<Integer> productFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculate product: ");
            return num1 * num2;
        });

        //specify action to be performed when future(sumFuture) complete
        //SumFuture.thenAcceptBoth(ProductFuture, (sum, product) -> {
        productFuture.thenAcceptBoth(sumFuture, (product, sum) -> {
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
        });

        // Ensure main thread waits for completion of both futures
        CompletableFuture.allOf(sumFuture, productFuture).join();
    }
}
