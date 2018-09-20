package abstractFactory.demo02;


import abstractFactory.demo02.factory.DataAccess;
import abstractFactory.demo02.product.IDepartment;
import abstractFactory.demo02.product.IUser;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 11:43
 * @Modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        IUser iUser = DataAccess.createIUser();
        iUser.getUser(0);
        iUser.insert(null);

        IDepartment iDepartment = DataAccess.createIDepartment();
        iDepartment.getById(0);
        iDepartment.insert(null);
    }
}
