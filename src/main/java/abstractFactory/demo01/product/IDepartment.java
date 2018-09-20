package abstractFactory.demo01.product;

import abstractFactory.demo01.model.Department;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 15:18
 * @Modified By:
 */
public interface IDepartment {
    void insert(Department department);
    Department getById(Integer depId);
}
