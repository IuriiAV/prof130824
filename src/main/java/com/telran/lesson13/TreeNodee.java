package com.telran.lesson13;

public class TreeNodee {

    private int value;

    private TreeNodee left;

    private TreeNodee right;

    public TreeNodee(int value) {
        this.value = value;
    }

    public void setLeft(TreeNodee left) {
        this.left = left;
    }

    public void setRight(TreeNodee right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public TreeNodee getLeft() {
        return left;
    }

    public TreeNodee getRight() {
        return right;
    }
}
