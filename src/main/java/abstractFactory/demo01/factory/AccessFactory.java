package abstractFactory.demo01.factory;

import abstractFactory.demo01.product.*;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 15:09
 * @Modified By:
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createIUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createIDepartment() {
        return new AccessDepartment();
    }
}
