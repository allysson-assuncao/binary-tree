package org.example;

import org.example.classes.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("https://code-with-me.global.jetbrains.com/WKQ4W4UFxXqur2ye6jrBiQ#p=IU&fp=EA5D4B03949D4568B1E04D0675A60D1A8B7EB4DEDE3F8A3340021A3AA95E41A8&newUi=true");

        arvore.inserir(15);
        arvore.inserir(8);
        arvore.inserir(2);
        arvore.inserir(12);
        arvore.inserir(10);
        System.out.println();

        arvore.inorder();
        arvore.inserir(23);
        arvore.inserir(20);
        arvore.inserir(30);

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
