package com.rxjava.commonality.facadePattern;

/**
 * 作者：wanglei on 17/10/26 10:57
 * 邮箱：229846388@qq.com
 * 外观类
 */
public class Facade {
    SubSystemA_Light light;
    SubSystemB_Television television;
    SubSystemC_Aircondition aircondition;

    /**
     * 传参
     * @param light
     * @param television
     * @param aircondition
     */
    public Facade(SubSystemA_Light light,SubSystemB_Television television,SubSystemC_Aircondition aircondition){
        this.light = light;
        this.television = television;
        this.aircondition = aircondition;
    }

    /**
     * 起床后一键开电器
     */
    public void on(){
        System.out.println("get up ......");
        light.on();
        television.on();
        aircondition.on();
    }

    /**
     * 睡觉时一键关电器
     */
    public void off(){
        System.out.println("sleep ......");
        light.off();
        television.off();
        aircondition.off();
    }
}
