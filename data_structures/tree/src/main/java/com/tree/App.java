package com.tree;

public class App{
    public static void main( String[] args ){
        Tree tree = new Tree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(18);

        tree.print();
    }
}
