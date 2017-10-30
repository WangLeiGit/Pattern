package com.rxjava.commonality.singletonPattern;

/**
 * 作者：wanglei on 17/10/23 15:44
 * 邮箱：229846388@qq.com
 * 单例模式
 * 单例仓库类
 */
public class StoreHouse {

    /**
     * 仓库商品数量
     */
    private int  quantity = 100;

    /**
     * //自己在内部实例化
     */
    private static StoreHouse instance = new StoreHouse();

    /**
     * 封闭构造函数
     */
    private StoreHouse(){

    }

    /**
     * @return 让外部通过调用getInstance()方法来返回唯一的实例。
     */
    public static StoreHouse getInstance(){
        return instance;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
