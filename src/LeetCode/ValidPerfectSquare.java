package Leetcode;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        int sum =0;
        for(int i=1;i<=Math.ceil(num/2.0);i++){
            sum+=i;
            if(i*i==num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
}
