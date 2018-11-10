package Leetcode;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static class ListNode {
     int val;
      ListNode next;

      ListNode(int x) {
          val = x;
      }
  }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1 = "";
        String num2 = "";

        ListNode pointer = l1;
        while (pointer!=null){
            num1 += Integer.toString(pointer.val);
           pointer = pointer.next;
        }

        pointer = l2;
        while (pointer!=null){
            num2 += Integer.toString(pointer.val);
            pointer = pointer.next;
        }

        BigInteger num1I = new BigInteger(String.valueOf(new StringBuilder(num1).reverse()));
        BigInteger num2I = new BigInteger(String.valueOf(new StringBuilder(num2).reverse()));

        StringBuilder ansS = new StringBuilder((num1I.add(num2I)).toString()).reverse();

       ListNode listNode = new ListNode(Integer.parseInt(Character.toString(ansS.charAt(0))));

        pointer = listNode;

       for(int i=1;i<ansS.length();i++){
            pointer.next = new ListNode(Integer.parseInt(Character.toString(ansS.charAt(i))));
            pointer = pointer.next;
       }

       return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        ListNode ans =  addTwoNumbers(listNode1,listNode2);

        while (ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }


}
