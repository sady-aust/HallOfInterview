package Leetcode;

public class FirstBadVersion {

    public static int firstBadVersion(char[] arr){
        int start=0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]=='B'){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        char[] arr ={'G','G','B','B','B','B'};
        System.out.println(firstBadVersion(arr));
    }
}
