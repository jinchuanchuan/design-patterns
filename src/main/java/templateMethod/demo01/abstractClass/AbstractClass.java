package templateMethod.demo01.abstractClass;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-21 16:33
 * @Modified By:
 */
public abstract class AbstractClass {
    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    public void TemplateMethod() {
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("\n");
    }
}
