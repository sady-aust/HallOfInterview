package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        k%=nums.length;

       Reverse(nums,0,nums.length-1);
       Reverse(nums,0,k-1);
       Reverse(nums,k,nums.length-1);
    }


    public static void Reverse(int[] arr,int start,int end){
        while (start<end){

            if(start<0 || end<0|| start>arr.length-1 || end>arr.length-1){
                return;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        rotate(arr,5);
        for (Integer i:arr
             ) {

            System.out.println(i);
        }
    }

}
