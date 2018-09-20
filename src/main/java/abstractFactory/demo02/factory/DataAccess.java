package abstractFactory.demo02.factory;

import abstractFactory.demo02.product.IDepartment;
import abstractFactory.demo02.product.IUser;

/**
 * @description: 利用反射机制创建对象,改造抽象工厂
 * @author: jcc
 * @date: 2018-09-20 15:40
 * @Modified By:
 */
public class DataAccess {
    public static String classNameIUser = "abstractFactory.demo02.product.AccessUser";
    public static String classNameIDepartment = "abstractFactory.demo02.product.SqlserverDepartment";
    public static IUser createIUser() {
        IUser iUser = null;
        try {
            iUser = (IUser)Class.forName(classNameIUser).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return iUser;
    }

    public static IDepartment createIDepartment() {
        IDepartment iDepartment = null;
        try {
            iDepartment = (IDepartment)Class.forName(classNameIDepartment).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return iDepartment;
    }
}
