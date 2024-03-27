package org.example;

import java.util.concurrent.CompletableFuture;

public class Q_25_A {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Asynchronously compute the sum of num1 and num2
        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> {
            return num1 + num2;
        });

        // Asynchronously compute the product of num1 and num2
        CompletableFuture<Integer> productFuture = CompletableFuture.supplyAsync(() -> {
            return num1 * num2;
        });

        // Use thenAccept() to print the result of sumFuture when it's done
        sumFuture.thenAccept(sum -> System.out.println("Sum: " + sum));

        // Use thenAccept() to print the result of productFuture when it's done
        productFuture.thenAccept(product -> System.out.println("Product: " + product));

        // Wait for all futures to complete to prevent the program from exiting prematurely
        CompletableFuture.allOf(sumFuture, productFuture).join();
    }
}
