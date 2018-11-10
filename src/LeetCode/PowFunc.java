package Leetcode;

public class PowFunc {
    public static double pow(double x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }

        double temp = pow(x,n/2);

        if(n%2==0){
            return temp*temp;
        }
        else{

           return x*temp*temp;

        }
    }

    public static double myPow(double x, int n) {


           if (n>=0){
               return pow(x,n);
           }
           else{
               return 1.0/pow(x,n);
           }


    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0,10));
    }
}
