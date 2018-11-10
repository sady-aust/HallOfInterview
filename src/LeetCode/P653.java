package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P653 {
    //  Definition for binary tree
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;TreeNode(int x)
        {
            val = x;
        }
    }

    static List<TreeNode> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {

        list.clear();
        inOrder(root);

        int[] arr = new int[list.size()-1];



        for (int i=0;i<list.size();i++){
            int trgt = k-list.get(i).val;

            if(search(root,trgt,list.get(i))){
                return true;
            }
        }

        return false;
    }

    static boolean search(TreeNode root,int num,TreeNode index){
        while (root!=null){
            if(root.val==num && index!=root){
                return true;
            }
            else if(num<root.val){
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return false;

    }

    static void inOrder(TreeNode root){
        if (root== null){
            return;
        }

        inOrder(root.left);
        list.add(root);
        inOrder(root.right);
    }


}
