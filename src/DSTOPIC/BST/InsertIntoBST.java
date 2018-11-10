package DSTOPIC.BST;

public class InsertIntoBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;TreeNode(int x)
        {
            val = x;
        }
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {

        TreeNode parent = getTheParentNode(root, val);

        if(val<parent.val){
            parent.left = new TreeNode(val);
        }
        else{
            parent.right = new TreeNode(val);
        }

        return root;
    }

    /**
    * @Return the parent node where the value will be inserted
    * */

    public static TreeNode getTheParentNode(TreeNode root, int val){
        TreeNode parent = root;

        while (parent!=null){
            if(val<parent.val){
                if(parent.left==null){
                    return parent;
                }
                else{
                    parent = parent.left;
                }
            }
            else {
                if(parent.right==null){
                    return parent;
                }
                else{
                    parent = parent.right;
                }
            }
        }

        return null;

    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left =new TreeNode(1);
        tree.left.right =new TreeNode(3);
        tree.right = new TreeNode(7);

        System.out.println(insertIntoBST(tree,5).val);
    }
}
