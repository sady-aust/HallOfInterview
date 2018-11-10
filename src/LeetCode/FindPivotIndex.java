package Leetcode;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {


        for(int i=0;i<nums.length;i++){
            int leftSum = getLeftSum(nums,i);
            int rightSum = getRightSum(nums,i);

            if(leftSum == rightSum){

                return i;

            }
        }
        return  -1;

    }

    public static int getLeftSum(int[] num,int index){
        int total = 0;

        for(int i=index-1;i>=0;i--){
            total +=num[i];
        }

        return total;
    }

    public static int getRightSum(int[] num,int index){
        int total = 0;

        for(int i=index+1;i<num.length;i++){
            total +=num[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr ={1, 2,3};

        System.out.println(pivotIndex(arr));
    }
}
