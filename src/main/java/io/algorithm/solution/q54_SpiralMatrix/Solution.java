package io.algorithm.solution.q54_SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jian.liu
 * @Description //0054 螺旋矩阵
 * @Date: 2022/1/10 10:29
 */
public class Solution {

   public List<Integer> spiralOrder(int[][] matrix){
       List<Integer> rs = new ArrayList<Integer>();

       if(matrix.length == 0 || matrix[0].length == 0){
           return rs;
       }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];

        int i =0;
        int j =0;
        int direction =1;
        while(true){
            if(i<0 || j<0 || i == m || j == n || visited[i][j]){
                break;
            }
            rs.add(matrix[i][j]);
            visited[i][j] = true;

            switch(direction){
                case 1:
                    if(j+1 == n || visited[i][j +1]){
                        i++;
                        direction = 2;
                    } else {
                        j++;
                    }
                    break;
                case 2:
                    if(i+1 == m || visited[i+1][j]){
                        j--;
                        direction = 3;
                    } else {
                        i++;
                    }
                    break;
                case 3:
                    if(j ==0 || visited[i][j-1]){
                        i--;
                        direction = 4;
                    }else{
                        j--;
                    }
                    break;
                case 4:
                    if(visited[i-1][j]){
                        j++;
                        direction = 1;
                    }else{
                        i--;
                    }
                    break;
                default:
                    break;
            }

        }
        return rs;


   }


    public static void main(String[] args) {
        System.out.println(new Solution().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }


}
