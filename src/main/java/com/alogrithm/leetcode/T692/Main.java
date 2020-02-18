package com.alogrithm.leetcode.T692;

import java.util.*;

/**
 * @description: 692. 前K个高频单词
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/top-k-frequent-words/
 * @time: 2020/2/19 01:03
 */

public class Main {

    public List<String> topKFrequent(String[] words, int k) {
        LinkedList<String> list=new LinkedList<>();

        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++)
            map.put(words[i],map.getOrDefault(words[i],0)+1);

        PriorityQueue<String> heap = new PriorityQueue<String>(k, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int rs=map.get(o1).compareTo(map.get(o2));
                if(rs==0) return o2.compareTo(o1);
                return rs;
            }
        });

        for(int i=0;i<words.length;i++){
            if(!heap.contains(words[i])&&heap.size()<k) heap.offer(words[i]);
            else if(!heap.contains(words[i])&&(map.get(heap.peek())<map.get(words[i])||(map.get(heap.peek())==map.get(words[i])&&heap.peek().compareTo(words[i])>0))){
                heap.poll();
                heap.offer(words[i]);
            }
        }

        while(!heap.isEmpty()){
            list.push(heap.poll());
        }

        return list;
    }

}
