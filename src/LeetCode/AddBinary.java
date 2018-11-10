package LeetCode;

import java.math.BigInteger;

public class AddBinary {
    public static String  addBinary(String a, String b) {
       if(a.length()<b.length()){
           int min = b.length()-a.length();

           String zero = "";
           for (int i=1;i<=min;i++){
               zero+="0";
           }
           a = zero+a;

           String res = "";
           boolean hasCarry = false;

           for (int i= a.length()-1;i>=0;i--){
               if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                   if(hasCarry){
                       res = "1"+res;
                       hasCarry = false;
                   }
                   else{
                       res = "0"+res;
                   }
               }
               else if(a.charAt(i)=='0' && b.charAt(i)=='1'){
                   if(hasCarry){
                       res = "0"+res;
                       hasCarry = true;
                   }
                   else{
                       res = "1"+res;
                   }
               }

               else if(a.charAt(i)=='1' && b.charAt(i)=='0'){
                   if(hasCarry){
                       res = "0"+res;
                       hasCarry = true;
                   }
                   else{
                       res = "1"+res;
                   }
               }
               else if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                   if(hasCarry){
                       res = "1"+res;
                       hasCarry = true;
                   }
                   else{
                       res = "0"+res;
                       hasCarry = true;
                   }
               }
           }
           if(hasCarry){
               res = "1"+res;
           }

           return res;
       }
       else {
               int min = a.length()-b.length();

               String zero = "";
               for (int i=1;i<=min;i++){
                   zero+="0";
               }
               b = zero+b;

               String res = "";
               boolean hasCarry = false;

               for (int i= a.length()-1;i>=0;i--){
                   if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                       if(hasCarry){
                           res = "1"+res;
                           hasCarry = false;
                       }
                       else{
                           res = "0"+res;
                       }
                   }
                   else if(a.charAt(i)=='0' && b.charAt(i)=='1'){
                       if(hasCarry){
                           res = "0"+res;
                           hasCarry = true;
                       }
                       else{
                           res = "1"+res;
                       }
                   }

                   else if(a.charAt(i)=='1' && b.charAt(i)=='0'){
                       if(hasCarry){
                           res = "0"+res;
                           hasCarry = true;
                       }
                       else{
                           res = "1"+res;
                       }
                   }
                   else if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                       if(hasCarry){
                           res = "1"+res;
                           hasCarry = true;
                       }
                       else{
                           res = "0"+res;
                           hasCarry = true;
                       }
                   }
               }

           if(hasCarry){
               res = "1"+res;
           }

           return res;
           }

    }

    public static long getDecimel(String num){
        char[] arr = num.toCharArray();

        long sum = 0;
        for(int i= arr.length-1;i>=0;i--){
            sum += (arr[i]-'0')*Math.pow(2,arr.length-1-i);
        }

        return sum;
    }

    public static String getBinary(long n){
        String x = "";
        while (n>0){
            int a = (int) (n%2);

            x+= a;
            n/=2;
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));
    }

}

