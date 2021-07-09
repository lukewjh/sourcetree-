
//懒汉式

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 *  1.多线程的问题：没加同步锁的懒汉式，在多线程的环境下，单例模式被破坏 使用双重锁
 *  2.new LazyMan()不是一个原子性操作，它分为一下步骤：
 *      1、分配内存空间
 *      2、执行构造方法，初始化对象
 *      3、把这个对象指向这个空间
 *      问题： 顺序：123正确，可是CPU可能会对这个不是原子性的操作进行重新排序，
 *              可能会：顺序：132这样子的话变量可能为null，这样也破坏了二重锁DCL懒汉式单例模式
 *      如果这个对象没有加 volatile(不会将该变量上的操作与其他内存操作一起重排序)
 *      所以：对象上加上volatile修改词
 *  3.最后：反射还是可以破坏
 *
 */
public class LazyMan {

    private static boolean jh = false;

    private LazyMan(){
        synchronized (LazyMan.class){
            if (jh == false){
                jh = true;
            }else{
                throw new RuntimeException("不要用反射破坏");
            }
        }
        System.out.println(Thread.currentThread().getName() + "ok!");
    }

    private volatile static LazyMan lazyMan;

    public static LazyMan getInstance(){
        if (lazyMan == null){    //双重检测锁模式  DCL懒汉式单例
            synchronized(LazyMan.class){
                if (lazyMan == null){
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) throws Exception {
        //LazyMan instance = LazyMan.getInstance();
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        Field jh = LazyMan.class.getDeclaredField("jh");
        jh.setAccessible(true);

        declaredConstructor.setAccessible(true);
        LazyMan lazyMan = declaredConstructor.newInstance();

        jh.set(lazyMan,false);

        LazyMan lazyMan2 = declaredConstructor.newInstance();
        System.out.println(lazyMan2);
        System.out.println(lazyMan);
        //获取field，改变field

//        for (int i = 0; i < 10; i++) {
//            new Thread(() ->{
//                LazyMan instance = LazyMan.getInstance();
//
//            }).start();
//        }
    }

}
