package com.alogrithm.leetcode.T373;

import java.util.*;

/**
 * @description: 373. 查找和最小的K对数字
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
 * @time: 2020/2/19 23:38
 */

public class Main {

    class Pair{
        int x;
        int y;
        Integer sum;

        public Pair(int x,int y){
            this.x=x;
            this.y=y;
            this.sum=x+y;
        }

    }


    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        LinkedList<List<Integer>> total=new LinkedList<>();

        Set<Pair> set=new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                set.add(new Pair(nums1[i],nums2[j]));
            }
        }

        PriorityQueue<Pair> heap=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.sum.compareTo(o1.sum);
            }
        });
        for(Pair p:set){
            if(heap.size()<k) heap.add(p);
            else if(heap.peek().sum>p.sum){
                heap.poll();
                heap.add(p);
            }
        }

        while (!heap.isEmpty()){

            Pair p=heap.poll();
            List<Integer> list=new ArrayList<>();
            list.add(p.x);
            list.add(p.y);
            total.push(list);
        }
        return total;
    }
}
