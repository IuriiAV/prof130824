package com.telran.summary3;

public class Task1 {

    public static void main(String[] args) {

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


        int number = 20;



    }
}
