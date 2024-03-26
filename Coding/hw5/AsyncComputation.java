import java.util.concurrent.CompletableFuture;

public class AsyncComputation {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        CompletableFuture<Integer> sumFuture = getSum(number1, number2);
        CompletableFuture<Integer> productFuture = getProduct(number1, number2);

        sumFuture.thenCombine(productFuture, (sum, product) -> {
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            return null;
        }).join();
    }

    private static CompletableFuture<Integer> getSum(int number1, int number2) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating sum...");
            return number1 + number2;
        });
    }

    private static CompletableFuture<Integer> getProduct(int number1, int number2) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating product...");
            return number1 * number2;
        });
    }
}
