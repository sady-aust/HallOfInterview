package LeetCode;

public class ImplementstrStr {
    public static int strStr(String haystack, String needle) {
            if(needle.equals("")){
                return 0;
            }
            else if(haystack.equals("")){
                return -1;
            }
            else{
                int needleLength = needle.length();

                for(int i=0;i<haystack.length();i++){
                    String test = getnLengthString(i,needleLength,haystack);

                    if(test == null){
                        return -1;
                    }

                    if(test.equals(needle)){
                        return i;
                    }
                }

                return -1;
            }
    }

    public static String getnLengthString(int start,int n,String test){
       if(start+n>test.length()){
           return null;
       }
       else {
           return test.substring(start,start+n);
       }
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
