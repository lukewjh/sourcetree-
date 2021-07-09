package dynamic;

public class User {

    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setHost(host);
        //生成的代理对象是一个接口，所以必须要强转为接口才行
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }
}
