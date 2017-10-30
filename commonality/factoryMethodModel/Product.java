package com.rxjava.commonality.factoryMethodModel;

/**
 * 作者：wanglei on 17/10/23 14:30
 * 邮箱：229846388@qq.com
 * 工厂方法模式
 * 公共接口 产品
 */
abstract class Product {

    public abstract void show();
}

/**
 * 具体产品A类
 */
class ProductA extends Product{

    @Override
    public void show() {
        System.out.println("ProductA");
    }
}

/**
 * 具体产品B类
 */
class ProductB extends Product{

    @Override
    public void show() {
        System.out.println("ProductB");
    }
}