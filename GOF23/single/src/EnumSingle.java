
//枚举不会被破坏单例

import java.lang.reflect.Constructor;

public enum EnumSingle {

    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }

}
class Test{
    public static void main(String[] args) throws Exception {
        //试图用反射破坏枚举中的单例
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle enumSingle = declaredConstructor.newInstance();
        System.out.println(enumSingle);    //newInstance底层判断是否用的是枚举，如果是则抛出异常
        //异常：Cannot reflectively create enum objects
    }
}
