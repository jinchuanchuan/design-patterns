package builder.director;

import builder.builder.Builder;
import builder.product.Car;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-26 15:36
 * @Modified By:
 */
public class CarDirector {
    Builder builder;
    public CarDirector(Builder builder) {
        this.builder = builder;
    }

    public Car constructCar() {
        Car car = new Car();
        car.setEngine(builder.buildEngine());
        car.setTyre(builder.buildTyre());
        car.setSeat(builder.buildSeat());
        return car;
    }
}
