package simpleFactory;

/**
 * 简单工厂模式：
 *  不在自己创建对象，将创建对象的事交给工厂
 */
public class BuyCar {

    public static void main(String[] args) throws  Exception {
        CarFactory carFactory = new Factory();

        Car wuling = carFactory.getCar(WuLing.class);
        Car tSLA = carFactory.getCar(TSLA.class);
        wuling.carName();
        tSLA.carName();
    }
}
