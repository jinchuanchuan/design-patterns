package adapter.objectAdapter;

/**
 * @description:
 * @author: jcc
 * @date: 2018-11-15 21:28
 * @Modified By:
 */
public class Adapter implements Target{
    Torch torch;

    public Adapter(Torch torch) {
        this.torch = torch;
    }

    @Override
    public void Light() {
        torch.light();
    }
}
