package com.telran.lesson13;

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
        searchElement(TreeUtils.getSampleBSTree(), 20);
    }

    private static void searchElement(TreeNode root, int element) {
        TreeNode current = root;
        System.out.print("Path : ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            if (current.getValue() == element) {
                System.out.print("\nElement " + element + " found");
                break;

            }
            if (current.getValue() > element) {
                current = current.getLeft();

            }  else {
                current = current.getRight();
            }
        }
    }

}
