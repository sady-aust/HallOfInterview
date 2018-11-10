package LeetCode;

import java.io.*;
import java.util.*;
import java.math.*;
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {

        int sum =0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i+=2){
            sum += nums[i];

        }
        return sum;
    }

}
