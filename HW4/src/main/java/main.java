public class main {
    public static void main(String[] args) {
        LazySingleton lazySingletonInstance1 = LazySingleton.getInstance();
        LazySingleton lazySingletonInstance2 = LazySingleton.getInstance();
        System.out.print("LazySingleton instances are equal: " );
        System.out.println(lazySingletonInstance2 == lazySingletonInstance1);

        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());


        Director director = new Director(new MobileBuilder());
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
