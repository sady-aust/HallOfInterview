package LeetCode;

import java.math.*;
import java.util.*;
import java.io.*;

public class BinaryTreePostorderTraversal {

    //Definition for a binary tree node.

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

       Stack<TreeNode> firstStack = new Stack<>();
       Stack<TreeNode> secondStack = new Stack<>();

       firstStack.push(root);

       while (!firstStack.isEmpty()){
           TreeNode temp = firstStack.pop();
           secondStack.push(temp);

           if(temp.left!=null){
               firstStack.push(temp.left);
           }

           if(temp.right!=null){
               firstStack.push(temp.right);
           }
       }

       while (!secondStack.isEmpty()){
           ans.add(secondStack.pop().val);
       }

       return ans;

    }

    public static void main(String[] args) {
        TreeNode myTree = new TreeNode(1)  ;

        myTree.left = null;
        myTree.right = new TreeNode(2);
        myTree.right.left =  new TreeNode(3);

        System.out.println(postorderTraversal(myTree));
    }
}
