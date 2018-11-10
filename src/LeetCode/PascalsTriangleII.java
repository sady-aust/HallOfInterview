package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static List<Integer>[] generatePascal(int n){
        List<Integer> list[] = new ArrayList[n];

        for(int i=0;i<n;i++){
            list[i] = new ArrayList<>();
        }

        list[0].add( 1);

        if(list.length>1) {
            list[1].add(1);
            list[1].add(1);
        }

        for(int i=2;i<list.length;i++){
            list[i].add( 1);

           for(int j=1;j<list[i-1].size();j++){
               list[i].add(list[i-1].get(j)+list[i-1].get(j-1));
           }
            list[i].add( 1);
        }

        return list;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list[]= generatePascal(rowIndex+1);

        return list[rowIndex];
    }

    public static void main(String[] args) {
        System.out.println(getRow(1));
    }


}
