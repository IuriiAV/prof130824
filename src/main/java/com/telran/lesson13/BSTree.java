package com.telran.lesson13;

import com.telran.lesson13Tree.TreeNode;
import com.telran.lesson13Tree.TreeUtils;

/**
 *           14
 *         /   \
 *      6        18
 *    /  \      /  \
 *   5   7     16   22
 * /      \   /    /  \
 * 4        8 15   20   24
 * <p>
 * 7 ->  8 -> 7
 */

public class BSTree {

    public static void main(String[] args) {
        searchEelement(TreeUtils.getBSTree(), 15);
    }

    private static void searchEelement(TreeNode root, int element){}
}
