package com.rxjava.commonality.abstractFactoryModel;

/**
 * 作者：wanglei on 17/10/26 09:49
 * 邮箱：229846388@qq.com
 * 抽象工厂模式
 * 抽象产品族类
 */
abstract class Product {
    public abstract void show();
}

/**
 * 容器产品抽象类
 */
abstract class ContainerProduct extends Product {
    @Override
    public void show() {

    }
}

/**
 * 模具产品抽象类
 */
abstract class MouldProduct extends Product{
    @Override
    public void show() {

    }
}

/**
 * 容器产品A类
 */
class ContainerProductA extends ContainerProduct{
    @Override
    public void show() {
        System.out.println("生产出了容器产品A");
    }
}

/**
 * 容器产品B类
 */
class ContainerProductB extends ContainerProduct{
    @Override
    public void show() {
        System.out.println("生产出了容器产品B");
    }
}

/**
 * 模具产品A类
 */
class MouldProductA extends MouldProduct{
    @Override
    public void show() {
        System.out.println("生产出了模具产品A");
    }
}

/**
 * 模具产品B类
 */
class MouldProductB extends MouldProduct{
    @Override
    public void show() {
        System.out.println("生产出了模具产品B");
    }
}