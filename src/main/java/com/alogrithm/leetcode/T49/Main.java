package com.alogrithm.leetcode.T49;

import java.util.*;

/**
 * @description: 49. 字母异位词分组
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/group-anagrams/submissions/
 * @time: 2020/2/5 20:23
 */

public class Main {


    public static void main(String[] args) {

        String[] strs=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new Main().groupAnagrams(strs));

    }

    Map<Character,Integer> characterMap=new HashMap<>();

    {
        characterMap.put('a',2);
        characterMap.put('b',3);
        characterMap.put('c',5);
        characterMap.put('d',7);
        characterMap.put('e',11);
        characterMap.put('f',13);
        characterMap.put('g',17);
        characterMap.put('h',19);
        characterMap.put('i',23);
        characterMap.put('j',29);
        characterMap.put('k',31);
        characterMap.put('l',37);
        characterMap.put('m',41);
        characterMap.put('n',43);
        characterMap.put('o',47);
        characterMap.put('p',53);
        characterMap.put('q',59);
        characterMap.put('r',61);
        characterMap.put('s',67);
        characterMap.put('t',71);
        characterMap.put('u',73);
        characterMap.put('v',79);
        characterMap.put('w',83);
        characterMap.put('x',89);
        characterMap.put('y',97);
        characterMap.put('z',101);

    }


    public  List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> total=new ArrayList<>();
        Map<Integer,List<String>> map=new HashMap<>();

        for (String str:strs){
           char[] chars=str.toCharArray();
           int key=1;
           for (Character c:chars){
               key=key*characterMap.get(c);
           }
           if(map.containsKey(key)){
               List<String> list=map.get(key);
               list.add(str);
           }else{
               List<String> list=new ArrayList<>();
               list.add(str);
               map.put(key,list);
           }
        }

        for(Map.Entry<Integer,List<String>> entry:map.entrySet()){
            total.add(entry.getValue());
        }
        return total;
    }


}
