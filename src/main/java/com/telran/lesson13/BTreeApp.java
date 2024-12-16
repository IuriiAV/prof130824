package com.telran.lesson13;

import java.util.LinkedList;
import java.util.Queue;

////**
// *               8
//         *             /   \
//         *           4       3
//         *         /  \    /  \
//         *        1   2    5   7
//         *      /      \         \
//         *    12        9         6
//         *
//         *    BFS - Breadth First Search - поиск в ширину (горизонтальный поиск), обход дерева
// *    по уровням (итеративный подход)
// *
//         *    DFS - Depth First Search - поиск в глубину (вертикальный поиск), обход по веткам,
// *    (рекурсивный подход) (Inorder, Preorder, Postorder)
//        *
//        */

public class BTreeApp {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getSampleTree();
        breadthFirstSearch(root);
        System.out.println("\n");
        breadthFirstSearchWithLevelPrint(root);
        System.out.println("\n");
        inorderDepthFirstSearch(root);
        System.out.println("\n");
        preorderDepthFirstSearch(root);
        System.out.println("\n");
        postorderDepthFirstSearch(root);
    }

    /**
     *
     * 1.Обходим левое поддерево
     * 2.Обходим правое поддерево
     * 3.Посещаем корень
     * 12 1 9 2 4 5 6 7 3 8
     * Корень в конце, после левого и правого
     */
    private static void postorderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderDepthFirstSearch(root.getLeft());
        postorderDepthFirstSearch(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    /**
     * 1.Посещаем корень
     * 2.Обходим левое поддерево
     * 3.Обходим правое поддерево
     * 8 4 1 12 2 9 3 5 7 6
     * Корень сразу, перед левым и правым
     */
    private static void preorderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");

        preorderDepthFirstSearch(root.getLeft());
        preorderDepthFirstSearch(root.getRight());
    }

    /**
     * 1.Обходим левое поддерево
     * 2.Посещаем корень
     * 3.Обходим правое поддерево
     * 12 1 4 2 9 8 5 3 7 6
     * Корень между левым и правым
     */
    private static void inorderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderDepthFirstSearch(root.getLeft());
        System.out.print(root.getValue() + " ");
        inorderDepthFirstSearch(root.getRight());
    }

    private static void breadthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>(); // q:
        queue.add(root); // q: 8
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // 8 4 3 1 2 5 7 12 9 6// q:
            System.out.print(node.getValue() + " "); // 8 4 3 1 2 5 7 12 9 6
            //Add left node to queue
            if (node.getLeft() != null) {
                queue.add(node.getLeft());  // q:
            }
            //Add right node to queue
            if (node.getRight() != null) {
                queue.add(node.getRight());  // q:
            }
        }
    }

    private static void breadthFirstSearchWithLevelPrint(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>(); // q:
        queue.add(root); // q: 8

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll(); // 8 4 3 1 2 5 7 12 9 6// q:
                System.out.print(node.getValue() + " "); // 8 4 3 1 2 5 7 12 9 6
                //Add left node to queue
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());  // q:
                }
                //Add right node to queue
                if (node.getRight() != null) {
                    queue.add(node.getRight());  // q:
                }
            }
            System.out.println();
        }
    }
}