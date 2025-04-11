package org.example;

import org.example.classes.ArvoreBinaria;
import org.example.classes.BinarySearchTree;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(15);

        arvore.inorder();

        arvore.inserir(8);

        arvore.inorder();

        /*BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.inorder();*/

        /*BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal of the given tree");
        bst.inorder();

        System.out.println("\n\nDelete 20");
        bst.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        bst.inorder();

        System.out.println("\n\nDelete 30");
        bst.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        bst.inorder();

        System.out.println("\n\nDelete 50");
        bst.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        bst.inorder();*/
    }

}
