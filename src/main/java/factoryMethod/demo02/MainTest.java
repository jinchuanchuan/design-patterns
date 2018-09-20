package factoryMethod.demo02;

import factoryMethod.demo02.factory.IFactory;
import factoryMethod.demo02.factory.VolunteerFactory;
import factoryMethod.demo02.product.LeiFeng;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 10:21
 * @Modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        IFactory factory = new VolunteerFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }
}
