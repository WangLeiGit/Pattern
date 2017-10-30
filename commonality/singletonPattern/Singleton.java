package com.rxjava.commonality.singletonPattern;

/**
 * 作者：wanglei on 17/10/23 15:41
 * 邮箱：229846388@qq.com
 * 单例模式
 * Singleton.单例模式的一般实现
 * 分类说明:
 * 1.饿汉式:类加载时 自动初始化 单例
 * 2.懒汉式:有需要的时候才手动调用 getInstance()初始化单例
 * 区别:
 * 1.懒汉式与饿汉式最大的区别是单例的初始化操作的时机：
 * 多线程下的单例模式实现:
 * 1.对于 饿汉式：多线程下适用，因为JVM只会加载一次单例类；
 * 2.对于 懒汉式：多线程不适用，因为在创建单例时是线程不安全的。
 * 3.即，多个线程可能会并发调用 newInstance （），从而重复创建单例对象
 */
public class Singleton {


}

/**
 * 饿汉式
 * 应用场景:
 * 1.应用启动时，需自动加载 & 初始化单例
 * 2.单例对象要求初始化速度非常快且占用内存非常小
 */
class HungryManSingleton{
    /**
     * 创建私有变量 instance（用以记录 Singleton 的唯一实例）
     * 内部进行实例化
     */
    private static HungryManSingleton instance = new HungryManSingleton();
    /**
     * 把类的构造方法私有化，不让外部调用构造方法实例化
     */
    private HungryManSingleton(){

    }
    /**
     * 定义公有方法提供该类的全局唯一访问点
     * @return  外部通过调用getInstance()方法来返回唯一的实例
     */
    public static HungryManSingleton getInstance(){
        return instance;
    }
}

/**
 * 懒汉式
 * 应用场景:
 * 1.单例初始化的操作耗时长 & 应用要求启动速度快
 * 2.单例的占用内存比较大
 * 3.单例只是在某个特定场景的情况下才会被使用，即按需延迟加载单例
 */
class LazyManSingleton{
    /**
     * 先赋值为Null，需要时才手动调用 getInstance（） 创建
     */
    private static LazyManSingleton instance = null;

    private LazyManSingleton(){

    }

    /**
     * 先判断单例是否为空，以避免重复创建
     * @return 外部通过调用getInstance()方法来返回唯一的实例
     */
    public static LazyManSingleton getInstance(){
        if(instance == null){
            instance = new LazyManSingleton();
        }
        return instance;
    }
}

/**
 * 多线程下的单例模式实现:
 * 懒汉式
 * 1.下面，将对懒汉式 进行优化，使得适合在多线程环境下运行
 * 解决方案1：
 * 1.同步锁
 * 2.使用同步锁 synchronized (Singleton.class) ，防止多线程同时进入，从而造成instance被多次实例化
 * 缺点:
 * 1.该解决方案的缺点在于：加锁 = 非常耗时操作，耗时耗能
 */
class MultithreadingLazyManSingleton1{
    private static MultithreadingLazyManSingleton1 instance = null;
    private MultithreadingLazyManSingleton1(){}
    public static MultithreadingLazyManSingleton1 getInstance(){
        /**
         * 加入同步锁
         */
        synchronized (MultithreadingLazyManSingleton1.class){
            if(instance == null){
                instance = new MultithreadingLazyManSingleton1();
            }
        }
        return instance;
    }
}

/**
 * 多线程下的单例模式实现:
 * 懒汉式
 * 1.下面，将对懒汉式 进行优化，使得适合在多线程环境下运行
 * 解决方案2：
 * 1.双重校验锁
 * 2.在同步锁的基础上，添加1层 if判断：若Instance已实例化，则不必执行加锁操作就可以获取实例，从而提高性能
 * 缺点:
 * 1.实现复杂 = 多种判断，易出错
 */
class MultithreadingLazyManSingleton2{
    private static MultithreadingLazyManSingleton2 intance = null;
    private MultithreadingLazyManSingleton2(){}
    public static MultithreadingLazyManSingleton2 getIntance(){
        /**
         * 在同步锁的基础上，添加1层if判断 若单例已创建，则直接跳到执行 return ourInstance
         */
        if(intance == null){
            synchronized (MultithreadingLazyManSingleton2.class){
                if(intance == null){
                    intance = new MultithreadingLazyManSingleton2();
                }
            }
        }
        return intance;
    }
}

/**
 * 多线程下的单例模式实现:
 * 懒汉式
 * 1.下面，将对懒汉式 进行优化，使得适合在多线程环境下运行
 * 解决方案3：
 * 1.静态内部类
 * 2.在内部类里面去创建对象实例
 */
class MultithreadingLazyManSingleton3{
    /**
     * 在内部类里面去创建对象实例对象；在装载该内部类时才会去创建单例
     * 线程安全：类是由JVM加载的，而JVM只会加载一遍，保证只有1个单例模式，保证了数据同步
     */
    private static class Singleton{
        private static Singleton instance = new Singleton();

        /**
         * 私有构造函数
         */
        private Singleton(){}

        /**
         * @return 延迟加载、按需创建：外部调用类getInstance() ->调用Singleton.instance -> 创建实例
         */
        public static Singleton getInstance(){
            return Singleton.instance;
        }

    }

}

/**
 * 多线程下的单例模式实现:
 * 懒汉式
 * 1.下面，将对懒汉式 进行优化，使得适合在多线程环境下运行
 * 解决方案4：
 * 1.枚举类型
 * 2.最简洁、易用的单例实现方式，（《Effective Java》推荐）
 * 使用方式:
 * MultithreadingLazyManSingleton4 singleton = MultithreadingLazyManSingleton4.instance;
 * singleton.doSomething();
 */
enum MultithreadingLazyManSingleton4{

    /**
     *  定义一个枚举的元素，它就是MultithreadingLazyManSingleton4的一个实例instance;
     */
    instance;

    public void doSomething(){
    }
}