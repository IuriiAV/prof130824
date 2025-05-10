package com.telran.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 14
 * /   \
 * 6        18
 * /  \      /  \
 * 5   7     16   22
 * /      \   /    /  \
 * 4        8 15   20   24
 * <p>
 * 7 ->  8 -> 7
 */

public class BSTree {

    public static void main(String[] args) {
        searchElement(TreeUtils.getBSTree(), 10);
        printBSTree(TreeUtils.getBSTree());
        printSumBSTree(TreeUtils.getBSTree());
    }

    private static void searchElement(TreeNode root, int element) {
        TreeNode current = root;
        System.out.print("Path : ");
        while (current != null) {
            System.out.print(current.getValue() + "->");
            if (current.getValue() == element) {
                System.out.println("\nElement " + element + " found");
                break;
            }
            if (current.getValue() > element) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
    }

    private static void printBSTree(TreeNode root) {
        List<List<TreeNode>> list = new ArrayList<>();
        list.add(Arrays.asList(root));
        while (true) {
            List<TreeNode> nextLevel = new ArrayList<>();
            List<TreeNode> prevLevel = list.get(list.size() - 1);
            for (TreeNode node : prevLevel) {
                if (node.getLeft() != null) {
                    nextLevel.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    nextLevel.add(node.getRight());
                }
            }
            if (nextLevel.isEmpty()) {
                break;
            } else {
                list.add(nextLevel);
            }
        }
        System.out.println();

        for (int i = list.size() - 1; i >= 0; i--) {
            List<TreeNode> currentLevel = list.get(i);
            for (TreeNode node : currentLevel) {
                System.out.print(node.getValue() + " ");
            }
            System.out.println();
        }
    }

    private static void printSumBSTree(TreeNode root) {
        List<List<TreeNode>> list = new ArrayList<>();
        list.add(Arrays.asList(root));
        while (true) {
            List<TreeNode> nextLevel = new ArrayList<>();
            List<TreeNode> prevLevel = list.get(list.size() - 1);
            for (TreeNode node : prevLevel) {
                if (node.getLeft() != null) {
                    nextLevel.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    nextLevel.add(node.getRight());
                }
            }
            if (nextLevel.isEmpty()) {
                break;
            } else {
                list.add(nextLevel);
            }
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            List<TreeNode> currentLevel = list.get(i);
            Integer sum = 0;

            for (TreeNode node : currentLevel) {
                sum += node.getValue();
            }
            System.out.println(sum);
        }
    }
}
