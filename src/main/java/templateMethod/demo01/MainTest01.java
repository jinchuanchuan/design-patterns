package templateMethod.demo01;

import templateMethod.demo01.abstractClass.AbstractClass;
import templateMethod.demo01.implementClass.ImplementClassA;
import templateMethod.demo01.implementClass.ImplementClassB;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-21 16:30
 * @Modified By:
 */
public class MainTest01 {
    public static void main(String[] args) {
        AbstractClass abstractClass ;

        abstractClass = new ImplementClassA();
        abstractClass.TemplateMethod();

        abstractClass = new ImplementClassB();
        abstractClass.TemplateMethod();

    }
}
