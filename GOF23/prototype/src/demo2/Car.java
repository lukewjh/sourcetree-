package demo2;

import java.util.Date;

public class Car implements Cloneable {

    private String name;
    private Date time;

    public Car() {
    }

    public Car(String name, Date time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
    //实现clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //实现深克隆的操作
        Object obj = super.clone();
        Car car = (Car) obj;
        //对这个对象的属性也进行克隆
        car.time = (Date) this.time.clone();

        return obj;
    }
}
