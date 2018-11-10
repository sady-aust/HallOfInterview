package LeetCode;

import java.util.*;
import java.math.*;
import java.io.*;
public class PascalTriangleII {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if(numRows<0 || numRows==0){
            return new ArrayList<>();
        }
        else if(numRows==1){
            ans.add(Arrays.asList(1));
            return ans;
        }
        else if(numRows==2){
            ans.add(Arrays.asList(1));
            ans.add(Arrays.asList(1,1));
            return ans;
        }
        else{
            ans.add(Arrays.asList(1));
            ans.add(Arrays.asList(1,1));
            int temp = numRows-1;
            for(int i =1;i<numRows-1;i++){
                List<Integer> operationArray = ans.get(i);
                List<Integer> myArray = new ArrayList<>();

                for(int j = 0; j<operationArray.size(); j++){
                    if(j-1<0){
                        myArray.add(1);
                    }
                    else{
                        myArray.add(operationArray.get(j)+operationArray.get(j-1));
                    }


                }
                myArray.add(1);

                ans.add(myArray);
            }

            return ans;
        }




    }

    public static List<Integer> getRow(int rowIndex) {
        return generate(rowIndex+1).get(rowIndex);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println(getRow(sc.nextInt()));
    }
}
