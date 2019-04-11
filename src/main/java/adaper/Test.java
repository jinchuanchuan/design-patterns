package adaper;

/**
 *  测试适配器模式
 */
public class Test {
    public static void main(String[] args) {
        Adaper adaper = new Adaper(new Adapee());
        adaper.specificRequest();
    }
}
