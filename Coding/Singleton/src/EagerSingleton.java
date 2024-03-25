public class EagerSingleton {
    // Eagerly initialized singleton instance
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation from outside
    private EagerSingleton() {
    }

    // Static method to get the singleton instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}

