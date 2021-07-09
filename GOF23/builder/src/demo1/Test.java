package demo1;

public class Test {

    public static void main(String[] args) {
        //创建Director();
        Director director = new Director();
        Product buildProduct = director.build(new Worker());
        System.out.println(buildProduct);
    }
}
