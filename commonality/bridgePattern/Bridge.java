package com.rxjava.commonality.bridgePattern;

/**
 * 作者：wanglei on 17/10/27 15:12
 * 邮箱：229846388@qq.com
 * 桥梁模式（Bridge）
 * 定义一个桥，持有Sourceable的一个实例：
 */
public abstract class Bridge {
    private Sourceable sourceable;

    public void method(){
        sourceable.method();
    }

    public Sourceable getSourceable(){
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable){
        this.sourceable = sourceable;
    }

}
