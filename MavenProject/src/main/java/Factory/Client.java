package Factory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();

        Coffee coffee = store.orderCoffee("americano");

        System.out.println(coffee.getName());
    }
}
