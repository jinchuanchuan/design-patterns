package factoryMethod.demo02.product;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 10:44
 * @Modified By:
 */
public class Undergraduate extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("大学生扫地");
    }

    @Override
    public void wash() {
        System.out.println("大学生洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("大学生买米");
    }
}
