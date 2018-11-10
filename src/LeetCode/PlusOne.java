package Leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
       boolean hasCarry = false;

        List<Integer> list = new ArrayList<>();

        for(int i=digits.length-1;i>=0;i--){
            if(hasCarry){
                int a = digits[i]+1;

                if(a>=10){
                    hasCarry = true;
                    list.add(0);
                }
                else{
                    list.add(a);
                    hasCarry = false;
                }
            }
            else{
                if(i==digits.length-1){
                    int a = digits[i]+1;
                    if(a>=10){
                        hasCarry = true;
                        list.add(0);
                    }
                    else{
                        list.add(a);
                        hasCarry = false;
                    }
                }
                else{
                    list.add(digits[i]);
                    hasCarry = false;

                }
            }
        }

        if(hasCarry){
            list.add(1);

        }

        int[] ans = new int[list.size()];

        int j=0;
        for(int i=list.size()-1;i>=0;i--){
            ans[j++] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={8,9,9,9};
        plusOne(arr);
    }
}
