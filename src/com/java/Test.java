package com.java;

/**
 * @author: LiGX
 * @Date: 2019-04-16 上午 9:56
 */
public class Test {
    //手动代理（静态代理）
    public static void main(String[] args){
        ZhangSan zhangSan=new ZhangSan();
        Proxy proxy=new Proxy();
        proxy.setZhangSan(zhangSan);
        proxy.mai();
    }
}
