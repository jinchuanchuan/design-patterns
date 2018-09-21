package templateMethod.demo01.implementClass;

import templateMethod.demo01.abstractClass.AbstractClass;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-21 16:36
 * @Modified By:
 */
public class ImplementClassB extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类B方法 1 实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类B方法 2 实现");
    }
}
