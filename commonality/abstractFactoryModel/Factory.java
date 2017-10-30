package com.rxjava.commonality.abstractFactoryModel;

/**
 * 作者：wanglei on 17/10/26 09:45
 * 邮箱：229846388@qq.com
 * 抽象工厂模式
 * 工厂类
 */
abstract class Factory {
    /**
     * @return 制造容器
     */
    public abstract Product ManufactureContainer();

    /**
     * @return 制造模具
     */
    public abstract Product ManufactureMould();
}

/**
 * A厂 - 生产模具+容器产品
 */
class FactoryA extends Factory{

    @Override
    public Product ManufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public Product ManufactureMould() {
        return new MouldProductA();
    }
}

/**
 *B厂 - 生产模具+容器产品
 */
class FactoryB extends Factory{

    @Override
    public Product ManufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public Product ManufactureMould() {
        return new MouldProductB();
    }
}