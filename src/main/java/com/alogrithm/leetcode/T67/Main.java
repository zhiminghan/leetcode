package com.alogrithm.leetcode.T67;

/**
 * @description: 67. 二进制求和
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/add-binary/
 * @time: 2020/2/16 18:10
 */

public class Main {

    public String addBinary(String a, String b) {

        StringBuffer sb=new StringBuffer();

        char[] chars1=a.toCharArray();
        char[] chars2=b.toCharArray();
        int pre=0;
        int i=chars1.length-1,j=chars2.length-1;
        for(;i>=0&&j>=0;i--,j--){
            int num1=chars1[i]-'0';
            int num2=chars2[j]-'0';
            int num=num1+num2+pre;
            pre=num/2;
            sb.append(num%2);
        }

        if(i>=0){
            while (i>=0){
                int num1=chars1[i]-'0';
                int num=num1+pre;
                pre=num/2;
                sb.append(num%2);
                i--;
            }
        }

        if(j>=0){
            while (j>=0){
                int num2=chars2[j]-'0';
                int num=num2+pre;
                pre=num/2;
                sb.append(num%2);
                j--;
            }
        }

        if(pre>0){
            sb.append(pre);
        }
        return sb.reverse().toString();
    }

}
