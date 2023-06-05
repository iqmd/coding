class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return equals(p) == equals(q);
    }

    int equals(TreeNode root){
       if(root == null) return 0;

       equals(root.left);
       equals(root.right);
       return root.val;

    }
}
