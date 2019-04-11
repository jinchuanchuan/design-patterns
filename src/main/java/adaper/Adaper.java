package adaper;

/**
 *  适配器（Adapter）
 */
public class Adaper implements Target{
    private  Adapee adapee;

    public Adaper(Adapee adapee) {
        this.adapee = adapee;
    }

    @Override
    public void specificRequest() {
        this.adapee.specificRequest();
    }
}
