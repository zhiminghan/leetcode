package com.algorithm.leetcode.T22;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 22. 括号生成
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/generate-parentheses/
 * @time: 2020/2/7 19:54
 */

public class Main {


    public static void main(String[] args) {
        System.out.println(new Main().generateParenthesis(2));
    }

    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generateParenthesis("",n,n,list);
        return list;
    }

    private void generateParenthesis(String s, int left, int right, List<String> list) {

        if(left==0&&right==0&&s.length()!=0){
            list.add(s);
            return;
        }
        if(left>0) {
            generateParenthesis(s.concat("("), left - 1, right, list);
        }

        if(left<right) {
            generateParenthesis(s.concat(")"),left,right-1,list);
        }


    }

}
