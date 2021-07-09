public class Test {
    public static void main(String[] args) {
        //创建一个computer，指定了它的电脑机型、品牌
        Computer computer = new Desktop(new Apple());
        computer.info();
    }
}
