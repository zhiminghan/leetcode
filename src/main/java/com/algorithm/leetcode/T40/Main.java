package com.algorithm.leetcode.T40;

import java.util.*;

/**
 * @description: 40. 组合总和 II
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/combination-sum-ii/
 * @time: 2020/2/7 22:13
 */

public class Main {

    public static void main(String[] args) {

        int []candidates={10,1,2,7,6,1,5};

        System.out.println(new Main().combinationSum2(candidates,8));

    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> total=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(0,0,target,list,candidates,total);
        return new ArrayList<>(total);
    }

    private void combinationSum2(int i,int sum,int target,List<Integer> list,int[] nums, Set<List<Integer>> total) {
        if(sum==target){
            if(!total.contains(list))
                total.add(list);
            return;
        }
        if(sum>target||i==nums.length) return;

        List<Integer> temp=new ArrayList<>(list);
        temp.add(nums[i]);
        combinationSum2(i+1,sum+nums[i],target,temp,nums,total);
        combinationSum2(i+1,sum,target,list,nums,total);

    }


}
