package com.rxjava.commonality.builderPattern;

/**
 * 作者：wanglei on 17/10/23 15:14
 * 邮箱：229846388@qq.com
 * 建造者模式
 * 创建具体的建造者（ConcreteBuilder）:装机人员
 * 具体建造者
 */
public class ConcreteBuilder extends Builder{

    /**
     * 创建产品实例
     */
    Computer computer = new Computer();

    @Override
    public void BuildCPU() {
        computer.Add("CPU");
    }

    @Override
    public void BuildMainboard() {
        computer.Add("Mainboard");
    }

    @Override
    public void BuildHD() {
        computer.Add("HD");
    }

    /**
     * @return 返回组装成功的电脑
     */
    @Override
    public Computer GetComputer() {
        return computer;
    }
}
