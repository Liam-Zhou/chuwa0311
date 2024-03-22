public class EagerLoadedSingleton {
    private static final EagerLoadedSingleton instance = new EagerLoadedSingleton();
    private EagerLoadedSingleton() {}
    public static EagerLoadedSingleton getInstance() {
        return instance;
    }
}

public class LazyLoadedSingleton {
    private static LazyLoadedSingleton instance;
    private LazyLoadedSingleton() {}
    public static LazyLoadedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyLoadedSingleton();
        }
        return instance;
    }
}