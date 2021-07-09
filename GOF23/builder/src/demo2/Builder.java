package demo2;
//抽象的建造者：提供一系列方法
public abstract class Builder {
    public abstract Builder buildA(String msg);
    public abstract Builder buildB(String msg);
    public abstract Builder buildC(String msg);
    public abstract Builder buildD(String msg);
    public abstract Product getProduct();
}
