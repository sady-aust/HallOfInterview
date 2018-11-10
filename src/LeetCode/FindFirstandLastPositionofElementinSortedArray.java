package Leetcode;

public class FindFirstandLastPositionofElementinSortedArray {
    public static int binarySearch(int[] arr,int trgt){
        int start =0;
        int end = arr.length-1;
        int loc = -1;
        while (start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==trgt){
                loc = mid;
                break;
            }
            else if(arr[mid]<trgt){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return loc;
    }
    public static int[] searchRange(int[] nums, int target) {

        int pos = binarySearch(nums,target);
        int[] ans = {-1,-1};

        if(pos==-1){
            return ans;
        }
        else{
            int temp = pos;

            while (temp>=0 && nums[temp]==target){
                temp--;
            }

            ans[0] = temp+1;

            temp = pos;

            while (temp<nums.length && nums[temp]==target){
                temp++;
            }
            ans[1] = temp -1;

            return ans;
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};

        int[] ans = searchRange(arr,6);

        System.out.println(ans[0]+" "+ans[1]);
    }

}
