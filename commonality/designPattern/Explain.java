package com.rxjava.commonality.designPattern;

/**
 * 作者：wanglei on 17/10/23 16:53
 * 邮箱：229846388@qq.com
 * Explain 设计模式解析
 */
public class Explain {
    /**
     * 定义:
     * 1.某类特定问题的代码设计解决方案
     * 2.是一套代码设计的经验总结
     * 作用:
     * 1.提高代码复用率，降低开发成本和周期
     * 2.提高代码可维护性、可拓展性
     * 3.使代码更加优雅
     * 4.让代码更容易被他人理解
     * 设计模式的设计原则:
     * 1.单一职责原则:一个类=只有一个引起它变化的原因。
     * 说明:如果一个类承担的职责过多，即耦合性太高=一个职责的变化可能会影响到其他的职责
     * 2.开放封闭原则:一个实体（类、函数、模块等）应该对外扩展开放，对内修改关闭
     * 说明:1.即每次发生变化时，要通过添加新的代码来增强现有类型的行为，而不是修改原有的代码。2.符合开放封闭原则的最好方式是提供一个固有的接口，然后让所有可能发生变化的类实现该接口，让固定的接口与相关对象进行交互。
     * 3.里氏代替原则:子类必须替换掉它们的父类型。
     * 说明:1.在软件开发过程中，子类替换父类后，程序的行为是一样的。2.只有当子类替换掉父类后软件的功能不受影响时，父类才能真正地被复用，而子类也可以在父类的基础上添加新的行为。
     * 4.依赖倒置原则:细节应该依赖于抽象，而抽象不应该依赖于细节。
     * 说明:所谓的的 “面向接口编程，而不是面向实现编程”。这样可以降低客户与具体实现的耦合。
     * 5.接口隔离原则:使用多个专门功能的接口，而不是使用单一的总接口。
     * 说明:不要让一个单一的接口承担过多的职责，而应把每个职责分离到多个专门的接口中，进行接口分离。
     * 6.合成复用原则:在一个新的对象里面使用一些已有的对象，使之成为新对象的一部分。
     * 说明:新对象通过向这些对象的委派达到复用已用功能的目的。简单地说，就是要尽量使用合成/聚合，尽量不要使用继承。
     * 7.最少知识原则（迪米特法则）:一个模块或对象应尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立，这样当一个模块修改时，影响的模块就会越少，扩展起来更加容易。
     * 说明:1.关于迪米特法则的其他描述：只与你直接的朋友们通信；不要跟“陌生人”说话。2.外观模式（Facade Pattern)和中介者模式（Mediator Pattern）就使用了迪米特法则。
     */

    /**
     * 设计模式分类:共3大类-23种设计模式
     *
     * 第一类:创建类:
     *          本质:创建对象的模式:对类的实例化进行抽象
     * 特点:
     *          1.封装了类的具体信息
     *          2.隐藏了类的实例化过程
     * 5种设计模式:
     *          1.单例模式(Singleton)
     *          2.工厂方法模式(Factory Method)
     *          3.抽象工厂模式(Abstract Factory)
     *          4.建造者模式(Builder)
     *          5.原始模式(Prototype)
     *
     * 第二类:结构类:
     *          本质:处理类或对象的组合
     * 俩种类型:
     *          1.类结构型:采用继承机制来组合接口实现
     *          2.对象结构型:组合对象的方式来实现新功能
     * 7种设计模式:
     *          1.适配器模式(Adapter)
     *          2.桥梁模式(Bridge)
     *          3.装饰模式(Decorator)
     *          4.门面模式(Facade)
     *          5.合成模式(Composlte)
     *          6.享元模式(Flyweight)
     *          7.代理模式(Proxy)
     *
     * 第三类:行为类:
     *          本质:对在不同的对象之间划分责任和算法的抽象化
     * 俩种类型:
     *          1.类的行为模式:使用继承方式在几个类之间分配行为
     *          2.对象的行为模式:使用对象聚合的方式来分配行为
     * 11种设计模式:
     *          1.模板方法模式(Template Method)
     *          2.命令模式(Command)
     *          3.迭代器模式(Iterator)
     *          4.观察者模式(Observer)
     *          5.调停者模式(Meditor)
     *          6.状态模式(State)
     *          7.策略模式(Strategy)
     *          8.责任链模式(Chain Of Responsibility)
     *          9.访问者模式(Visitor)
     *          10.备忘录模式(Memento)
     *          11.解释器模式(Interpreter)
     */
}


















