package abstractFactory.demo01;


import abstractFactory.demo01.factory.AccessFactory;
import abstractFactory.demo01.factory.IFactory;
import abstractFactory.demo01.model.Department;
import abstractFactory.demo01.model.User;
import abstractFactory.demo01.product.IDepartment;
import abstractFactory.demo01.product.IUser;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 11:43
 * @Modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        IFactory factory = new AccessFactory();
        IUser iUser =  factory.createIUser();
        iUser.insert(new User());
        iUser.getUser(0);

        IDepartment iDepartment = factory.createIDepartment();
        iDepartment.insert(new Department());
        iDepartment.getById(0);
    }
}
