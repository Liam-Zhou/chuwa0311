public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    private static class LazySingletonHolder{
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance(){
        return LazySingletonHolder.INSTANCE;
    }


}
