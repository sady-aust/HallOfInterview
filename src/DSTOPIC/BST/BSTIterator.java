/*
* Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
  Calling next() will return the next smallest number in the BST.
Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
*
* */

package DSTOPIC.BST;


import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
  //  Definition for binary tree
  public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;TreeNode(int x)
      {
          val = x;
      }
  }

 static List<Integer> list= new ArrayList<>();

  int pointer =0;

    public BSTIterator(TreeNode root) {
      list.clear();
      pointer = 0;

        InOrderTraversal(root);
    }


    public static void InOrderTraversal(TreeNode root){
        if (root ==null){
            return;
        }
        InOrderTraversal(root.left);

        list.add(root.val);
        InOrderTraversal(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(pointer<list.size()){
            return true;
        }
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        int val = list.get(pointer);
        pointer++;
        return val;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);

        BSTIterator it = new BSTIterator(tree);

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
