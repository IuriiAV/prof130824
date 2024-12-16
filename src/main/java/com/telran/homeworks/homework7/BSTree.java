package com.telran.homeworks.homework7;


import com.telran.lesson13.TreeNodee;
import com.telran.lesson13.TreeUtilss;

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
    private static void Print(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.getValue() + " ");

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
            System.out.println();
        }
    }


    public void printTreeBottomToTop(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.getValue());

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }

            stack.push(level);
        }


        while (!stack.isEmpty()) {
            List<Integer> level = stack.pop();
            System.out.println(level);
        }
    }

    public void countAndSumLevels(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int levelSum = 0;

            System.out.print("Level " + level + ": Count = " + size + ", Sum = ");

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelSum += node.getValue();

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }

            System.out.println(levelSum);
            level++;
        }
    }

    public boolean find(TreeNode root, int value) {
        while (root != null) {
            if (root.getValue() == value) {
                return true;
            } else if (value < root.getValue()) {
                root = root.getLeft();
            } else {
                root = root.getRight();
            }
        }
        return false;
    }


    public static void main(String[] args) {
        TreeNode root = TreeUtils.getSampleBSTree();
        Print(root);
        System.out.println();

        BSTree bstree = new BSTree();

        System.out.println("Is 7 in the tree? " + bstree.find(root, 7));
        System.out.println("Is 10 in the tree? " + bstree.find(root, 10));
        System.out.println("Is 20 in the tree? " + bstree.find(root, 20));


        System.out.println("\nLevel-wise Node Counts and Sums:");
        bstree.countAndSumLevels(root);


        System.out.println("\nTree levels from bottom to top:");
        bstree.printTreeBottomToTop(root);

    }
}