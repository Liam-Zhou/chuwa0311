public class LazySingleton {
    // Lazily initialized singleton instance
    private static LazySingleton instance;

    // Private constructor to prevent instantiation from outside
    private LazySingleton() {
    }

    // Static method to get the singleton instance, created lazily
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
