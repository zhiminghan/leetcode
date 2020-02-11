package com.alogrithm.leetcode.T409;

/**
 * @description: 409. 最长回文串
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/longest-palindrome/
 * @time: 2020/2/11 15:49
 */

public class Main {

    public int longestPalindrome(String s) {
        if(s==null||s.length()==0) return 0;

        char[] chars=s.toCharArray();
        int[] wordCount=new int[128];
        for (int i=0;i<chars.length;i++){
            wordCount[chars[i]-'0']++;
        }

        int single=0;
        int maxlen=0;
        for (int i=0;i<wordCount.length;i++){
            if(wordCount[i]%2==0){
                maxlen+=wordCount[i];
            }else{
                single=1;
                maxlen+=wordCount[i]-1;
            }
        }
        return maxlen+single;
    }

}
