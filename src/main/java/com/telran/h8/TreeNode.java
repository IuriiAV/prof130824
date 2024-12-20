package com.telran.h8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode {

    private  int value;

    private TreeNode left;

    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode() {

    }
}
