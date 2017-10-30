package com.rxjava.commonality.singletonPattern;

/**
 * 作者：wanglei on 17/10/23 15:53
 * 邮箱：229846388@qq.com
 * 单例模式
 * 解决的问题:
 * 1.降低对象之间的耦合度
 * 解决方法:
 * 1.实现一个类只有一个实例化对象，并提供一个全局访问点
 */
public class SimpleSinglePattern {
    public static void main(String[] args){
        StoreHouse storeHouse1 = StoreHouse.getInstance();
        StoreHouse storeHouse2 = StoreHouse.getInstance();

        Carrier carrier1 = new Carrier(storeHouse1);
        Carrier carrier2 = new Carrier(storeHouse2);

        System.out.println("两个是不是同一个？");

        if(storeHouse1.equals(storeHouse2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        //搬运工搬完货物之后出来汇报仓库商品数量
        carrier1.moveIn(30);
        System.out.println("仓库商品余量：" + carrier1.mStoreHouse.getQuantity());
        carrier2.MoveOut(50);
        System.out.println("仓库商品余量：" + carrier2.mStoreHouse.getQuantity());
    }
}

/**
 * 结果:
 * 两个是不是同一个？
 * YES
 * 仓库商品余量：130
 * 仓库商品余量：80
 * 优点:
 * 1.提供了对唯一实例的受控访问；
 * 2.由于在系统内存中只存在一个对象，因此可以节约系统资源，对于一些需要频繁创建和销毁的对象单例模式无疑可以提高系统的性能；
 * 3.可以根据实际情况需要，在单例模式的基础上扩展做出双例模式，多例模式；
 * 缺点:
 * 1.单例类的职责过重，里面的代码可能会过于复杂，在一定程度上违背了“单一职责原则”。
 * 2.如果实例化的对象长时间不被利用，会被系统认为是垃圾而被回收，这将导致对象状态的丢失。
 */