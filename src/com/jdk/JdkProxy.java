package com.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: LiGX
 * @Date: 2019-04-16 上午 10:01
 */
public class JdkProxy implements InvocationHandler {
    private Object object;

    public JdkProxy(Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行");
        Object invoke = method.invoke(object, args);
        System.out.println("结束执行");
        return invoke;
    }

}
