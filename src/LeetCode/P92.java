package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P92 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode ans = null;
        ListNode tail = null;


        List<Integer> list = new ArrayList<>();

        ListNode check = head;

        while (head!=null){
            list.add(head.val);
            head = head.next;
        }

        if(list.size()==1){
            return check;
        }

        ListNode myListNode = new ListNode(list.get(n-1));

        ListNode pointer = myListNode;
        for(int i=n-2;i>=m-1;i--){
            pointer.next = new ListNode(list.get(i));
            pointer = pointer.next;

        }
        tail = pointer;




        if(m-1>=0){
            ListNode headerList = new ListNode(list.get(0));

            pointer = headerList;
            for(int i=1;i<=(m-1);i++){
                pointer.next = new ListNode(list.get(i));
                pointer = pointer.next;
            }

            headerList.next = myListNode;
            ans = headerList;
        }

        if(n<list.size()){
            ListNode tailNode = new ListNode(list.get(n));

            pointer = tailNode;
            for(int i=n+1;i<list.size();i++){
                pointer.next = new ListNode(list.get(i));
                pointer = pointer.next;
            }
            tail.next = tailNode;
        }



        return ans;



    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(5);
a.next = b;



        reverseBetween(a,1,1);
    }
}
