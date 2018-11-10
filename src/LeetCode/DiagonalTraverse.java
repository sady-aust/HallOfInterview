package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] matrix) {

        List<Integer> ansArray = new ArrayList<>();
        boolean up = true;
        int row = matrix.length;

        if (row == 0) {
            int[] ans = new int[0];
            return ans;
        }
        int column = matrix[0].length;

        int[] ans = new int[row * column];


        for (int k = 0; k < row; k++) {
            List<Integer> list = new ArrayList<>();
            int i = k;
            int j = 0;

            while (i >= 0 && j < column) {
                list.add(matrix[i][j]);
                i--;
                j++;
            }

            if (up) {
                for (int a = 0; a < list.size(); a++) {
                    ansArray.add(list.get(a));
                }
            } else {
                for (int a = list.size() - 1; a >= 0; a--) {
                    ansArray.add(list.get(a));
                }
            }

            up = up ? false : true;
        }

        for (int k = 1; k < column; k++) {
            List<Integer> list = new ArrayList<>();
            int i = row - 1;
            int j = k;

            while (j < column && i >= 0) {
                list.add(matrix[i][j]);
                i--;
                j++;


            }

            if (up) {
                for (int a = 0; a < list.size(); a++) {
                    ansArray.add(list.get(a));
                }
            } else {
                for (int a = list.size() - 1; a >= 0; a--) {
                    ansArray.add(list.get(a));
                }
            }

            up = up ? false : true;
        }

        for (int i = 0; i < ansArray.size(); i++) {
            ans[i] = ansArray.get(i);
        }

        return ans;

    }


    public static void main(String[] args) {

        int[][] arr = {{3}, {2}};

        int[] ans = findDiagonalOrder(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
