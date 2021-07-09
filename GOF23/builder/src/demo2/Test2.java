package demo2;

public class Test2 {
    public static void main(String[] args) {
        //直接创建一个工作者
        Worker worker = new Worker();
        Worker worker2 = new Worker();
        Product builderProduct = worker.buildA("汉堡").buildB("汽水儿").buildC("炸鸡").buildD("鸡肉卷").getProduct();
        Product builderProduct2 = worker2.getProduct();
        System.out.println(builderProduct);
        System.out.println(builderProduct2);
    }
}
