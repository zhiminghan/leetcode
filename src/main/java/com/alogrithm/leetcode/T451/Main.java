package com.alogrithm.leetcode.T451;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @description: 451. 根据字符出现频率排序
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/sort-characters-by-frequency/
 * @time: 2020/2/19 21:12
 */

public class Main {

    public String frequencySort(String s) {
        char[] chars=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:chars)
           map.put(c,map.getOrDefault(c,0)+1);

        PriorityQueue<Character> heap=new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });

        for(char c:chars){
            if(!heap.contains(c)) heap.add(c);
        }

        StringBuffer sb=new StringBuffer();
        while(!heap.isEmpty()){
           Character c=heap.poll();
            int count=map.get(c);
            for(int i=0;i<count;i++) sb.append(c);
        }

        return sb.toString();
    }

}
