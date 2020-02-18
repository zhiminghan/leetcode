package com.alogrithm.leetcode.T36;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 36. 有效的数独
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/valid-sudoku/
 * @time: 2020/2/18 15:53
 */

public class Main {

    final String rowName="row";
    final String columnName="column";


    public boolean isValidSudoku(char[][] board) {

        Map<String,Map<Character,Integer>> total=new HashMap<>();
        int rows=board.length;
        int columns=board.length;

        for(int i=0;i<rows;i++){
            Map<Character,Integer> rowMap=new HashMap<>();
            for (int j=0;j<columns;j++){
                if(board[i][j]!='.'&&rowMap.containsKey(board[i][j])) return false;
                if(board[i][j]!='.') rowMap.put(board[i][j],1);
            }
            total.put(rowName+i,rowMap);
        }

        for(int j=0;j<columns;j++){
            Map<Character,Integer> columnMap=new HashMap<>();
            for (int i=0;i<rows;i++){
                if(board[i][j]!='.'&&columnMap.containsKey(board[i][j])) return false;
                if(board[i][j]!='.') columnMap.put(board[i][j],1);
            }
            total.put(columnName+j,columnMap);
        }

        for (int k=0;k<9;k++) {
            Map<Character,Integer> map=new HashMap<>();
            for (int i = 0; i < rows / 3; i++) {
                for (int j = 0; j < columns / 3; j++) {
                    int rowOffSet=(k/3)*3;
                    int columnOffSet=(k%3)*3;
                    if(board[i+rowOffSet][j+columnOffSet]!='.'&&map.containsKey(board[i+rowOffSet][j+columnOffSet])) return false;
                    if(board[i+rowOffSet][j+columnOffSet]!='.') map.put(board[i+rowOffSet][j+columnOffSet],1);
                }
            }
        }
        return true;
    }
}
