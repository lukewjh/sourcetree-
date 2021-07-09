package demo2;
//构建出来的实体
public class Product {
    String A = "汉堡";
    String B = "可乐";
    String C = "薯条";
    String D = "炸鸡";

    public void setA(String a) {
        A = a;
    }

    public void setB(String b) {
        B = b;
    }

    public void setC(String c) {
        C = c;
    }

    public void setD(String d) {
        D = d;
    }

    public String getD() {
        return D;
    }

    @Override
    public String toString() {
        return "Product{" +
                "A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                '}';
    }
}
