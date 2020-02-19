package com.alogrithm.leetcode.T378;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @description: 378. 有序矩阵中第K小的元素
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/
 * @time: 2020/2/19 22:02
 */

public class Main {

    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer> heap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(heap.size()<k) heap.add(matrix[i][j]);
                else if(heap.peek()>matrix[i][j]){
                    heap.poll();
                    heap.add(matrix[i][j]);
                }
            }
        }
        return heap.peek();
    }

}
