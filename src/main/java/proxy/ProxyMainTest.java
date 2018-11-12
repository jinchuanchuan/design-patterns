package proxy;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-26 17:47
 * @Modified By:
 */
public class ProxyMainTest {
    public static void main(String[] args) {
        ProxySubject proxy = new ProxySubject(new RealSubject());
        proxy.doSomething();
    }
}
