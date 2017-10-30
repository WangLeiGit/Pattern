package com.rxjava.commonality.proxyPattern;

/**
 * 作者：wanglei on 17/10/26 11:18
 * 邮箱：229846388@qq.com
 * 代理模式
 * 创建抽象对象接口（Subject）：声明你（真实对象）需要让代购（代理对象）帮忙做的事（买Mac）
 */
public interface Subject {

    public void buyMac();
}
