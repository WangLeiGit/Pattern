package com.rxjava.commonality.templateMethod;

/**
 * 作者：wanglei on 17/10/27 10:32
 * 邮箱：229846388@qq.com
 * 模板方法模式
 * 创建具体模板（Concrete Class）,即”手撕包菜“和”蒜蓉炒菜心“的具体步骤
 */
public class ConcreteClass_CaiXin extends AbstractClass {
    @Override
    void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
