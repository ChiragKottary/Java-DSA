package basic;

import java.util.ArrayList;
import java.util.List;

public class spiral {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(arr);

    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = cols - 1;
        int up = 0;
        int down = rows - 1;

        while(count < (cols*rows))
        {
            //traversal from left to right
            for(int col = left; col <= right; col++)
            {
                list.add(matrix[up][col]);
                count++;
            }
            //traversal from up to down
            for(int row = up + 1; row <= down; row++)
            {
                list.add(matrix[row][right]);
                count++;
            }
            //traversal from right to left
            for(int col = right - 1; col >=left; col--)
            {
                list.add(matrix[down][col]);
                count++;
            }
            //traversal from down to up
            for(int row = down - 1; row >up; row--)
            {
                list.add(matrix[row][left]);
                count++;
            }

            left++;
            right--;
            up++;
            down--;
        }
        System.out.println(list);
        return list;
    }
}
