package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestNumberAtLeastTwiceofOthers {
    public static int dominantIndex(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        Arrays.sort(nums);

        boolean isAtLeasttwice = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                continue;
            }
            else{
                if( nums[nums.length-1]/(double)nums[i]>=2){

                }
                else{
                    isAtLeasttwice = false;
                }
            }
        }

        return isAtLeasttwice?map.get(nums[nums.length-1]):-1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,16,35,44,100,27,0};

        System.out.println(dominantIndex(arr));
    }
}
