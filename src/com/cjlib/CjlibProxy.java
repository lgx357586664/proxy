package com.cjlib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: LiGX
 * @Date: 2019-04-16 上午 10:21
 */
public class CjlibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始监听....");

        Object invokeSuper = methodProxy.invokeSuper(o, objects);

        System.out.println("结束监听....");
        return invokeSuper;
    }
}
