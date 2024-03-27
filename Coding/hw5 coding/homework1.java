import java.util.concurrent.CompletableFuture;

public class SumProductCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> {
            return num1 + num2;
        });

        CompletableFuture<Integer> productFuture = CompletableFuture.supplyAsync(() -> {
            return num1 * num2;
        });

        sumFuture.thenAcceptAsync(sum -> {
            System.out.println("Sum: " + sum);
        });

        productFuture.thenAcceptAsync(product -> {
            System.out.println("Product: " + product);
        });

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(sumFuture, productFuture);
        combinedFuture.join();
    }
}