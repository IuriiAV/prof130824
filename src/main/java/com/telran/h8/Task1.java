package com.telran.h8;


import java.util.*;

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


        int number = 15;
        //searchElement(root, number);

        //getSumLevel(root);

        reversPrintTree(root);
    }

    private static void searchElement(TreeNode root, int number) {
        if (root == null) {
            return;
        }
        TreeNode current = root;
        System.out.print("Path :");
        while (current != null) {
            System.out.println(current.getValue() + "->");
            if (current.getValue() == number) {
                System.out.println("Element " + number + " found");
                break;
            }
            if (current.getValue() > number) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }

        }
    }

    private static void getSumLevel(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int res = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                res = res + node.getValue();
                System.out.print(node.getValue() + " ");
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
            level++;
            System.out.println("\nSum of level " + level + " elements = " + res);
        }
    }

    private static void reversPrintTree(TreeNode root){
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> listReversValue = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                listReversValue.add(node.getValue());
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
        }
        Collections.reverse(listReversValue);
        System.out.print(listReversValue);
     }

}

