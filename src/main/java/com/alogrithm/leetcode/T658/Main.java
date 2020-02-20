package com.alogrithm.leetcode.T658;

import java.util.*;

/**
 * @description: 658. 找到 K 个最接近的元素
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/find-k-closest-elements/
 * @time: 2020/2/20 00:46
 */

public class Main {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();

        PriorityQueue<Integer> heap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer d1=Math.abs(o1-x);
                Integer d2=Math.abs(o2-x);

                return d2.compareTo(d1);
            }
        });

        for (int num:arr){
            if(heap.size()<k) heap.add(num);
            else if(Math.abs(heap.peek()-x)>Math.abs(num-x)){
                heap.poll();
                heap.add(num);
            }
        }

        while (!heap.isEmpty()){

            list.add(heap.poll());
        }
        Collections.sort(list);
        return list;
    }

}
