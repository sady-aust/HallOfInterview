package LeetCode;

import java.io.*;
import java.math.*;
import java.util.*;
public class ReverseWordsinaString {
    public static String reverseWords(String s) {
        if(s==null ||s.length()==0){
            return s;
        }

        String[] arr = s.split(" ");
        String ans = "";

       for(int i= arr.length-1;i>=0;i--){
           if(!arr[i].equals("")){
               ans = ans.concat(arr[i]+" ");
           }
       }

       return ans.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   a   b "));
    }
}
