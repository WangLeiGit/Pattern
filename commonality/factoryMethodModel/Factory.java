package com.rxjava.commonality.factoryMethodModel;

/**
 * 作者：wanglei on 17/10/23 14:29
 * 邮箱：229846388@qq.com
 * 工厂方法模式
 * 工厂
 */
abstract class Factory {

    public abstract Product Manufacture();
}

/**
 * 工厂A类 - 生产A类产品
 */
class FactoryA extends Factory{

    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}

/**
 * 工厂B类 - 生产B类产品
 */
class FactoryB extends Factory{

    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}