package com.rxjava.commonality.decoratorPattern;

/**
 * 作者：wanglei on 17/10/27 14:57
 * 邮箱：229846388@qq.com
 * 装饰模式（Decorator）
 * 被装饰类
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("method");
    }
}
