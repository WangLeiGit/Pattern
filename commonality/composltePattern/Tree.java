package com.rxjava.commonality.composltePattern;

/**
 * 作者：wanglei on 17/10/27 15:28
 * 邮箱：229846388@qq.com
 * 合成模式(Composlte)
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }


}
