package InterviewBit;
import java.io.*;
import java.util.*;
import java.math.*;

public class MinStepsinInfiniteGrid {

    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int[] a = new int[A.size()];
        int[] b = new int[B.size()];

        for(int i=0;i<A.size();i++){
            a[i] = A.get(i);
        }
        for(int i=0;i<B.size();i++){
            b[i] = B.get(i);
        }

        int steps=0;

        for(int i=0;i<a.length-1;i++) {
            int disA = a[i + 1] - a[i];
            int disB = b[i + 1] - b[i];

            if(a[i]<disA && b[i]<disB){
                while (a[i]!=disA && b[i]!=disB){
                    a[i]++;
                    b[i]++;
                }
            }
        }

        return  steps;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(-7);
        a.add(-13);


        ArrayList<Integer> b = new ArrayList<>();

        b.add(1);
        b.add(-5);


        System.out.println(coverPoints(a,b));
    }

}
