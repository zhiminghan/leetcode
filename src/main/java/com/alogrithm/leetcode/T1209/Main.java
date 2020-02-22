package com.alogrithm.leetcode.T1209;

import java.util.Stack;

/**
 * @description: 1209. 删除字符串中的所有相邻重复项 II
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 * @time: 2020/2/22 14:26
 */

public class Main {

    public String removeDuplicates2(String s, int k) {
        char []chars=s.toCharArray();
        Stack<Integer> stack=new Stack<>();
        StringBuffer sb=new StringBuffer(s);

        for(int i=0;i<sb.length();i++){

            if(i==0||sb.charAt(i-1)!=sb.charAt(i)) stack.push(1);
            else{
                int count=stack.pop();
                if(count+1==k){
                    sb.delete(i-k+1,i+1);
                    i=i-k;
                }else{
                    stack.push(count+1);
                }

            }
        }
            return sb.toString();

    }

    public String removeDuplicates(String s, int k) {
        char []chars=s.toCharArray();
        int[] count=new int[s.length()];
        StringBuffer sb=new StringBuffer(s);

        for(int i=0;i<sb.length();i++){

            if(i==0||sb.charAt(i-1)!=sb.charAt(i)) count[i]=1;
            else{
                if(count[i-1]+1==k){
                    sb.delete(i-k+1,i+1);
                    i=i-k;
                }else{
                    count[i]=count[i-1]+1;                }

            }
        }
        return sb.toString();

    }


}
