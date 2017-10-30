package com.rxjava.commonality.bridgePattern;

/**
 * 作者：wanglei on 17/10/27 15:15
 * 邮箱：229846388@qq.com
 * 桥梁模式（Bridge）
 */
public class MyBridge extends Bridge{

    @Override
    public void method(){
        getSourceable().method();
    }
}
