package Leetcode;

import java.util.*;

public class P387 {
    public static int firstUniqChar(String s) {

        Set<Character> set = new LinkedHashSet<>();

        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        Iterator<Character> it =set.iterator();
        while (it.hasNext()){
            int count =0;

            char c = it.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c){
                    count++;
                }
            }

            if(count ==1){
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)==c){
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
