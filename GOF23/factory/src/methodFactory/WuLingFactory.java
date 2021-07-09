package methodFactory;

public class WuLingFactory implements CarFactory {
    @Override
    public Car getCarFactory() {
        return new WuLing();
    }
}
