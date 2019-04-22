package observer;

/**
 * @description:
 * @author: jcc
 * @date: 2019-04-22 14:58
 * @Modified By:
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者1号收到信息，并进行处理。");
    }
}
