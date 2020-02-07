package com.algorithm.leetcode.T78;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 78. 子集
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/subsets/
 * @time: 2020/2/7 15:48
 */

public class Main {

    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(new Main().subsets(nums));

    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> total=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        subsets(0,list,nums,total);
        return total;
    }

    private void subsets(int i, List<Integer> list,int[] nums, List<List<Integer>> total) {

        if(i==nums.length){
            total.add(list);
            return;
        }
        List<Integer> temp=new ArrayList<>(list);
        temp.add(nums[i]);
        subsets(i+1,temp,nums,total);
        subsets(i+1,list,nums,total);

    }
}