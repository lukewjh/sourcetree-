package methodFactory;

public class BuyCar {
    public static void main(String[] args) {
        Car wuling = new WuLingFactory().getCarFactory();
        Car tsla = new TSLAFactory().getCarFactory();
        wuling.carName();
        tsla.carName();
    }
}
