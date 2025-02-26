package com.telran.homework12;

public class BSTree {
    public static void main(String[] args) {
        TreeNode myRoot = TreeUtils.getBSTree();
        findValue(myRoot, 13);
    }

    private static void findValue(TreeNode root, int value) {
        if (root == null) {
            System.out.println("The node with value " + value + " is not found.");
            return;
        }

        if (root.getValue() == value) {
            System.out.println("The node is found " + root.getValue());
            return;
        }

        if (root.getValue() > value) {
            System.out.println("Going left from " + root.getValue());
            findValue(root.getLeft(), value);
        } else {
            System.out.println("Going right from " + root.getValue());
            findValue(root.getRight(), value);
        }
    }
}
