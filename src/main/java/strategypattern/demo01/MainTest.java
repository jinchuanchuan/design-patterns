package strategypattern.demo01;

import strategypattern.demo01.context.Context;
import strategypattern.demo01.strategy.BackDoor;
import strategypattern.demo01.strategy.BlockEnemy;
import strategypattern.demo01.strategy.GivenGreenLight;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-21 10:21
 * @Modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        Context context;

        System.out.println("----------刚到吴国使用第一个锦囊---------------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n");

        System.out.println("----------刘备乐不思蜀使用第二个锦囊---------------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        System.out.println("----------孙权的追兵来了，使用第三个锦囊---------------");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n");
    }
}
