package facade.facade;

import facade.subSystem.ModuleA;
import facade.subSystem.ModuleB;
import facade.subSystem.ModuleC;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-28 18:01
 * @Modified By:
 */
public class Facade {
    //示意方法，满足客户端需要的功能
    public void test(){
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }

}
