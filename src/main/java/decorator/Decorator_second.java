package decorator;

/**
 * 定义第三个装饰类
 * 这是第一个，第二个第三个功能依次细化，即装饰者的功能越来越多
 */
public class Decorator_second extends Decorator {

    public Decorator_second(Human human) {
        super(human);
    }

    public void findClothes() {
        System.out.println("找到一件D&G。。");
    }

    public void findTheTarget() {
        System.out.println("在Map上找到神秘花园和城堡。。");
    }

    @Override
    public void wearClothes() {
        // TODO Auto-generated method stub
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        // TODO Auto-generated method stub
        super.walkToWhere();
        findTheTarget();
    }
    
}
