package BST;

public class TNode {
    int data;
    TNode left;
    TNode right;

    TNode(int val){
        data = val;
    }

    TNode(int val , TNode left, TNode right){
        data = val;
        this.left = left;
        this.right = right;
    }

}
