package demo1;
//中介
public class Proxy implements Rent {
    private Host host;
    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }
    @Override
    public void rent() {
        //对原有的房东中的rent方法进行增强
        host.rent();
        fare();
    }
    //附加的方法
    public void fare(){
        System.out.println("收中介费");
    }
}
