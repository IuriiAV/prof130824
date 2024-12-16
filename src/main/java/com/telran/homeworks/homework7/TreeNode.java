package com.telran.homeworks.homework7;

import lombok.Setter;

@Setter
public class TreeNode {

    private int value;

    private TreeNode left;

    private  TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
