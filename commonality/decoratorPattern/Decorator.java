package com.rxjava.commonality.decoratorPattern;

/**
 * 作者：wanglei on 17/10/27 14:58
 * 邮箱：229846388@qq.com
 * 装饰模式（Decorator）
 * 装饰类 为Source类动态的添加一些功能
 */
public class Decorator implements Sourceable{

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable){
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
