package Leetcode;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int pos = binarySearch(nums,target);
        if(pos==-1){
            int index =0;
            while (nums[index]<target){
                index++;
                if(index>nums.length-1){
                    break;
                }
            }
            return index;
        }
        else {
            return pos;
        }
    }

    public static int binarySearch(int[] nums,int trg){
        int start =0;
        int end = nums.length-1;

        int loc = -1;

        while (start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==trg){
                loc = mid;
                break;
            }
            else if(nums[mid]>trg){
                end = mid-1;
            }
            else{
                start = mid+1;
            }


        }
        return loc;
    }

    public static void main(String[] args) {
        int arr[] ={1,3,5,6};
        System.out.println(searchInsert(arr,0));
    }
}
