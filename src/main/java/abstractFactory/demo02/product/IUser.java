package abstractFactory.demo02.product;

import abstractFactory.demo02.model.User;

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
