package com.alogrithm.leetcode.T37;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 37. 解数独
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/sudoku-solver/
 * @time: 2020/2/18 18:00
 */

public class Main {

    final String rowName="row";
    final String columnName="column";
    final String sudoName="childSudo";
    final char[] nums={'1','2','3','4','5','6','7','8','9'};

    Map<String, Map<Character,Integer>> total=new HashMap<>();

    public void solveSudoku(char[][] board) {

        initRowAndColumn(board);
        int n=board.length;
        char[][] oldBoard=new char[n][n];
        copy(oldBoard,board);
        fillSudoku(board,oldBoard);
        print(board);

    }
    public void print(char[][] board) {

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void copy(char[][] oldBoard,char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                oldBoard[i][j]=board[i][j];
            }
        }
    }


        private void fillSudoku( char[][] newBoard,char[][] board) {
        int rows=board.length;
        int columns=board.length;

        for (int k=0;k<9;k++) {
            Map<Character,Integer> map=total.get(sudoName+k);
            if(map.size()==9) continue;
            for (int i = 0; i < rows / 3; i++) {
                for (int j = 0; j < columns / 3; j++) {
                    int rowOffSet=(k/3)*3;
                    int columnOffSet=(k%3)*3;
                    int row=i+rowOffSet;
                    int column=j+columnOffSet;
                    Map<Character,Integer> rowMap=total.get(rowName+row);
                    Map<Character,Integer> columnMap=total.get(columnName+column);
                    if(board[row][column]=='.'){
                        for (int n=0;n<nums.length;n++){
                            if (!rowMap.containsKey(nums[n])&&!columnMap.containsKey(nums[n])&&!map.containsKey(nums[n])){
                                board[row][column]=nums[n];
                                map.put(nums[n],1);
                                rowMap.put(nums[n],1);
                                columnMap.put(nums[n],1);
                                fillSudoku(newBoard,board);
                                map.remove(nums[n]);
                                rowMap.remove(nums[n]);
                                columnMap.remove(nums[n]);
                                board[row][column]='.';
                            }
                        }
                        return;

                    }
                }
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.') return;
            }
        }

        copy(newBoard,board);


    }

    private void initRowAndColumn(char[][] board) {
        int rows=board.length;
        int columns=board.length;

        for(int i=0;i<rows;i++){
            Map<Character,Integer> rowMap=new HashMap<>();
            for (int j=0;j<columns;j++){
                if(board[i][j]!='.') rowMap.put(board[i][j],1);
            }
            total.put(rowName+i,rowMap);
        }

        for(int j=0;j<columns;j++){
            Map<Character,Integer> columnMap=new HashMap<>();
            for (int i=0;i<rows;i++){
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
                    if(board[i+rowOffSet][j+columnOffSet]!='.') map.put(board[i+rowOffSet][j+columnOffSet],1);
                }
            }
            total.put(sudoName+k,map);
        }

    }

}
