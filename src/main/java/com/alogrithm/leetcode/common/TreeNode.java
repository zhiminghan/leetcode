package com.alogrithm.leetcode.common;

import java.util.Objects;

public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     public int minCount;
     public int repeatCount;

     public TreeNode(int x) { val = x; }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof TreeNode)) return false;
          TreeNode treeNode = (TreeNode) o;
          return val == treeNode.val &&
                  Objects.equals(left, treeNode.left) &&
                  Objects.equals(right, treeNode.right);
     }

     @Override
     public int hashCode() {
          return Objects.hash(val, left, right);
     }
}