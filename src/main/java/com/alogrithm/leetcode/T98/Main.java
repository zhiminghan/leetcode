package com.alogrithm.leetcode.T98;

import com.alogrithm.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 98. 验证二叉搜索树
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/validate-binary-search-tree/
 * @time: 2020/2/12 19:45
 */

public class Main {

    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        List<Integer> list=new ArrayList<>();
        postOrder(list,root);
        for (int i=0;i<list.size();i++){
            if(i>0&&list.get(i-1)>=list.get(i)) return false;
        }
        return true;
    }

    public void postOrder(List<Integer> list, TreeNode n){
        if(n.left!=null) postOrder(list,n.left);
        list.add(n.val);
        if(n.right!=null) postOrder(list,n.right);
    }
}
