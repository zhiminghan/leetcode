package com.alogrithm.leetcode.T347;
import java.util.*;

/**
 * @description: 347. 前 K 个高频元素
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/top-k-frequent-elements/
 * @time: 2020/2/19 00:33
 */

public class Main {

    public List<Integer> topKFrequent(int[] nums, int k) {


        LinkedList<Integer> list=new LinkedList<>();

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });

        for(int i=0;i<nums.length;i++){
            if(!heap.contains(nums[i])&&heap.size()<k) heap.offer(nums[i]);
            else if(!heap.contains(nums[i])&&map.get(heap.peek())<map.get(nums[i])){
                heap.poll();
                heap.offer(nums[i]);
            }
        }

        while(!heap.isEmpty()){
            list.push(heap.poll());
        }

        return list;
    }

}
