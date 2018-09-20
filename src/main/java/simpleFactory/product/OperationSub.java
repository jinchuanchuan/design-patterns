package simpleFactory.product;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-19 21:46
 * @Modified By:
 */
public class OperationSub extends Operation{
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
