package demo1;

import java.util.Date;
//浅拷贝
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        //单纯的重写了clone方法所clone出来的对象时属于浅拷贝
        //浅拷贝：普通类型值拷贝，引用类型地址拷贝
        //所以浅拷贝造成的就是，两个对象用的是同一个值
        Date date = new Date();
        Car car = new Car("TSLA",date);
        System.out.println("car=>"+car);
        //根据原型的car对象clone一份
        Car car2 = (Car)car.clone();
        System.out.println("car2=>"+car2);

        System.out.println("==================");
        date.setTime(1232534563);
        System.out.println("car=>"+car);
        System.out.println("car2=>"+car2);

    }
}
