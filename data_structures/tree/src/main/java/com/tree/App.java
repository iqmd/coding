package com.tree;

public class App{
    public static void main( String[] args ){
        Tree binaryTree = new Tree();

        binaryTree.add(10);
        binaryTree.add(15);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(7);
        binaryTree.add(23);
        binaryTree.add(65);

        binaryTree.print();
    }
}
