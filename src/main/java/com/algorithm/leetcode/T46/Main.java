package com.algorithm.leetcode.T46;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 46. 全排列
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/permutations/
 * @time: 2020/2/7 21:45
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(new Main().permute(new int[]{1,2,3}));

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> total=new ArrayList<>();
        boolean [] visited=new boolean[nums.length];

        List<Integer> list=new ArrayList<>();
        permute(nums,list,visited,total);
        return total;

    }

    private void permute(int[] nums,List<Integer> list,boolean[] visited, List<List<Integer>> total) {

        for (int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                List<Integer> temp=new ArrayList<>(list);
                temp.add(nums[i]);
                permute(nums,temp,visited,total);
                visited[i]=false;
            }
        }
        if(list.size()==nums.length){
            total.add(list);
        }
    }
}