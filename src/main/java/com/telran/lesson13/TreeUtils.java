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

    public static TreeNode getSampleBSTree() {
        TreeNode root = new TreeNode(14);

        TreeNode six = new TreeNode(6);
        TreeNode eighteen = new TreeNode(18);

        TreeNode five = new TreeNode(5);
        TreeNode seven = new TreeNode(7);

        TreeNode sixteen = new TreeNode(16);
        TreeNode twentytwo = new TreeNode(22);

        TreeNode four = new TreeNode(4);
        TreeNode eight = new TreeNode(8);

        TreeNode fifteen = new TreeNode(15);
        TreeNode twenty = new TreeNode(20);
        TreeNode twentyfour = new TreeNode(24);

        root.setLeft(six);
        root.setRight(eighteen);

        six.setLeft(five);
        six.setRight(seven);

        eighteen.setLeft(sixteen);
        eighteen.setRight(twentytwo);

        five.setLeft(four);
        seven.setRight(eight);

        sixteen.setLeft(fifteen);
        twentytwo.setLeft(twenty);
        twentytwo.setRight(twentyfour);

        return root;
    }
}

