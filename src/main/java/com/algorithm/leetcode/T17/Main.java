package com.algorithm.leetcode.T17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 17.电话号码的字母组合
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * @time: 2020/2/5 18:23
 */

public class Main {

    private  Map<Character,String> phone=new HashMap<>();

    {
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");
    }

    public List<String> letterCombinations(String digits) {

        List<String> combines=new ArrayList<>();
        List<String> letterStrList=new ArrayList<>();

        char[] chars=digits.toCharArray();

        for (char c:chars){
           String letterStr=phone.get(c);
           letterStrList.add(letterStr);
        }
        StringBuffer sb=new StringBuffer();
        letterCombinations(combines,letterStrList,0,sb);
        return combines;

    }

    private void letterCombinations(List<String> combines, List<String> letterStrList,int i,StringBuffer sb) {

            if(letterStrList.size()==i){
                String letterCombination=sb.toString();
                if(letterCombination.length()!=0) combines.add(letterCombination);

                return;
            }

            String letterStr=letterStrList.get(i);
            char[] chars=letterStr.toCharArray();
            for(char c:chars){
                StringBuffer newSb=new StringBuffer(sb);
                newSb.append(c);
                letterCombinations(combines,letterStrList,i+1,newSb);
            }
     }

}
