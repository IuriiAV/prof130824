package com.telran.lesson13;


import java.util.LinkedList;
import java.util.Queue;

import static com.telran.lesson13.TreeUtils.getSampleBSTree;

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
public class BSTreee {

    public void countAndSumLevels(TreeNodee root) {
        if (root == null) {
            return;
        }

        Queue<TreeNodee> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int levelSum = 0;

            System.out.print("Level " + level + ": Count = " + size + ", Sum = ");

            for (int i = 0; i < size; i++) {
                TreeNodee node = queue.poll();
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
    public boolean find(TreeNodee root, int value) {
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
        TreeNodee root = getSampleBSTree();

        getSampleBSTree();

        System.out.println("\n");

        BSTreee bstree = new BSTreee();

        System.out.println("Is 7 in the tree? " + bstree.find(root, 7));
        System.out.println("Is 10 in the tree? " + bstree.find(root, 10));
        System.out.println("Is 20 in the tree? " + bstree.find(root, 20));


        System.out.println("\nLevel-wise Node Counts and Sums:");
        bstree.countAndSumLevels(root);
    }
}