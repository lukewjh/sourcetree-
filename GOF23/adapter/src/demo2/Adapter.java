package demo2;

public class Adapter implements ToUsb {
    //用组合的方式实现适配器更好,松耦合
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    //实体的适配器
    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
