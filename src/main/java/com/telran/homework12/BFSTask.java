package com.telran.homework12;

import java.util.*;

public class BFSTask {

    public static void main(String[] args) {

        findLineSum(TreeUtils.getSampleTree());
        System.out.println("-----------------------");
        printReverseOrder(TreeUtils.getSampleTree());
    }

    private static void findLineSum(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.getValue();
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
                System.out.print(node.getValue() + " ");
            }
            System.out.println("\n" + "sum is " + sum);
        }
    }

    private static void printReverseOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        Stack<List<TreeNode>> reversedOrder = new Stack<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node);

                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
            }
            reversedOrder.push(list);
        }
        while (!reversedOrder.isEmpty()) {
            List<TreeNode> pop = reversedOrder.pop();
            for (int i = 0; i < pop.size(); i++) {
                TreeNode node = pop.get(i);
                System.out.print(node.getValue() + " ");
            }
            System.out.println();
        }
    }
}
