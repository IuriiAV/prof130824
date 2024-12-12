package com.telran.lesson13Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 8
 * /   \
 * 4        3
 * / \      / \
 * 1  2      5  7
 * /    \         \
 * 12     9         6
 * <p>
 * в бинарном дереве - 2 узла - делятся на правый и левый
 */
public class BTreeApp {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getSampleTree();
        breadthFirstSearchWithLevelPrint(root);
        System.out.println();
        inOrderDepthFirstSearch(root);

        System.out.println();

        preOrderDepthSearch(root);

        System.out.println();

        postOrderDepthSearch(root);
    }

    /**
     * 1. Обходим левое поддерево
     * 2. Обходим правое поддерево
     * 3. Посещаем корень
     */
    private static void postOrderDepthSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrderDepthSearch(root.getLeft());
        postOrderDepthSearch(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    /**
     * 1. Посещаем корень
     * 2. Обходим левое поддерево
     * 3. Обходим правое поддерево
     */
    private static void preOrderDepthSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getValue() + " ");
        preOrderDepthSearch(root.getLeft());
        preOrderDepthSearch(root.getRight());
    }

    /**
     * 1. Идем сначала по левому поддереву
     * 2. Посещаем корень
     * 3. Идем по правому поддереву
     */
    private static void inOrderDepthFirstSearch(TreeNode root) {
        //базовый случай - дочерних нод нет
        if (root == null) {
            return;
        }

        inOrderDepthFirstSearch(root.getLeft());
        System.out.print(root.getValue() + " ");

        inOrderDepthFirstSearch(root.getRight());
    }

    //просто вывести все элементы
    private static void breadthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //просто вывести все элементы
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

    // вывести все элементы по уровням
    private static void breadthFirstSearchWithLevelPrint(TreeNode root) {
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
