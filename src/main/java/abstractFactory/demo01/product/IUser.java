package abstractFactory.demo01.product;

import abstractFactory.demo01.model.User;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 15:03
 * @Modified By:
 */
public interface IUser {
    void insert(User user);
    User getUser(Integer id);
}
