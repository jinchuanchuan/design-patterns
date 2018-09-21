package strategypattern.demo01.context;

import strategypattern.demo01.strategy.Strategy;

/**
 * @description: 环境类
 * @author: jcc
 * @date: 2018-09-21 10:30
 * @Modified By:
 */
public class Context {

    private Strategy strategy;
    //构造函数，要你使用哪个妙计
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
