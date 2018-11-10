package Leetcode;

public class SuperPow {
    public static long bigMod(long a,long n,long m){
        if(n==0){
            return 1;
        }

        if(n%2==0){
            long d = bigMod(a,n/2,m);
            return ((d%m)*(d%m))%m;
        }
        else{
            return ((a%m)*bigMod(a,n-1,m))%m;
        }
    }
    public static int superPow(int a, int[] b) {
        String pow = "";
        for(int i=0;i<b.length;i++){
            pow += Integer.toString(b[i]);
        }

        return (int) bigMod(a,Long.parseLong(pow),1337);
    }


    public static void main(String[] args) {
        System.out.println(superPow(2,new int[]{1,0}));
    }
}
