package factoryMethod.demo02.factory;

import factoryMethod.demo02.product.LeiFeng;

/**
 * @description: 工厂方法模式——《大话设计模式》之雷锋demo
 * @author: jcc
 * @date: 2018-09-20 10:46
 * @Modified By:
 */
public interface IFactory {
    LeiFeng createLeiFeng();
}
