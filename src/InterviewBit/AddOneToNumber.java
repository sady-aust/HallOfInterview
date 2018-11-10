package InterviewBit;

import java.io.*;
import java.util.*;
import java.math.*;

public class AddOneToNumber {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        ArrayList<Integer> ans = new ArrayList<>();
        boolean hasCarry = false;

        for (int i = A.size() - 1; i >= 0; i--) {

            if (hasCarry) {
                int res = A.get(i) + 1;
                if (res >= 10) {
                    hasCarry = true;
                    ans.add(0);

                } else {
                    ans.add(res);
                    hasCarry = false;
                }
            } else {
                if (i == A.size() - 1) {
                    int res = A.get(i) + 1;
                    if (res >= 10) {
                        hasCarry = true;
                        ans.add(0);

                    } else {
                        ans.add(res);
                        hasCarry = false;
                    }
                } else {
                    ans.add(A.get(i));
                    hasCarry = false;
                }

            }


        }

        if(hasCarry){
            ans.add(1);
        }

         Collections.reverse(ans);

        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==0){
                ans.remove(i);
                i--;

            }
            else{
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(6);
        list.add(0);
        list.add(6);
        list.add(4);
        list.add(8);list.add(8);list.add(1);








        System.out.println(plusOne(list));
    }
}
