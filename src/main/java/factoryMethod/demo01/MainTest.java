package factoryMethod.demo01;

import factoryMethod.demo01.factory.FactoryMul;
import factoryMethod.demo01.factory.IFactory;
import factoryMethod.demo01.product.Operation;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-19 21:55
 * @Modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        IFactory factory = new FactoryMul();
        Operation oper = null;
        oper = factory.createOperation();
        oper.setNumberA(1.2);
        oper.setNumberB(1.3);
        double result = oper.getResult();
        System.out.println(result);
    }
}
