package com.telran.lesson13;

public class TreeUtil {

    public static TreeNode getSampleTree() {

        TreeNode root = new TreeNode(8);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode five = new TreeNode(5);
        TreeNode seven = new TreeNode(7);
        TreeNode twlve = new TreeNode(12);
        TreeNode nine = new TreeNode(9);
        TreeNode six = new TreeNode(6);

        root.setLeft(four);
        root.setRight(three);

        three.setLeft(five);
        three.setRight(seven);

        four.setLeft(one);
        four.setRight(two);

        seven.setRight(six);

        two.setRight(nine);

        one.setLeft(twlve);

        return root;
    }
}
