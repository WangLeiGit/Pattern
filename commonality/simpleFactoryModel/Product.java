package com.rxjava.commonality.simpleFactoryModel;

/**
 * 作者：wanglei on 17/10/23 14:08
 * 邮箱：229846388@qq.com】
 * 简单工厂模式
 * 公共接口 产品
 */
abstract class Product {
    public abstract void show();
}

/**
* 简单工厂模式
* 具体产品类A
*/
class ProductA extends Product{

    @Override
    public void show() {
        System.out.println("ProductA");
    }
}

/**
 * 简单工厂模式
 * 具体产品类B
 */
class ProductB extends Product{

    @Override
    public void show() {
        System.out.println("ProductB");
    }
}

/**
 * 简单工厂模式
 * 具体产品类C
 */
class ProductC extends Product{

    @Override
    public void show() {
        System.out.println("ProductC");
    }
}