package com.alogrithm.leetcode.T290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description: 290. 单词规律
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/word-pattern/
 * @time: 2020/2/11 16:18
 */

public class Main {

    public boolean wordPattern(String pattern, String str) {

        String[] words=str.split(" ");

        char[] chars=pattern.toCharArray();

        if(chars.length!=words.length) return false;

        Map<Character,String> map=new HashMap<>();

        Set<String> useWords=new HashSet<>();
        for (int i=0;i<chars.length;i++){

            if(!map.containsKey(chars[i])){
                if(useWords.contains(words[i])) return false;
                map.put(chars[i],words[i]);
                useWords.add(words[i]);
            }else {
                String word=map.get(chars[i]);
                if(!word.equals(words[i])) return false;
            }
        }
        return true;
    }

}
