package creationalpatterns.singleton;

/**
 * 饿汉式(静态常量写法)-单例
 * 线程安全
 * @author zeng
 */
public class HungryManStyle {
    private HungryManStyle(){}
    private static final HungryManStyle INSTANCE = new HungryManStyle();
    public static HungryManStyle getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        HungryManStyle instance = HungryManStyle.getInstance();
        HungryManStyle instance1 = HungryManStyle.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance);
        System.out.println(instance1);
    }
}
