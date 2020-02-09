package com.alogrithm.leetcode.T113;

import com.alogrithm.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 113. 路径总和 II
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/path-sum-ii/
 * @time: 2020/2/8 22:07
 */

public class Main {

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> paths=new ArrayList<>();
        if(root==null) return paths;

        List<Integer> path=new ArrayList<>();
        preOrder(root,0,target,path,paths);
        return paths;
    }

    public void preOrder(TreeNode root, int sum,int target,List<Integer> path,List<List<Integer>> paths){
        path.add(root.val);
        sum+= root.val;

        if(root.left==null&&root.right==null) {
            if (sum == target) {
                paths.add(new ArrayList<>(path));
            }
            return;
        }


        if(root.left!=null){
            preOrder(root.left,sum,target,path,paths);
            path.remove(path.size()-1);
        }

        if(root.right!=null){
            preOrder(root.right,sum,target,path,paths);
            path.remove(path.size()-1);
        }

    }



}
