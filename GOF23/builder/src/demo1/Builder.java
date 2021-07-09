package demo1;
//建造者的抽象方法
//这里声明了一个建造者需要用到哪些的方法
public abstract class Builder {
    public abstract void buidA();
    public abstract void buidB();
    public abstract void buidC();
    public abstract void buidD();
    public abstract Product getProduct();
}
