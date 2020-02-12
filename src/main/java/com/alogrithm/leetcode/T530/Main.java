package com.alogrithm.leetcode.T530;

import com.alogrithm.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 530. 二叉搜索树的最小绝对差
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 * @time: 2020/2/12 19:57
 */

public class Main {

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postOrder(list,root);
        Integer min=null;
        for (int i=0;i<list.size();i++){
            if(i>0) min=min==null?list.get(i)-list.get(i-1):Math.min(min,list.get(i)-list.get(i-1));
        }
        return min;
    }

    public void postOrder(List<Integer> list, TreeNode n){
        if(n.left!=null) postOrder(list,n.left);
        list.add(n.val);
        if(n.right!=null) postOrder(list,n.right);
    }
}
