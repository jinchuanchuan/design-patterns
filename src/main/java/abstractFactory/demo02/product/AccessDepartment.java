package abstractFactory.demo02.product;

import abstractFactory.demo02.model.Department;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 15:19
 * @Modified By:
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中插入一条Department信息");
    }

    @Override
    public Department getById(Integer depId) {
        System.out.println("在 Access 中根据depId获取一条department信息");
        return null;
    }
}
