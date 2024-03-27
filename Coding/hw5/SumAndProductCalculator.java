import java.util.concurrent.CompletableFuture;

public class SumAndProductCalculator {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> number1 + number2);
        CompletableFuture<Integer> productFuture = CompletableFuture.supplyAsync(() -> number1 * number2);

        sumFuture.thenCombine(productFuture, (sum, product) -> {
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            return null;
        }).join();
    }
}
