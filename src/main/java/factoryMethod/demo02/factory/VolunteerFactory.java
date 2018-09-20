package factoryMethod.demo02.factory;

import factoryMethod.demo02.product.LeiFeng;
import factoryMethod.demo02.product.Undergraduate;
import factoryMethod.demo02.product.Volunteer;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-20 10:47
 * @Modified By:
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
