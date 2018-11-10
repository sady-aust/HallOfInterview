package LeetCode;

import java.math.*;
import java.util.*;
import java.io.*;

public class BinaryTreePreorderTraversal {
    //Definition for a binary tree node.

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }


        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.peek();

            ans.add(temp.val);
            stack.pop();

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }


        }

        return ans;


    }

    public static void main(String[] args) {
        TreeNode myTree = new TreeNode(3)  ;

        myTree.left = new TreeNode(1);
        myTree.right = new TreeNode(2);


        preorderTraversal(myTree);
    }


}
