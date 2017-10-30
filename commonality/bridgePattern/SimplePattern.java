package com.rxjava.commonality.bridgePattern;

/**
 * 作者：wanglei on 17/10/27 15:07
 * 邮箱：229846388@qq.com
 * 桥梁模式（Bridge）
 * 定义:
 * 1.桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化.
 * 2.桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化.
 */
public class SimplePattern {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        Sourceable sub1 = new SourceSub1();
        bridge.setSourceable(sub1);
        bridge.method();

        Sourceable sub2 = new SourceSub2();
        bridge.setSourceable(sub2);
        bridge.method();
    }
}

/**
 * 结果:
 * SourceSub1!
 * SourceSub2!
 * 结论:通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用。
 */