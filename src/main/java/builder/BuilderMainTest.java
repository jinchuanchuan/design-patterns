package builder;

import builder.concreteBuilder.CarBuilder;
import builder.director.CarDirector;
import builder.product.Car;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-26 15:31
 * @Modified By:
 */
public class BuilderMainTest {
    public static void main(String[] args) {
        CarDirector director = new CarDirector(new CarBuilder());
        Car car = director.constructCar();
        System.out.println(car.toString());
    }
}
