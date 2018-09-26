package builder.concreteBuilder;

import builder.builder.Builder;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-26 15:33
 * @Modified By:
 */
public class CarBuilder implements Builder {
    @Override
    public String buildEngine() {
        return "发动机";
    }

    @Override
    public String buildTyre() {
        return "轮胎";
    }

    @Override
    public String buildSeat() {
        return "座垫";
    }
}
