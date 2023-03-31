package creationalpatterns.singleton;

/**
 * 饿汉式(静态代码块)
 */
public class HungryManForCodeBlock {
    private HungryManForCodeBlock(){}
    private static HungryManForCodeBlock INSTANCE;

    /*
     * 静态代码块内创建对象并赋值
     */
    static {
        INSTANCE = new HungryManForCodeBlock();
    }

    public static HungryManForCodeBlock getINSTANCE() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        HungryManForCodeBlock instance = HungryManForCodeBlock.getINSTANCE();
        HungryManForCodeBlock instance1 = HungryManForCodeBlock.getINSTANCE();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
