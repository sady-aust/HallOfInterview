package Leetcode;

public class ProblemNo69 {

    /*public int mySqrt(int x) {

        long i=1;
        long res = i*i;
        while (res<=x){
            i++;
            res = i*i;
        }

        return (int)i-1;
    }*/

    public static int mySqrt(int x) {

        if(x==0 || x==1){
            return x;
        }
        int start =1;
        int end = x;

        int ans = -1;

        while (start<=end){
            int mid = (start+end)/2;

            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid<x){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
