package builder.product;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-26 15:34
 * @Modified By:
 */
public class Car {
    public String engine;
    public String tyre;
    public String seat;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", tyre='" + tyre + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
