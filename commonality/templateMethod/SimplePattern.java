package com.rxjava.commonality.templateMethod;

/**
 * 作者：wanglei on 17/10/27 09:56
 * 邮箱：229846388@qq.com
 * 模板方法模式
 * 定义:
 * 1.定义一个模板结构，将具体内容延迟到子类去实现。
 * 主要作用:
 * 1.在不改变模板结构的前提下在子类中重新定义模板中的内容。模板方法模式是基于”继承“的；
 * 解决的问题:
 * 1.提高代码复用性将相同部分的代码放在抽象的父类中，而将不同的代码放入不同的子类中
 * 2.实现了反向控制通过一个父类调用其子类的操作，通过对子类的具体实现扩展不同的行为，实现了反向控制 & 符合“开闭原则”
 * 实例讲解:
 * 背景：小成希望学炒菜：手撕包菜 & 蒜蓉炒菜心
 * 冲突：两道菜的炒菜步骤有的重复有的却差异很大，记不住
 * 解决方案：利用代码记录下来
 */
public class SimplePattern {
    public static void main(String[] args) {
        //炒 - 手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
        //炒 - 蒜蓉菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}

/**
 * 结果:
 * 倒油
 * 热油
 * 下锅的蔬菜是包菜
 * 下锅的酱料是辣椒
 * 炒啊炒啊炒到熟啊
 * 倒油
 * 热油
 * 下锅的蔬菜是菜心
 * 下锅的酱料是蒜蓉
 * 炒啊炒啊炒到熟啊
 * 优点:
 * 1.提高代码复用性将相同部分的代码放在抽象的父类中
 * 2.提高了拓展性将不同的代码放入不同的子类中，通过对子类的扩展增加新的行为
 * 3.实现了反向控制通过一个父类调用其子类的操作，通过对子类的扩展增加新的行为，实现了反向控制 & 符合“开闭原则”
 * 缺点:
 * 1.引入了抽象类，每一个不同的实现都需要一个子类来实现，导致类的个数增加，从而增加了系统实现的复杂度。
 * 应用场景:
 * 1.一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现；
 * 2.各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复；
 * 3.控制子类的扩展。
 */