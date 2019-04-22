package observer;

/**
 * @description:
 * @author: jcc
 * @date: 2019-04-22 15:06
 * @Modified By:
 */
public class TestMain {
    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        sub.addObserver(new ConcreteObserver1());
        sub.addObserver(new ConcreteObserver2());
        sub.doSometing();
    }
}
