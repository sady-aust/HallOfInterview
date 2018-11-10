package LeetCode;

import java.util.*;
import java.math.*;
import java.io.*;
public class ReverseWordsinaStringIII {

    public static String reverseWords(String s) {
            String[] arr = s.split(" ");

            String ans = "";

        for (String myString: arr) {

            ans = ans.concat(reverseString(myString)+" ");


        }

        return ans.trim();
    }

    public static String reverseString(String s){
        char[] arr = s.toCharArray();
        String ans = "";

        for(int i=arr.length-1;i>=0;i--){
            ans += arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

}
