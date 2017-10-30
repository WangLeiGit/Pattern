package com.rxjava.commonality.adapterPattern;

/**
 * 作者：wanglei on 17/10/26 15:31
 * 邮箱：229846388@qq.com
 * 适配器模式:对象的适配器模式
 * Adapter与Adaptee是委派关系，这决定了适配器模式是对象的。
 */
public class Adapter2 implements Target{

    /**
     * 直接关联被适配类
     */
    private Adaptee adaptee;

    /**
     * 可以通过构造函数传入具体需要适配的被适配类对象
     * @param adaptee
     */
    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void Request() {
        // 这里是使用委托的方式完成特殊功能
        this.adaptee.SpecificRequest();
    }
}
