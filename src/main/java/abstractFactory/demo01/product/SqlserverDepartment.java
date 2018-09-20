package abstractFactory.demo01.product;

import abstractFactory.demo01.model.Department;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 15:19
 * @Modified By:
 */
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 SQL Server 中插入一条Department信息");
    }

    @Override
    public Department getById(Integer depId) {
        System.out.println("在 SQL Server 中根据depId获取一条department信息");
        return null;
    }
}
