package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i=0;i<numbers.length;i++){

            int searchNum = target-numbers[i];

            int index = binarySearch(numbers,searchNum,i);



            if(index>-1){
                ans[0] = i+1;
                ans[1] = index+1;
                break;
            }
        }

        return ans;

    }

    public static int binarySearch(int[] arr, int num,int index){
        int loc = -1;
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;


            if(mid==index){
                if(arr[mid]>num){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
                continue;
            }
            if(arr[mid]==num){
                loc = mid;
                break;
            }

            if(arr[mid]>num){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return loc;
    }

    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{1,2,3,4,4,9,56,90},8);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
