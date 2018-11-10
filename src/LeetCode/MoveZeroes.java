package LeetCode;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

      for (int i = 0; i<nums.length; i++){
        int j = i-1;

        if(nums[i]!=0){
            while (j>=0 && nums[j]==0){
                int temp = nums[j];
                nums[j] = nums[i];

                nums[i] = temp;
                i =j;
                j--;
            }
        }
      }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
