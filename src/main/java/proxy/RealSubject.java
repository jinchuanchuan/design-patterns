package proxy;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-26 17:51
 * @Modified By:
 */
public class RealSubject implements AbstractSubject {
    @Override
    public void doSomething() {
        System.out.println("真实角色被使用");
    }
}
