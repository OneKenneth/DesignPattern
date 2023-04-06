package creationalpatterns.singleton;

/**
 * 懒汉式(同步方法)
 */
public class LazyStyleForSynchronizedMethod {
    private static LazyStyleForSynchronizedMethod instance;
    private LazyStyleForSynchronizedMethod(){}

    /**
     * 同步方法
     * @return instance对象实例
     */
    public static synchronized LazyStyleForSynchronizedMethod getInstance(){
        if (instance == null){
            instance = new LazyStyleForSynchronizedMethod();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazyStyleForSynchronizedMethod instance1 = LazyStyleForSynchronizedMethod.getInstance();
        LazyStyleForSynchronizedMethod instance2 = LazyStyleForSynchronizedMethod.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1:" + instance1.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}
