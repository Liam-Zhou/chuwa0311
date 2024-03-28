import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class CompletableFutureSum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int number1 = 5;
        int number2 = 10;

        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> number1 + number2);

        CompletableFuture<Integer> productFuture = CompletableFuture.supplyAsync(() -> number1 * number2);

        sumFuture.thenAccept(sum -> System.out.println("Sum: " + sum));

        productFuture.thenAccept(product -> System.out.println("Product: " + product));

        sumFuture.thenCombine(productFuture, (sum, product) -> {
            System.out.println("Combined Results - Sum: " + sum + ", Product: " + product);
            return null;
        }).get();
    }
}
