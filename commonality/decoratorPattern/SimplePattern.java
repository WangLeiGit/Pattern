package com.rxjava.commonality.decoratorPattern;

/**
 * 作者：wanglei on 17/10/27 14:53
 * 邮箱：229846388@qq.com
 * 装饰模式（Decorator）
 * 定义:
 * 1.装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例，
 */
public class SimplePattern {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable newSourceable = new Decorator(sourceable);
        newSourceable.method();
    }
}

/**
 * 结果:
 * before decorator!
 * method
 * after decorator!
 * 应用场景:
 * 1.需要扩展一个类的功能。
 * 2.动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * 缺点:
 * 1.产生过多相似的对象，不易排错！
 */