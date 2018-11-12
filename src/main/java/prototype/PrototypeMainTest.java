package prototype;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-28 15:17
 * @Modified By:
 */
public class PrototypeMainTest {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i< 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}
