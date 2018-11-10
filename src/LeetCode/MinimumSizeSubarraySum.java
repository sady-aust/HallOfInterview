package LeetCode;

import java.util.*;
import java.math.*;
import java.io.*;
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int s, int[] nums) {

       if(nums==null || nums.length==0){
           return  0;
       }

       int start = 0,end =0,minLen = Integer.MAX_VALUE;

       long sum = 0;
       for(end=0; end<nums.length; end++){
           sum += nums[end];

           while (sum>=s && start<nums.length){
               sum-=nums[start];
               minLen = Integer.min(minLen,end-start+1);
               start++;
           }
       }

       return  minLen==Integer.MAX_VALUE?0:minLen;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
}
