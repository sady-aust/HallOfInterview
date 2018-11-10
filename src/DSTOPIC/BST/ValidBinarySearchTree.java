package DSTOPIC.BST;

/*
* Check if the given three is valid BST or not.
*
* @Condition of valid BST
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
* */

import java.util.ArrayList;
import java.util.List;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class ValidBinarySearchTree {
   static List<Integer>  list = new ArrayList<>();
    public static class TreeNode {
        int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }


    public static boolean isValidBST(TreeNode root) {
        list.clear();
        InOrderTraversal(root);

        if(root == null){
            return true;
        }

        if(list.size()==1){
            return true;
        }

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }

        return true;

    }
    public static void InOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }

        InOrderTraversal(root.left);

        list.add(root.val);
        InOrderTraversal(root.right);
    }




    public static void main(String[] args) {
        TreeNode tree = new TreeNode(0);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);

        System.out.println(isValidBST(tree));
    }

}
