package com.bridgelabz.BinaryTree;

public class MyTreeNode<K> {
    K key;
    MyTreeNode<K> left;
    MyTreeNode<K> right;

    public MyTreeNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
