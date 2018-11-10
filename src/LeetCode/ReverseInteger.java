package Leetcode;

public class ReverseInteger {
    public static int reverse(int x) {

        String xS = Integer.toString(x);

        String revS = "";

        boolean hasNeg = false;

        for(int i= xS.length()-1;i>=0;i--){
            if(xS.charAt(i)=='-'){
                hasNeg = true;
                continue;
            }
            revS += xS.charAt(i);
        }

        if (hasNeg){
            revS = "-"+revS;
        }

        long val = Long.parseLong(revS);
        if(val>Integer.MAX_VALUE || val<Integer.MIN_VALUE){
            return 0;
        }


        return (int)val;

    }

    public static void main(String[] args) {


        System.out.println(reverse(1534236469));
    }
}
