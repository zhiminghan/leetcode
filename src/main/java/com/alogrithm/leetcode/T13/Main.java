package com.alogrithm.leetcode.T13;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 13. 罗马数字转整数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/roman-to-integer/
 * @time: 2020/2/10 17:07
 */

public class Main {

    Map<Character,Integer> map=new HashMap<>();


    public void init(){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }

    public int romanToInt(String s) {

        init();
        char[] chars=s.toCharArray();
        int sum=0;
        for(int i=0;i<chars.length;i++){
            if ((i-1>=0)&&((chars[i-1]=='I'&&chars[i]=='V')||(chars[i-1]=='I'&&chars[i]=='X')||(chars[i-1]=='C'&&chars[i]=='D')||(chars[i-1]=='C'&&chars[i]=='M') ||(chars[i-1]=='X'&&chars[i]=='L')||(chars[i-1]=='X'&&chars[i]=='C'))){
                sum+=(map.get(chars[i])-2*map.get(chars[i-1]));
            } else{
                sum+=map.get(chars[i]);
            }

        }
        return sum;
    }

}
