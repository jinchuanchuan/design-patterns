package observer;

import java.util.Vector;

/**
 * @description:
 * @author: jcc
 * @date: 2019-04-22 14:57
 * @Modified By:
 */
public interface Subject {
    void addObserver(Observer observer);

    void delObserver(Observer observer);

    void notifyObservers();

    void doSometing();
}
