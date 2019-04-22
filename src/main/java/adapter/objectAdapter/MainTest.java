package adapter.objectAdapter;

/**
 * @description:
 * @author: jcc
 * @date: 2018-11-15 21:29
 * @Modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        //现在我们有电灯Lamp，手电筒Touch
        //我们现在需要光线，于是我们点亮电灯
        Target lamp = new Lamp();
        lamp.Light();
        //但是现在电灯坏了，我们需要用手电筒造个灯
        Torch torch = new Torch();
        Target unrealLamp = new Adapter(torch);
        unrealLamp.Light();
    }
}
