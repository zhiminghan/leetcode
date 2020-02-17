package com.alogrithm.leetcode.T783;

import com.alogrithm.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 783. 二叉搜索树结点最小距离
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 * @time: 2020/2/17 18:42
 */

public class Main {

    public int minDiffInBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postOrder(root,list);
        Integer pre=null;
        Integer min=null;

        for(Integer i:list){
            if(pre==null) pre=i;
            else if(min==null)
                min=i-pre;
            else
                min=Math.min(min,i-pre);

            if(pre!=null)pre=i;

        }

        return min;
    }

    public void postOrder(TreeNode root, List<Integer> list) {
        if(root.left!=null) postOrder(root.left,list);
        list.add(root.val);
        if(root.right!=null) postOrder(root.right,list);

    }
}
