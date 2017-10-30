package com.rxjava.commonality.simpleFactoryModel;

/**
 * 作者：wanglei on 17/10/23 14:13
 * 邮箱：229846388@qq.com
 * 简单工厂模式
 * 工厂
 */
public class Factory {

    /**
     * 制造
     * @return Product
     */
    public static Product Manufacture(String ProductName){
        //工厂类里用switch语句控制生产哪种商品；
        //使用者只需要调用工厂类的静态方法就可以实现产品类的实例化。
        switch (ProductName){
            case "A":
                return new ProductA();

            case "B":
                return new ProductB();

            case "C":
                return new ProductC();

            default:
                return null;
        }
    }

}
