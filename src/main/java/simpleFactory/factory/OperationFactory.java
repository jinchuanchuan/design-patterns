package simpleFactory.factory;

import simpleFactory.product.*;

/**
 * @description: 简单工厂模式
 * @author: jcc
 * @date: 2018-09-19 21:52
 * @Modified By:
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
