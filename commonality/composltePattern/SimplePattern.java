package com.rxjava.commonality.composltePattern;

/**
 * 作者：wanglei on 17/10/27 15:25
 * 邮箱：229846388@qq.com
 * 合成模式(Composlte)
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 */
public class SimplePattern {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");


    }
}
