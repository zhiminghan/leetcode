package com.alogrithm.leetcode.T187;

import java.util.*;

/**
 * @description: 187. 重复的DNA序列
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/repeated-dna-sequences/
 * @time: 2020/2/11 17:45
 */

public class Main {

    static char [] dna=new char[]{'A','G','C','T'};

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();


        Map<Character,Integer> dna=new HashMap<>();
        Map<Integer,Integer> dnaSeq=new HashMap<>();
        dna.put('A',0);
        dna.put('G',1);
        dna.put('C',2);
        dna.put('T',3);

        char[] chars=s.toCharArray();
        int start=0;
        int n=0;
        for (int i=0;i<chars.length;i++){

            if(i>=0&&i<10) n=n<<2|dna.get(chars[i]);
            else {
                n = n &((1<<18)-1);
                n=n<<2|dna.get(chars[i]);
            }
            if(i-start+1==10){
                System.out.println(Integer.toBinaryString(n));
                if(dnaSeq.get(n)==null) dnaSeq.put(n,1);
                else{
                    String str=integerToString(n);
                    if (!list.contains(str))list.add(str);
                }
                start++;
            }

        }


        return list;

    }

    private String integerToString(int code) {
        StringBuffer sb=new StringBuffer();
        for(int i=9;i>=0;i--){
            sb.append(dna[(code&(3<<i*2))>>2*i]);
        }

        return sb.toString();
    }
}
