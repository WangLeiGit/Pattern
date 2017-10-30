package com.rxjava.commonality.strategyPattern;

/**
 * 作者：wanglei on 17/10/26 16:23
 * 邮箱：229846388@qq.com
 * 策略模式
 * 定义具体策略角色（Concrete Strategy）：每个节日具体的促销活动
 */
public class StrategyC extends Strategy {
    //为春节准备的促销活动C
    @Override
    public void show() {
        System.out.println("为春节准备的促销活动C");
    }
}
