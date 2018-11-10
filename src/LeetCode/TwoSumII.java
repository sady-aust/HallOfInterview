package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumII {
    public static int BinarySearch(int[] number,int val,int ignoreindex){
        int index =-1;
        int start =0;
        int end  = number.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if(number[mid]==val && mid!=ignoreindex){
                index = mid;
                break;
            }
            else if(number[mid]<val){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return index;
    }


    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        for (int i=0;i<numbers.length;i++){
            int search = target-numbers[i];
            int anotherIndex = BinarySearch(numbers,search,i);

            if(anotherIndex!=-1){
                ans[0] = i+1;
                ans[1] = anotherIndex+1;
            }
        }
        Arrays.sort(ans);

        return ans;

    }

    public static void main(String[] args) {

        int[] myarr = {2,7,11,15};
        int[] ans = twoSum(myarr,9);


        System.out.println(ans[0]+" "+ans[1]);



    }
}
