package Leetcode;

public class R125 {
    static boolean isAlphaNumeric(char c){
        if((c>='a' && c<='z') || (c>='0'&& c<='9')){
            return true;
        }

        return false;
    }

    public static boolean isPalindrome(String s) {

       if(s.equals(null) || s.length()==0){
           return true;
       }

       int start =0;
       int end = s.length()-1;
       s = s.toLowerCase();

       while (start!=s.length()-1 && end>=0){

          if(!isAlphaNumeric(s.charAt(start))){
              start++;
              continue;

          }
          if(!isAlphaNumeric(s.charAt(end))){
              end--;
              continue;
          }

          if(s.charAt(start)!=s.charAt(end)){
              return false;
          }
          else{
              start++;
              end--;
          }
       }

       return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }


}
