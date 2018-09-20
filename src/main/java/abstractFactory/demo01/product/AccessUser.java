package abstractFactory.demo01.product;

import abstractFactory.demo01.model.User;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 15:05
 * @Modified By:
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在 Access 中插入了一条user");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("在 Access 中根据ID获取了一条user");
        return null;
    }
}
