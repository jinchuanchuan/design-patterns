package facade;

import facade.facade.Facade;

/**
 * @description: 外观模式
 * @author: jcc
 * @date: 2018-09-28 18:00
 * @Modified By:
 */
public class FacadeMainTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
