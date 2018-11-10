package LeetCode;

public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        int lastInsertIndex = 0;
        for (int i=0;i<nums.length;i++){

           while (i+1<nums.length && nums[i]==nums[i+1]){
               i++;
           }

           nums[lastInsertIndex] = nums[i];
           lastInsertIndex++;
        }

        return lastInsertIndex;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
