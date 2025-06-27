package org.example;

import org.example.classes.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(33);
        arvore.inserir(15);
        arvore.inserir(41);
        arvore.inserir(38);
        arvore.inserir(34);
        arvore.inserir(47);
        arvore.inserir(43);
        arvore.inserir(49);

        /*System.out.println(arvore.retornaMenorValor());
        System.out.println(arvore.retornaMaiorValor());*/

        /*arvore.inorder();
        System.out.println();*/

        /*arvore.remover(6);*/

        System.out.println();
        arvore.inorder();
        System.out.println();
        arvore.preorder();
        System.out.println();
        arvore.postorder();
        System.out.println();
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
