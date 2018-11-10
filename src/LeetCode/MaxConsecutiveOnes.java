package LeetCode;

import java.util.*;
import java.math.*;
import java.io.*;
public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> numberOfConsecutiveOnes = new ArrayList<>();

        int ans = 0;
        int count =0;
        for (Integer i:nums){
            if(i==1){
                count++;
            }
            else {
                ans = Math.max(ans,count);
                count =0;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
