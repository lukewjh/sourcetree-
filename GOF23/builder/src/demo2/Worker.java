package demo2;
//实体构建者
public class Worker extends Builder{

    Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    public Builder buildA(String msg) {
        product.setA(msg);
        return this;
    }

    @Override
    public Builder buildB(String msg) {
        product.setB(msg);
        return this;
    }

    @Override
    public Builder buildC(String msg) {
        product.setC(msg);
        return this;
    }

    @Override
    public Builder buildD(String msg) {
        product.setD(msg);
        System.out.println("----------"+"----------");
        return this;
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
