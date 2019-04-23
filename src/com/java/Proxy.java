package com.java;

/**
 * @author: LiGX
 * @Date: 2019-04-16 上午 9:56
 */
public class Proxy implements Car{
    private ZhangSan zhangSan;

    public void setZhangSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void mai() {
        System.out.println("准备买车");
        zhangSan.mai();
        System.out.println("已经买好车了");
    }
}
