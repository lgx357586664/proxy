package com.cjlib;

import com.jdk.Car;
import com.jdk.XiaoMing;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author: LiGX
 * @Date: 2019-04-16 上午 10:23
 */
public class CjlibTest {
    public static void main(String[] args){
        CjlibProxy cjlibProxy=new CjlibProxy();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(XiaoMing.class);
        enhancer.setCallback(cjlibProxy);
        Car car = (Car)enhancer.create();
        car.mai();
    }
}
