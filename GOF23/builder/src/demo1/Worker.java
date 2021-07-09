package demo1;
//实体建造者，实现的抽象建造者的方法进行具体的实现
public class Worker extends Builder{

    private Product product;

    public Worker() {
        product = new Product();
    }
    @Override
    public void buidA() {
        product.setA("地基");
        System.out.println("地基");
    }
    @Override
    public void buidB() {
        product.setB("水泥");
        System.out.println("水泥");
    }
    @Override
    public void buidC() {
        product.setC("铺线");
        System.out.println("铺线");
    }
    @Override
    public void buidD() {
        product.setD("粉刷");
        System.out.println("粉刷");
    }
    @Override
    public Product getProduct() {
        return product;
    }
}
