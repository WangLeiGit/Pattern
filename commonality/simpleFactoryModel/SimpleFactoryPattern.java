package com.rxjava.commonality.simpleFactoryModel;

/**
 * 作者：wanglei on 17/10/23 14:17
 * 邮箱：229846388@qq.com
 * 简单工厂模式 Simple
 * 含意:
 * 1.简单工厂模式又叫静态方法模式（因为工厂类定义了一个静态方法）
 * 2.现实生活中，工厂是负责生产产品的；同样在设计模式中，简单工厂模式我们可以理解为负责生产对象的一个类，称为“工厂类”。
 * 解决的问题:
 * 1.将“类实例化的操作”与“使用对象的操作”分开，让使用者不用知道具体参数就可以实例化出所需要的“产品”类，从而避免了在客户端代码中显式指定，实现了解耦。
 * 2.即使用者可直接消费产品而不需要知道其生产的细节
 */
public class SimpleFactoryPattern {

    public static void main(String[] args){

        try {
            //调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            Factory.Manufacture("A").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        try {
            //调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            Factory.Manufacture("B").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        try {
            //调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            Factory.Manufacture("C").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        try {
            //调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            Factory.Manufacture("D").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

    }

}

/**
 * 步骤:
 * 1.创建抽象产品类 & 定义具体产品的公共接口；
 * 2.创建具体产品类（继承抽象产品类） & 定义生产的具体产品；
 * 3.创建工厂类，通过创建静态方法根据传入不同参数从而创建不同具体产品类的实例；
 * 4.外界通过调用工厂类的静态方法，传入不同参数从而创建不同具体产品类的实例
 * 结果:
 * ProductA
 * ProductB
 * ProductC
 * 没有这一类产品
 * 优点:
 * 1.将创建实例的工作与使用实例的工作分开，使用者不必关心类对象如何创建，实现了解耦；
 * 2.把初始化实例时的工作放到工厂里进行，使代码更容易维护。 更符合面向对象的原则 & 面向接口编程，而不是面向实现编程。
 * 缺点:
 * 1.工厂类集中了所有实例（产品）的创建逻辑，一旦这个工厂不能正常工作，整个系统都会受到影响；
 * 2.违背“开放 - 关闭原则”，一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑过于复杂。
 * 3.简单工厂模式由于使用了静态工厂方法，静态方法不能被继承和重写，会造成工厂角色无法形成基于继承的等级结构。
 * 应用场景:
 * 1.客户如果只知道传入工厂类的参数，对于如何创建对象的逻辑不关心时；
 * 2.当工厂类负责创建的对象（具体产品）比较少时。
 */

