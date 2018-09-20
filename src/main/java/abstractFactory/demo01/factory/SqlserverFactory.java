package abstractFactory.demo01.factory;

import abstractFactory.demo01.product.IDepartment;
import abstractFactory.demo01.product.IUser;
import abstractFactory.demo01.product.SqlserverDepartment;
import abstractFactory.demo01.product.SqlserverUser;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 15:09
 * @Modified By:
 */
public class SqlserverFactory implements IFactory {
    @Override
    public IUser createIUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createIDepartment() {
        return new SqlserverDepartment();
    }
}
