package simpleFactory;

import simpleFactory.factory.OperationFactory;
import simpleFactory.product.Operation;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-19 21:55
 * @Modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        Operation oper = null;
        oper = OperationFactory.createOperate("+");
        oper.setNumberA(1.2);
        oper.setNumberB(1.3);
        double result = oper.getResult();
        System.out.println(result);
    }
}
