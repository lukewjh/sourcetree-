package demo2;

public class Computer {
    public void net(ToUsb adapter){
        System.out.println("电脑连接上网");
    }
    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        computer.net(adapter);
    }
}
