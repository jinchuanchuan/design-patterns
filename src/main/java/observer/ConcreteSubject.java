package observer;

import java.util.Vector;

/**
 * @description:
 * @author: jcc
 * @date: 2019-04-22 14:57
 * @Modified By:
 */
public class ConcreteSubject implements Subject {
    private Vector<Observer> obs = new Vector<>();

    @Override
    public void addObserver(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer s : obs){
            s.update();
        }
    }

    @Override
    public void doSometing() {
        System.out.println("被观察者事件发生");
        this.notifyObservers();
    }
}
