package creationalpatterns.singleton;

/**
 * 懒汉式(线程不安全)
 */
public class LazyStyle {
    private static LazyStyle instance;
    private LazyStyle(){}
    public static LazyStyle getInstance(){
        if (instance == null){
            instance = new LazyStyle();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazyStyle instance1 = LazyStyle.getInstance();
        LazyStyle instance2 = LazyStyle.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1:" + instance1.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }

}
