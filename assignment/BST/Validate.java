package BST;

public class Validate {
    boolean bst = true;
    public static void main(String args[]){
        int a[] = {5,1,4,-1,-1,3,6};
        BT tree = new BT(a); 
        // preorder(tree.getBT());
        
        int m = tree.checkBST(tree.getBT());
        System.out.println(tree.bst);

    }
    static void preorder(TNode root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

}
