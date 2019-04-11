package decorator;

/**
 *  测试类，看一下你就会发现，跟java的I/O操作有多么相似
 */
public class Test {
    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new Decorator_second(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
