package singleton;

public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton() {}

    private static class SingletonHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
