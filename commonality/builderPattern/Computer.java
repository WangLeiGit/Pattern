package com.rxjava.commonality.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：wanglei on 17/10/23 15:07
 * 邮箱：229846388@qq.com
 * 建造者模式
 * 定义具体产品类（Product）：电脑
 */
public class Computer {

    /**
     * 电脑组件的集合
     */
    private List<String> parts = new ArrayList<String>();

    /**
     * 用于将组件组装到电脑里
     */
    public void Add(String part){
        parts.add(part);
    }

    public void show(){
        for(String args : parts){
            System.out.println(args+" OK");
        }
        System.out.println("电脑组装完成，请验收");
    }

}
