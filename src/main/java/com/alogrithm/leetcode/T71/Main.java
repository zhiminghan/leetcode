package com.alogrithm.leetcode.T71;

import java.util.Stack;

/**
 * @description: 71. 简化路径
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/simplify-path/
 * @time: 2020/2/21 20:58
 */

public class Main {

    public String simplifyPath(String path) {

        char[] chars=path.toCharArray();
        Stack<String> stack=new Stack<>();
        StringBuffer  sb=new StringBuffer();

        boolean flag=false;
        for(char c:chars){
            if(c=='/'&&!flag){
                String dir=sb.toString();
                if(dir.equals("..")&&!stack.isEmpty()) stack.pop();
                else if (dir.length()!=0&&!dir.equals(".")&&!dir.equals(".."))stack.push(dir.toString());
                flag=true;
                sb=new StringBuffer();
            }else if(c!='/'){
                flag=false;
                sb.append(c);
            }
        }
        String dir=sb.toString();
        if(dir.equals("..")&&!stack.isEmpty()) stack.pop();
        else if (dir.length()!=0&&!dir.equals(".")&&!dir.equals(".."))stack.push(dir.toString());

        if(stack.isEmpty()) return "/";
        StringBuffer simdir=new StringBuffer();
        while (!stack.isEmpty()){
            simdir.append("/");
            simdir.append(stack.remove(0));
        }

        return simdir.toString();
    }

    public String simplifyPath2(String path) {

        Stack<String> stack=new Stack<>();
        String[] dirs=path.split("/");
        StringBuffer simdir=new StringBuffer();
        for(String dir:dirs) {
             if(dir.equals("..")&&!stack.isEmpty()) stack.pop();
             else if (dir.length()!=0&&!dir.equals(".")&&!dir.equals(".."))stack.push(dir);
        }
        if(stack.isEmpty()) return "/";
        while (!stack.isEmpty()){
            simdir.append("/");
            simdir.append(stack.remove(0));
        }
        return simdir.toString();
    }



}
