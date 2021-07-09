public abstract class Computer {
    //组合上品牌属性
    protected Brand brand;
    public Computer(Brand brand) {
        this.brand = brand;
    }
    abstract void info();
}
//台式机机型
class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
        brand.info();
    }
    @Override
    void info() {
        System.out.println("台式机");
    }
}
//笔记本机型
class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
        brand.info();
    }
    @Override
    void info() {
        System.out.println("笔记本");
    }
}
