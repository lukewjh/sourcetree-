package abstractFactory;

public class HuaweiRouter implements IRouter {
    @Override
    public void openWifi() {
        System.out.println("打开华为WiFi");
    }
}
