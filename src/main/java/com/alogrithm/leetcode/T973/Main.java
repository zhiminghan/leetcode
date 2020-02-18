package com.alogrithm.leetcode.T973;

import java.util.*;

/**
 * @description: 973. 最接近原点的 K 个点
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/k-closest-points-to-origin/
 * @time: 2020/2/19 01:39
 */

public class Main {

    public static void main(String[] args) {
        Point p1=new Point(1,2);
        Point p2=new Point(1,2);
        Map<Point,Integer> map=new HashMap<>();
        map.put(p1,1);
        map.put(p2,1);
        System.out.println(map.size());

    }

   static class Point{

       int x;
       int y;
       public Point(int x,int y){
           this.x=x;
           this.y=y;
       }

       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (!(o instanceof Point)) return false;
           Point point = (Point) o;
           return x == point.x &&
                   y == point.y;
       }

       @Override
       public int hashCode() {
           return Objects.hash(x, y);
       }
   }

    public int[][] kClosest(int[][] points, int K) {


        Map<Point,Integer> map=new HashMap<>();
        for(int i=0;i<points.length;i++) {
            int x=points[i][0];
            int y=points[i][1];
            int sum = x*x+y*y;
            map.put(new Point(x,y),sum);
        }


        PriorityQueue<Point> heap = new PriorityQueue<Point>(K, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });

        for(int i=0;i<points.length;i++){
            Point p=new Point(points[i][0],points[i][1]);
            if(heap.size()<K) heap.offer(p);
            else if((map.get(heap.peek())>map.get(p))){
                heap.poll();
                heap.offer(p);
            }
        }
        int [][] rs=new int[K][2];
        int i=0;
        while(!heap.isEmpty()){

            Point p=heap.poll();
            rs[i][0]=p.x;
            rs[i][1]=p.y;
            i++;

        }
        return rs;
    }
}
