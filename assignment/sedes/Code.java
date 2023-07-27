public class Code {
    public static void main(String[] args) {
        int[] a = {4,5,6,2,-1,-1,-1,7};
        BT tree = new BT(a);
        TNode cntree;
        String serialString = tree.ser();
        System.out.println(tree.ser());
        // tree.preorder(tree.root);
        cntree = tree.deser(serialString);

        preorder(cntree);

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
