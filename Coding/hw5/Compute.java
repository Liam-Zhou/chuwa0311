package com.elaine.getStarted;

import java.util.concurrent.CompletableFuture;

public class Compute {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;

        CompletableFuture<Integer> sumFuture = getSum(num1, num2);
        CompletableFuture<Integer> productFuture = getProduct(num1, num2);

        sumFuture.thenCombine(productFuture, (sum, product) -> {
            System.out.println("Calculated sum is: " + sum);
            System.out.println("Calculated product is: " + product);
            return null;
        }).join();
    }

    private static CompletableFuture<Integer> getSum(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating sum");
            return a + b;
        });
    }

    private static CompletableFuture<Integer> getProduct(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating product");
            return a * b;
        });
    }
}