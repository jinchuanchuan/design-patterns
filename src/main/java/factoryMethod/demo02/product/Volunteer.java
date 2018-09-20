package factoryMethod.demo02.product;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 10:44
 * @Modified By:
 */
public class Volunteer extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("自愿者扫地");
    }

    @Override
    public void wash() {
        System.out.println("自愿者洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("自愿者买米");
    }
}
