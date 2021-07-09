package abstractFactory;

public class Client {

    public static void main(String[] args) {
        //只需要从两个产品等级工厂拿就行了
        System.out.println("==========小米工厂==========");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.phone().openMobile();
        xiaomiFactory.router().openWifi();
        System.out.println("==========华为工厂==========");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.phone().openMobile();
        huaweiFactory.router().openWifi();
    }
}
