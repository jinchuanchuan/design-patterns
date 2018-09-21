package strategypattern.demo01.strategy;

/**
 * @description: 三个实现类（ConcreteStrategy）—— 妙计一：初到吴国
 * @author: jcc
 * @date: 2018-09-21 10:25
 * @Modified By:
 */
public class BackDoor implements Strategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
    }
}
