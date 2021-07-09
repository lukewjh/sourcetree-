package demo1;
//指挥者
//控制建造者需要建造时候的顺序
public class Director {
    //指挥建造者的建造顺序
    public Product build(Builder builder){
        builder.buidA();
        builder.buidB();
        builder.buidC();
        builder.buidD();
        return builder.getProduct();
    }
}
