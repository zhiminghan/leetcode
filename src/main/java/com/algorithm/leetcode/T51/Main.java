package com.algorithm.leetcode.T51;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 51. N皇后
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/n-queens/
 * @time: 2020/2/8 01:26
 */

public class Main {


    static int[]dirX={-1,-1,1,-1,1,0,0,1};
    static int[]dirY={0,-1,0,1,1,1,-1,-1};


    public static void main(String[] args) {
//
//      int[][] mark=new int[4][4];
//
//      new Main().putNQueen(1,1,mark);
//      new Main().print(mark);
        System.out.println(new Main().solveNQueens(4));

    }

    public void print(int[][]mark){

        for(int i=0;i<mark.length;i++) {
            for (int j = 0; j < mark.length; j++) {
                System.out.print(mark[i][j]);
            }
            System.out.println();
        }
    }

    public void init(List<String> location,int[][]mark,int n){

        for (int i=0;i<n;i++){
            StringBuffer sb=new StringBuffer();
            for (int j=0;j<n;j++){
                mark[i][j]=0;
                sb.append(".");
            }
            location.add(sb.toString());
        }
    }

    public void putNQueen(int x,int y,int[][]mark){
        mark[x][y]=1;
            for (int j = 0; j < 8; j++) {
                for(int i=1;i<mark.length;i++) {
                    int newX=x+i*dirX[j];
                    int newY=y+i*dirY[j];
                    if(newX>=0&&newY>=0&&newX<=mark.length-1&&newY<=mark.length-1) mark[newX][newY]=1;
            }
        }

    }

    public int[][] copyMark(int[][] mark){

        int n=mark.length;
        int [][]old=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                old[i][j]=mark[i][j];
            }
        }

        return old;
    }


    public List<List<String>> solveNQueens(int n) {

        int [][]mark=new int[n][n];
        List<List<String>> locations=new ArrayList<>();
        List<String> location=new ArrayList<>();
        init(location,mark,n);
        generate(0,n,mark,location,locations);
        return locations;
    }

    public void generate(int k,int n,int[][]mark,List<String> location,List<List<String>> locations){

        if(k==n){
            locations.add(location);
            return;
        }

        for (int j=0;j<n;j++){
            if(mark[k][j]==0){
                int [][] oldMark=copyMark(mark);
                char[] chars=location.get(k).toCharArray();
                char[] oldChars=copyLocation(chars);
                chars[j]='Q';
                String newStr=new String(chars);
                location.set(k,newStr);
                putNQueen(k,j,mark);
                List<String> temp=new ArrayList<>(location);
                generate(k+1,n,mark,temp,locations);
                mark=oldMark;
                String oldStr=new String(oldChars);
                location.set(k,oldStr);
            }
        }
    }

    private char[] copyLocation(char[] chars) {

        char[] old=new char[chars.length];
        for (int i=0;i<old.length;i++){
            old[i]=chars[i];
        }
        return old;
    }


}
