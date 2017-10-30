package com.rxjava.commonality.singletonPattern;

/**
 * 作者：wanglei on 17/10/23 15:49
 * 邮箱：229846388@qq.com
 * 单例模式
 * 搬货工人类
 */
public class Carrier {

    public StoreHouse mStoreHouse;

    public Carrier(StoreHouse storeHouse){
        mStoreHouse = storeHouse;
    }

    /**
     * 搬货进仓库
     * @param i
     */
    public void moveIn(int i){
        mStoreHouse.setQuantity(mStoreHouse.getQuantity() + i);
    }

    /**
     * 搬货出仓库
     * @param i
     */
    public void MoveOut(int i){
        mStoreHouse.setQuantity(mStoreHouse.getQuantity() - i);
    }
}
