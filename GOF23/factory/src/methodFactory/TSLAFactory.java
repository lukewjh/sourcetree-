package methodFactory;

public class TSLAFactory implements CarFactory {
    @Override
    public Car getCarFactory() {
        return new TSLA();
    }
}
