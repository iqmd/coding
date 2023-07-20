package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BT {
    
    int[] arr;
    TNode root;
    boolean bst = true;

    BT(int[] arr){
        this.arr = arr;
        root = new TNode(arr[0]);
        createBT(root);
    }

    TNode getBT(){
        return root;
    }

    

    // void createBT(int i,TNode root){
    //     if(2*i+2  == arr.length - 1 && 2*i+1 == arr.length -2){
    //         root.left = new TNode(arr[2 * i + 1]);
    //         root.right = new TNode(arr[2 * i + 2]);

    //     }else if(2*i+2 < arr.length){
    //         if(arr[2*i+1] == -1){
    //             root.left = null;
    //             return;
    //         }
    //         if(arr[2*i+2] == -1){
    //             root.right = null;
    //             return;
    //         }
    //         root.left = new TNode(arr[2 * i + 1]);
    //         root.right = new TNode(arr[2 * i + 2]);
    //         createBT(2 * i + 1, root.left);
    //         createBT(2 * i + 2, root.right);
    //     }

    // }

    void createBT(TNode root){
        Queue<TNode> vals = new LinkedList<TNode>();
        vals.add(root);

        int i=1;
        while(!vals.isEmpty() && i < arr.length){

            TNode rt = vals.peek();
            vals.remove();

            if(arr[i] != -1){
                rt.left = new TNode(arr[i]);
                vals.add(rt.left);
            }

            i++;
            
            if(i >= arr.length)
                break;

            if(arr[i] != -1){
                rt.right = new TNode(arr[i]);
                vals.add(rt.right);
            }
            i++;


        }

    }


    int checkBST(TNode root){
        if(root == null){
            return 0;
        }

        int left = checkBST(root.left);
        int right = checkBST(root.right);

        if(left == 0){
            left = Integer.MIN_VALUE;
        }
        if(right == 0){
            right = Integer.MAX_VALUE;
        }

        if(right < root.data || left > root.data){
            bst = false;
        }
        return root.data;
    }
}
