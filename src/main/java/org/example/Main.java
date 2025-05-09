package org.example;

import org.example.classes.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(8);
        arvore.inserir(8);
        arvore.inserir(2);
        arvore.inserir(10);
        arvore.inserir(1);
        arvore.inserir(14);
        arvore.inserir(6);
        arvore.inserir(4);
        arvore.inserir(7);
        arvore.inserir(13);
        arvore.inserir(3);

        arvore.inorder();
        System.out.println();

        arvore.remover(6);

        System.out.println();

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
