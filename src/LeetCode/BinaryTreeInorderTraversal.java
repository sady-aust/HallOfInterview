package LeetCode;
import java.math.*;
import java.util.*;
import java.io.*;

public class BinaryTreeInorderTraversal {

    //Definition for a binary tree node.

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Stack<TreeNode> stack = new Stack<>();

        while (root!=null){
            stack.add(root);
            root = root.left;
        }

        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();

            ans.add(temp.val);

            if(temp.right!=null){
                temp = temp.right;

                while (temp!=null){
                    stack.push(temp);
                    temp = temp.left;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode myTree = new TreeNode(1)  ;

        myTree.left = null;
        myTree.right = new TreeNode(2);
        myTree.right.left =  new TreeNode(3);

        System.out.println(inorderTraversal(myTree));
    }
}
