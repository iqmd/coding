public class BST{ 
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    BST(){
        root = null;
    }
    void insert(int n){
        root = insertNode(root,n);
    }
    Node insertNode(Node root, int n){
        if(root==null){
            return new Node(n);
        }
        if(n<root.data){
            //left child
            root.left = insertNode(root.left,n);
        }
        else {
            //right child
            root.right = insertNode(root.right,n);
        }
        return root;
    }
    void preOrder(){
        preOrderRecursively(root);
    }
    void inOrder(){
        inOrderRecursively(root);
    }

    void preOrderRecursively(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrderRecursively(root.left);
        preOrderRecursively(root.right);
    }
    void inOrderRecursively(Node root){
        if(root==null){
            return;
        }
        preOrderRecursively(root.left);
        System.out.println(root.data);
        preOrderRecursively(root.right);
    }
    boolean isthere(int data){
        return contains(data,root);
    }

    boolean contains(int data, Node root){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }else if(root.data < data){
            System.out.print(root.data+"->");
            return contains(data,root.right);
        }else{
            System.out.print(root.data+"->");
            return contains(data,root.right);
        }
    }
}
