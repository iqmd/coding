import java.util.LinkedList;
import java.util.Queue;

public class BT {
  
    int[] arr;
    TNode root;
    boolean bst = true;
    // String serial = "|";
    TNode marker = new TNode(-1);

    BT(int[] arr){
        this.arr = arr;
        root = new TNode(arr[0]);
        createBT(root);
    }

    TNode getBT(){
        return root;
    }

    


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

    void preorder(TNode root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    String ser(){
        return serialize(root);
    }

    String serialize(TNode root) {
        Queue<TNode> vals = new LinkedList<>();
        String serialized="";
        vals.add(root);

        while(!vals.isEmpty()){
            TNode visited = vals.remove();
            if(visited.data != -1){
                serialized += visited.data;
            }else{
                serialized += "N";
            }
            

            if(visited.left != null){
                vals.add(visited.left);
            }else{
                if(visited.data != -1)
                    vals.add(marker);
            }
            if(visited.right != null){
                vals.add(visited.right);
            }else{
                if(visited.data != -1)
                    vals.add(marker);
            }
        }

        return serialized;

    }

    TNode deser(String rt){
        Queue<TNode> vals = new LinkedList<TNode>();
        char ch = rt.charAt(0);
        int data = ch-'0';
        TNode newtree = new TNode(data);

        vals.add(newtree);

        int i=1;
        while(!vals.isEmpty() && i < rt.length()){

            TNode newNode = vals.peek();
            vals.remove();

            if(rt.charAt(i) != 'N'){
                ch = rt.charAt(i);
                data = ch-'0';
                newNode.left = new TNode(data);
                vals.add(newNode.left);
            }

            i++;
            
            if(i >= rt.length())
                break;

            if(rt.charAt(i) != 'N'){
                ch = rt.charAt(i);
                data = ch-'0';
                newNode.right = new TNode(data);
                vals.add(newNode.right);
            }
            i++;


        }
        return newtree;
    }
}
