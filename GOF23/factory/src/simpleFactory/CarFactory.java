package simpleFactory;

public interface CarFactory {

    Car getCar(Class<? extends Car> car) throws Exception;

}
