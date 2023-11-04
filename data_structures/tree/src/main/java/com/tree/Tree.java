package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    private boolean bst = false;

    Tree(boolean bst){
        this.bst = bst;
    }

    Tree(){
    }
    class Node{

        int data;
        Node left = null;
        Node right = null;

        Node(int data){
            this.data = data;
        }
        Node(){

        }
    }

    Node root = null;

    public void add(int data){

        if(root == null){
            root = new Node(data);
        }else if(!bst){
            addNode(root,data);
        }else{
           root = bst(data,root);
        }
    }

    public Node bst(int data,Node root){
        if(root == null){
            return new Node(data);
        }
        if(root.data < data){
            root.right = bst(data,root.right);
        }else{
            root.left = bst(data,root.left);
        }
        return root;
    }


    private void addNode(Node root,int data){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            Node node = queue.poll();

            if(node.left == null){
                node.left = new Node(data);
                break;
            }else{
                queue.add(node.left);
            }

            if(node.right == null){
                node.right = new Node(data);
                break;
            }else{
                queue.add(node.right);
            }
        }
    }

    public void print(){
        traverse(root,0);
    }

    private void traverse(Node root,int l){
        if(root == null){
            return;
        }

        traverse(root.left,l+1);
        System.out.println(root.data+" level :"+l);
        traverse(root.right,l+1);
    }

}
