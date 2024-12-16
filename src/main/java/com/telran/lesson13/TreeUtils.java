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

    public static TreeNodee getSampleTree() {
        TreeNodee root = new TreeNodee(8);
        TreeNodee four = new TreeNodee(4);
        TreeNodee three = new TreeNodee(3);
        TreeNodee one = new TreeNodee(1);
        TreeNodee two = new TreeNodee(2);
        TreeNodee five = new TreeNodee(5);
        TreeNodee seven = new TreeNodee(7);
        TreeNodee twelve = new TreeNodee(12);
        TreeNodee nine = new TreeNodee(9);
        TreeNodee six = new TreeNodee(6);

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

    public static TreeNodee getSampleBSTree() {
        TreeNodee root = new TreeNodee(14);

        TreeNodee six = new TreeNodee(6);
        TreeNodee eighteen = new TreeNodee(18);

        TreeNodee five = new TreeNodee(5);
        TreeNodee seven = new TreeNodee(7);

        TreeNodee sixteen = new TreeNodee(16);
        TreeNodee twentytwo = new TreeNodee(22);

        TreeNodee four = new TreeNodee(4);
        TreeNodee eight = new TreeNodee(8);

        TreeNodee fifteen = new TreeNodee(15);
        TreeNodee twenty = new TreeNodee(20);
        TreeNodee twentyfour = new TreeNodee(24);

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

