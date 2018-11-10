package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P234 {

    public static class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }

    public static boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        List<Integer> list = new ArrayList<>();

            while (head!=null){
               list.add(head.val);
                head = head.next;
            }

           int start =0;
            int end = list.size()-1;

            while (start<list.size()-1 && end>=0){
                if(list.get(start)-list.get(end)!=0){

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
        ListNode a = new ListNode(-129);
        ListNode b = new ListNode(-129);
        a.next = b;

        System.out.println(isPalindrome(a));
    }

}
