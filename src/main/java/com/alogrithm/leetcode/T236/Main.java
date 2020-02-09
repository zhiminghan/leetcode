package com.alogrithm.leetcode.T236;

import com.alogrithm.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 236. 二叉树的最近公共祖先
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * @time: 2020/2/9 18:58
 */

public class Main {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> temp=new ArrayList<>();
        List<TreeNode> path1=new ArrayList<>();
        List<TreeNode> path2=new ArrayList<>();

        findNodePath(root,p,q,temp,path1,path2);
        TreeNode common=null;
        for (int i=0,j=0;i<path1.size()&&j<path2.size();i++,j++){
            if(path1.get(i)==path2.get(j)) common=path1.get(i);
        }
        return common;
    }

    private void findNodePath(TreeNode root, TreeNode p,TreeNode q,List<TreeNode> temp,List<TreeNode> path1,List<TreeNode> path2) {
        if(root==null) return;

        temp.add(root);

        if(root==p){
            path1.addAll(temp);
        }
        if(root==q){
            path2.addAll(temp);
        }

        if(root.left!=null){
            findNodePath(root.left,p,q,temp,path1,path2);
            temp.remove(temp.size()-1);
        }

        if(root.right!=null){
            findNodePath(root.right,p,q,temp,path1,path2);
            temp.remove(temp.size()-1);
        }

    }
}