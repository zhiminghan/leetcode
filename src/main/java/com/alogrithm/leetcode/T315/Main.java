package com.alogrithm.leetcode.T315;

import com.alogrithm.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 315. 计算右侧小于当前元素的个数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self/description/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china
 * @time: 2020/2/13 14:26
 */

public class Main {

    public List<Integer> countSmaller(int[] nums) {
        LinkedList<Integer> list=new LinkedList<>();
        if(nums==null) return list;

        TreeNode root=null;
        if(nums.length>0){
            list.push(0);
            root=new TreeNode(nums[nums.length-1]);
        }


        for(int i=nums.length-2;i>=0;i--){
            TreeNode n=new TreeNode(nums[i]);
            insert(root,n,0,list);
        }
        return list;
    }

    private TreeNode insert(TreeNode root,TreeNode n,int count,LinkedList<Integer> list){
        if (root==null){
            list.push(count);
            return n;
        }
        if(n.val==root.val){
            root.repeatCount+=1;
            list.push(count+root.minCount);
        }else if(n.val<root.val){
            root.minCount+=1;
            root.left=insert(root.left,n,count,list);
        }else {
            root.right=insert(root.right,n,count+root.minCount+root.repeatCount+1,list);
        }
        return root;

    }
}
