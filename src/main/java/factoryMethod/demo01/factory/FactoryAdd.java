package factoryMethod.demo01.factory;

import factoryMethod.demo01.product.Operation;
import factoryMethod.demo01.product.OperationAdd;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-19 22:04
 * @Modified By:
 */
public class FactoryAdd implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
