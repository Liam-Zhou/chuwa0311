package com.chuwa.learn;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureHW1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Asynchronously calculate the sum of two integers
        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> num1 + num2);

        // Asynchronously calculate the product of two integers
        CompletableFuture<Integer> productFuture = CompletableFuture.supplyAsync(() -> num1 * num2);

        // Print the results when both calculations are complete
        CompletableFuture<Void> printResults = sumFuture.thenCombine(productFuture, (sum, product) -> {
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
            System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
            return null; // CompletableFuture<Void> requires a return value
        });

        printResults.join(); // Blocking call to wait for completion
    }
}
