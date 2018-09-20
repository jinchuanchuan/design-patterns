package abstractFactory.demo02.product;

import abstractFactory.demo02.model.Department;

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
