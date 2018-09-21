package templateMethod.demo01.implementClass;

import templateMethod.demo01.abstractClass.AbstractClass;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-21 16:35
 * @Modified By:
 */
public class ImplementClassA extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类A方法 1 实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类A方法 2 实现");
    }
}
