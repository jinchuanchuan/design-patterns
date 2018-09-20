package factoryMethod.demo01.product;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-19 21:40
 * @Modified By:
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();

}
