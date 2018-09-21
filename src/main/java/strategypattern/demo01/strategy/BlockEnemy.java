package strategypattern.demo01.strategy;

/**
 * @description:三个实现类（ConcreteStrategy）—— 妙计三：孙夫人断后，挡住追兵
 * @author: jcc
 * @date: 2018-09-21 10:29
 * @Modified By:
 */
public class BlockEnemy implements Strategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
