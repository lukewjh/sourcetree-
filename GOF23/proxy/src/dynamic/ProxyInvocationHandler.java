package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Object host;
    public void setHost(Object host) {
        this.host = host;
    }
    //获得代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),host.getClass().getInterfaces(),this);
    }
    //处理代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(host, args);
        log(method.getName());
        return result;
    }

    //增加原本方法的一个方法测试
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
