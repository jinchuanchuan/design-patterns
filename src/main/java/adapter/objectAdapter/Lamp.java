package adapter.objectAdapter;

/**
 * @description:
 * @author: jcc
 * @date: 2018-11-15 21:28
 * @Modified By:
 */
public class Lamp implements Target{
    private String light = "电灯的光线";

    @Override
    public void Light() {
        System.out.println(light);
    }

    public void setLight(String light) {
        this.light = light;
    }
}
