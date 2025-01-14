package com.telran.lesson13;

import java.util.*;

/**
 *               14
 *             /   \
 *          6        18
 *        /  \      /  \
 *       5   7     16   22
 *     /      \   /    /  \
 *    4        8 15   20   24
 *
 *     7 ->  8 -> 7
 */

public class BSTree {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getBSTree();
        searchElement(root, 81);
        bottomUpTraversal(root);
        getLevelsSum(root);
    }

    private static void searchElement(TreeNode root, int element) {
        TreeNode current = root;
        System.out.print("Path : ");
        boolean exists = false;
        while (current != null) {
            System.out.print(current.getValue());
            if (current.getValue() == element) {
                System.out.println("\nElement " + element + " found");
                exists = true;
                break;
            }
            if (current.getValue() > element) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
            System.out.print("->");
        }
        if (!exists) System.out.println("No such element.");
    }

    private static void bottomUpTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        LinkedList<List<Integer>> levels = new LinkedList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.getValue());
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
            levels.addFirst(currentLevel);
        }
        for (List<Integer> level : levels) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void getLevelsSum(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
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
            }
            System.out.print(sum + " ");
        }
    }
}
