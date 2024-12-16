package com.telran.h8;

import java.util.LinkedList;
import java.util.Queue;

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
        breadthFirstSearchNumber(number, root);

    }

    private static void breadthFirstSearchNumber(int number, TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>(); // q:
        queue.add(root); // q: 8
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // 8 4 3 1 2 5 7 12 9 6// q:
            System.out.print(node.getValue() + " "); // 8 4 3 1 2 5 7 12 9 6
            //Add left node to queue
            if (node.getLeft() != null && node.getLeft().getValue() > node.getRight().getValue() && node.getLeft().getValue() <= number) {
                queue.add(node.getLeft());  // q:
            }
            //Add right node to queue
            if (node.getRight() != null && node.getRight().getValue() > node.getLeft().getValue() && node.getRight().getValue() <= number) {
                queue.add(node.getRight());  // q:
            }
        }
    }
}
