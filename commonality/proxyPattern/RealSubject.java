package com.rxjava.commonality.proxyPattern;

/**
 * 作者：wanglei on 17/10/26 11:19
 * 邮箱：229846388@qq.com
 * 代理模式
 * 创建真实对象类（RealSubject）,即”我“
 */
public class RealSubject implements Subject{
    @Override
    public void buyMac() {
        System.out.println("buy Mac ......");
    }
}
