package simpleFactory;
//简单工厂
public class Factory implements CarFactory {

    @Override
    public  Car getCar(Class<? extends Car> car) throws Exception {
        Car newCar = car.newInstance();
        return newCar;
    }
}
