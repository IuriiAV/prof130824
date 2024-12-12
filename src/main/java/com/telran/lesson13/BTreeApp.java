package com.telran.lesson13;

import java.util.LinkedList;
import java.util.Queue;

public class BTreeApp {

    public static void main(String[] args) {

        TreeNode root = TreeUtil.getSampleTree();

        bfs(root);
        System.out.println();
        bfsWithLevelPrint(root);
        System.out.println("\n");
        inorderDepthFirstSearch(root);
        System.out.println("\n");
        preorderDepthFirstSearch(root);

    }

    private static void preorderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        preorderDepthFirstSearch(root.getLeft());
        preorderDepthFirstSearch(root.getRight());
    }

    private static void inorderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderDepthFirstSearch(root.getLeft());
        System.out.print(root.getValue() + " ");
        inorderDepthFirstSearch(root.getRight());
    }

    private static void bfs(TreeNode root) {

        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.getValue() + " ");
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }

    private static void bfsWithLevelPrint(TreeNode root) {

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

}
