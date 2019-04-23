package com.jdk;

import java.lang.reflect.Proxy;

/**
 * @author: LiGX
 * @Date: 2019-04-16 上午 10:01
 */
public class JdkProxyTest {
    public static void main(String[] args){
        XiaoMing xiaoMing=new XiaoMing();
        JdkProxy jdkProxy=new JdkProxy(xiaoMing);
        Car car = (Car)Proxy.newProxyInstance(xiaoMing.getClass().getClassLoader(),
                xiaoMing.getClass().getInterfaces(), jdkProxy);
        car.mai();
    }
}
