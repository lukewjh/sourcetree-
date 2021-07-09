package abstractFactory;

public class XiaomiFactory implements IProductFactory {

    @Override
    public IPhone phone() {
        return new Xiaomiphone();
    }

    @Override
    public IRouter router() {
        return new XiaomiRouter();
    }
}
