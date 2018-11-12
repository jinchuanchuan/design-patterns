package proxy;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-26 17:50
 * @Modified By:
 */
public class ProxySubject implements AbstractSubject {
    private AbstractSubject real;

    public ProxySubject(AbstractSubject real) {
        this.real = real;
    }

    @Override
    public void doSomething() {
        real.doSomething();
    }

    public void doOtherthing() {

    }

}
