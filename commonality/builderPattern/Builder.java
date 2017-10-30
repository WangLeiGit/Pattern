package com.rxjava.commonality.builderPattern;

/**
 * 作者：wanglei on 17/10/23 14:46
 * 邮箱：229846388@qq.com
 * 建造者模式
 * 建造请求 接口 (定义组装的过程（Builder）：组装电脑的过程)
 */
public abstract class Builder {

    /**
     *第一步：装CPU 声明为抽象方法，具体由子类实现
     */
    public abstract void BuildCPU();

    /**
     * 第二步：装主板 声明为抽象方法，具体由子类实现
     */
    public abstract void BuildMainboard();

    /**
     * 第三步：装硬 声明为抽象方法，具体由子类实现
     */
    public abstract void BuildHD();

    /**
     * @return 返回产品的方法：获得组装好的电脑
     */
    public abstract Computer GetComputer();
}
