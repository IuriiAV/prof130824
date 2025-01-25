package com.telran.lesson13;

/**
 *               8
 *             /   \
 *           4       3
 *         /  \    /  \
 *        1   2    5   7
 *      /      \         \
 *    12        9         6
 */
public class TreeUtils {

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

    public static TreeNode getBSTree() {
        TreeNode root = new TreeNode(14);
        TreeNode one = new TreeNode(6);
        TreeNode two = new TreeNode(18);
        TreeNode three = new TreeNode(5);
        TreeNode four = new TreeNode(7);
        TreeNode five = new TreeNode(16);
        TreeNode six = new TreeNode(22);
        TreeNode seven = new TreeNode(4);
        TreeNode eight = new TreeNode(8);
        TreeNode nin = new TreeNode(15);
        TreeNode ten = new TreeNode(20);
        TreeNode eleven = new TreeNode(24);

        root.setLeft(one);
        root.setRight(two);

        one.setLeft(three);
        one.setRight(four);

        two.setLeft(five);
        two.setRight(six);

        three.setLeft(seven);

        four.setRight(eight);

        five.setLeft(nin);

        six.setLeft(ten);
        six.setRight(eleven);

        return root;
    }
}
