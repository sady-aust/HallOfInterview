package LeetCode;

import java.util.*;
import java.math.*;
import java.io.*;
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length==0){
            return "";
        }
        String ans = "";

        int minLength = Integer.MAX_VALUE;

        for (int i=0;i<strs.length;i++){
            minLength = Integer.min(minLength,strs[i].length());
        }

        for(int i=0;i<minLength;i++){
           char check = strs[0].charAt(i);

           boolean isSame = true;
           for(int j = 1;j<strs.length;j++){
               if(strs[j].charAt(i)!=check){
                   isSame = false;
               }
           }

           if(isSame){
               ans+=check;
           }
           else{
               break;
           }
        }

        return ans;

    }

    public static void main(String[] args) {
        String[] arr = {};
        System.out.println(longestCommonPrefix(arr));
    }
}

