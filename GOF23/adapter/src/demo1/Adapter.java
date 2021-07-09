package demo1;

public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void handleRequest() {
        //调用父类的request方法，也就是网线类
        System.out.println("适配器已经安装好，可以直接上网");
        super.request();
    }
}
