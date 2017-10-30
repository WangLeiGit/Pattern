package com.rxjava.commonality.adapterPattern;

/**
 * 作者：wanglei on 17/10/26 11:55
 * 邮箱：229846388@qq.com
 * 适配器模式:类的适配器模式
 * 创建适配器类（Adapter）适配器Adapter继承自Adaptee，同时又实现了目标(Target)接口。
 */
public class Adapter1 extends Adaptee implements Target{
    /**
     * 目标接口要求调用Request()这个方法名，但源类Adaptee没有方法Request()
     * 因此适配器补充上这个方法名
     * 但实际上Request()只是调用源类Adaptee的SpecificRequest()方法的内容
     * 所以适配器只是将SpecificRequest()方法作了一层封装，封装成Target可以调用的Request()而已
     */
    @Override
    public void Request() {
        this.SpecificRequest();
    }


}
