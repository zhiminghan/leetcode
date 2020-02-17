package com.algorithm.leetcode.T401;

import java.util.ArrayList;
import java.util.List;


/**
 * @description: 401. 二进制手表
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/binary-watch/submissions/
 * @time: 2020/2/17 22:16
 */

public class Main {

    public List<String> readBinaryWatch(int num) {
        boolean []visited=new boolean[10];
        int []times={1,2,4,8,1,2,4,8,16,32};
        List<String> list=new ArrayList<>();
        readBinaryWatch(0,0,times,visited,num,list);
        return list;
    }

    private String timeToString(int hour,int minute){

        StringBuffer sb=new StringBuffer();

        if(minute==0&&hour==0) return sb.append("0:00").toString();

        if(minute==0) return sb.append(hour).append(":00").toString();

        if(hour==0) return minute<10?sb.append("0:0").append(minute).toString():sb.append("0:").append(minute).toString();

        return minute<10?sb.append(hour).append(":0").append(minute).toString():sb.append(hour).append(":").append(minute).toString();
    }

    private void readBinaryWatch(int hour, int minute,int[] times,boolean[] visited,int num, List<String> list) {

        if(hour>=12||minute>=60) return;

        if(num==0){
            String timeStr=timeToString(hour,minute);

            if(!list.contains(timeStr)) list.add(timeStr);

            return;
        }

        for(int i=0;i<times.length;i++){
           if(!visited[i]) {
               visited[i] = true;
               if (i < 4) hour += times[i];
               else minute += times[i];
               readBinaryWatch(hour, minute, times, visited, num-1, list);
               visited[i] = false;
               if (i < 4) hour -= times[i];
               else minute -= times[i];
           }
        }

    }

}
