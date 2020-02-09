package com.alogrithm.leetcode.T199;

import com.alogrithm.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 199. 二叉树的右视图
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/binary-tree-right-side-view/
 * @time: 2020/2/9 22:06
 */

public class Main {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list=new ArrayList<>();
        LinkedList<TreeNode> queue=new LinkedList<>();
        if(root==null) return list;
        queue.push(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){

                TreeNode node=queue.poll();

                if(i==size-1) list.add(node.val);

                if(node.left!=null) queue.add(node.left);

                if(node.right!=null) queue.add(node.right);

            }
        }

        return list;

    }


}
