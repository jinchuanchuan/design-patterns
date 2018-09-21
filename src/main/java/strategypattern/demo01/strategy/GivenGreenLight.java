package strategypattern.demo01.strategy;

/**
 * @description: 三个实现类（ConcreteStrategy）—— 妙计二：求吴国太开绿灯放行
 * @author: jcc
 * @date: 2018-09-21 10:28
 * @Modified By:
 */
public class GivenGreenLight implements Strategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
