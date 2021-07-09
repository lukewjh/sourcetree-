package demo2;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Car car = new Car("TSLA",date);
        System.out.println("car=>"+car);
        Car car2 = (Car)car.clone();
        System.out.println("car2=>"+car2);
        //深克隆：
        //重写clone方法的基础上，再将对象的属性进行单独的赋值然后再返回
        System.out.println("===================");
        date.setTime(1231244123);
        System.out.println("car=>"+car);
        System.out.println("car2=>"+car2);
    }
}
