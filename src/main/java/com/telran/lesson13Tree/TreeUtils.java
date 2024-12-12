package com.telran.lesson13Tree;

/**
 *              8
 *            /   \
 *         4        3
 *        / \      / \
 *       1  2     5   7
 *      /    \         \
 *     12     9         6
 *
 *     в бинарном дереве - 2 узла - делятся на правый и левый
 *
 */

public class TreeUtils {

    //(task)getSampleBSTree

    public static TreeNode getSampleTree() {
        TreeNode root = new TreeNode(8);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode five = new TreeNode(5);
        TreeNode seven = new TreeNode(7);
        TreeNode twelve = new TreeNode(12);
        TreeNode nine = new TreeNode(9);
        TreeNode six = new TreeNode(6);

        root.setLeft(four);
        root.setRight(three);

        four.setLeft(one);
        four.setRight(two);

        three.setLeft(five);
        three.setRight(seven);

        one.setLeft(twelve);
        two.setRight(nine);

        seven.setRight(six);

        return root;
    }
}
