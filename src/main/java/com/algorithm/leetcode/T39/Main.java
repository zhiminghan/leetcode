package com.algorithm.leetcode.T39;

import java.util.*;

/**
 * @description: 39. 组合总和
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/combination-sum/
 * @time: 2020/2/7 22:31
 */

public class Main {

    public static void main(String[] args) {
        int[] candidates={2,3,5};
        System.out.println(new Main().combinationSum(candidates,8));

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Set<List<Integer>> total=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        combinationSum(target,list,candidates,total);
        return new ArrayList<>(total);
    }

    private void combinationSum(int target, List<Integer> list, int[] candidates, Set<List<Integer>> total) {

        if(target==0){
            Collections.sort(list);
            if(!total.contains(list)){
                total.add(list);
            }
            return;
        }
        if(target<0) return;

        for (int i=0;i<candidates.length;i++){
            List<Integer> temp=new ArrayList<>(list);
            temp.add(candidates[i]);
            combinationSum(target-candidates[i],temp,candidates,total);
        }
    }

}
