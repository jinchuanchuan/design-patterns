package simpleFactory.product;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-19 21:46
 * @Modified By:
 */
public class OperationDiv extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        if(getNumberB() == 0) {
            try {
                throw new Exception("除数不能为零！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        result = getNumberA() / getNumberB();
        return result;
    }
}
