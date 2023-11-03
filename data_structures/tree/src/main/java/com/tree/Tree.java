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
            Node newNode = addNode(root);
            newNode.data = data;
        }else{
           bst(data,root);
        }
    }

    public void bst(int data,Node root){
        if(root.data < data){
            if(root.right == null){
                root.right = new Node(data);
            }else{
                bst(data,root.right);
            }
        }else{
            if(root.left == null){
                root.left = new Node(data);
            }else{
                bst(data,root.left);
            }
        }
    }

    private Node addNode(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            Node node = queue.poll();

            if(node.left == null){
                node.left = new Node();
                return node.left;
            }else{
                queue.add(node.left);
            }

            if(node.right == null){
                node.right = new Node();
                return node.right;
            }else{
                queue.add(node.right);
            }
        }
        return null;
    }

    public void print(){
        traverse(root);
    }

    private void traverse(Node root){
        if(root == null){
            return;
        }

        traverse(root.left);
        System.out.println(root.data);
        traverse(root.right);
    }

}
