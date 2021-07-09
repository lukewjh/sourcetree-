package abstractFactory;

public class HuaweiFactory implements IProductFactory {

    @Override
    public IPhone phone() {
        return new HuaweiPhone();
    }

    @Override
    public IRouter router() {
        return new HuaweiRouter();
    }
}
