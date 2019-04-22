package observer;

/**
 * @description:
 * @author: jcc
 * @date: 2019-04-22 14:59
 * @Modified By:
 */
public class ConcreteObserver2 implements Observer {

    @Override
    public void update() {
        System.out.println("观察者2号收到信息，并进行处理。");
    }
}
