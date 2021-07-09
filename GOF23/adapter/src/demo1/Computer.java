package demo1;

public class Computer {
    public void net(NetToUsb adapter){
        System.out.println("电脑开始上网");
    }
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Computer computer = new Computer();
        Adapter adapter = new Adapter();
        adapter.handleRequest();
        computer.net(adapter);
    }
}
