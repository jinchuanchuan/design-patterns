package factoryMethod.demo01.factory;

import factoryMethod.demo01.product.Operation;

/**
 * @description: 工厂方法模式——计算器demo
 * @author: jcc
 * @date: 2018-09-19 22:03
 * @Modified By:
 */
public interface IFactory {
    Operation createOperation();
}
