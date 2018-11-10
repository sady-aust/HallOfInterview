package DSTOPIC.BST;

public class SearchingInBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;TreeNode(int x)
        {
            val = x;
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {


        while (root!=null){
            if(root.val==val){
                return root;
            }

            else if (val<root.val){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);

        TreeNode ans = searchBST(tree,3);

        System.out.println(ans.val);
    }
}
