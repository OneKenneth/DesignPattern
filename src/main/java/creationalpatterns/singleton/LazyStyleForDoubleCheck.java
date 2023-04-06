package creationalpatterns.singleton;

/**
 * 双重检查锁-懒汉式
 */
public class LazyStyleForDoubleCheck {
    private static volatile LazyStyleForDoubleCheck instance;
    private LazyStyleForDoubleCheck(){}

    public static LazyStyleForDoubleCheck getInstance() {
        if (instance == null){
            synchronized (LazyStyleForDoubleCheck.class){
                if (instance == null){
                    instance = new LazyStyleForDoubleCheck();
                }
            }
        }
        return instance;
    }
}
