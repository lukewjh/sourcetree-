
//饿汉式单例
/**
 * 饿汉式存在的问题：
 *  一上来就new出这个对象
 *  随着对象的创建，以下的数组也会被创建，这就会造成资源的浪费
 */
public class HungryMan {
    //随着对象的创建，以下的数组也会被创建，这就会造成资源的浪费
    private byte[] data1 = new byte[1024*1024];
    private byte[] data2 = new byte[1024*1024];
    private byte[] data3 = new byte[1024*1024];

    private HungryMan(){

    }
    private final static HungryMan HUNGRY_MAN = new HungryMan();

    public static HungryMan getInstance(){
        return HUNGRY_MAN;
    }

}
