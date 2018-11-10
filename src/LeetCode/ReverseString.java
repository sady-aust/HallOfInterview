package LeetCode;

import java.util.*;
import java.math.*;
import java.io.*;
public class ReverseString {
    public  static String reverseString(String s) {
        char[] arr = s.toCharArray();

        int i=0;
        int j= arr.length-1;
        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }



        return String.valueOf(arr);


    }

    public  static void swap(char[] arr,int i, int j){
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("A man, a plan, a canal: Panama"));
    }
}
