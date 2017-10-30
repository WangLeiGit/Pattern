package com.rxjava.commonality.builderPattern;

/**
 * 作者：wanglei on 17/10/23 15:12
 * 邮箱：229846388@qq.com
 * 建造者模式
 * 电脑城老板委派任务给装机人员（Director）
 * 导演
 */
public class Director {

    /**
     * @param builder 指挥装机人员组装电脑
     */
    public void Construct(Builder builder){
        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
    }
}
