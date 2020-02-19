package com.alogrithm.leetcode.T414;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @description: 414. 第三大的数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/third-maximum-number/
 * @time: 2020/2/19 17:24
 */

public class Main {

    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        int k=set.size()>=3?3:1;

        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for (int num:set){
            if(heap.size()<k) heap.offer(num);
            else if(heap.peek()<num) {
                heap.poll();
                heap.offer(num);
            }
        }
        return heap.peek();
    }


}
