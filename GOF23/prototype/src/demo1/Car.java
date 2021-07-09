package demo1;

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
    //浅拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
