package com.rxjava.commonality.bridgePattern;

/**
 * 作者：wanglei on 17/10/27 15:10
 * 邮箱：229846388@qq.com
 * 桥梁模式（Bridge）
 * 实现类
 */
public class SourceSub1 implements Sourceable{
    @Override
    public void method() {
        System.out.println("SourceSub1!");
    }
}
