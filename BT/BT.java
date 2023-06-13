public class BT{
    Node root = null;
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    BT(int data[]){
       root =  buildTree(data);
    }

    static int idx = -1;

    public Node buildTree(int nodes[]){
		public void print(){
			Node curr = head;

			while(curr != null){
				System.out.println(curr.data+" ");
				curr = curr.next;
			}
		}
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node node = new Node(nodes[idx],null,null);
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);
        return node;
    }

    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }
    public void displayPreOrder(){
        preorder(root);
    }
}
