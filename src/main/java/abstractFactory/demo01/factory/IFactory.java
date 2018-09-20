package abstractFactory.demo01.factory;

import abstractFactory.demo01.product.IDepartment;
import abstractFactory.demo01.product.IUser;

/**
 * @description: 抽象工厂模式
 * @author: jcc
 * @date: 2018-09-20 15:08
 * @Modified By:
 */
public interface IFactory {
    IUser createIUser();

    IDepartment createIDepartment();
}
