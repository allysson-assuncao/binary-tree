package org.example;

import org.example.classes.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {

        System.out.println("https://code-with-me.global.jetbrains.com/QAE6eoDa2fZ48axb43ns8w#p=IU&fp=4191570DA49B864F41BADA7D415A908D972947C1AF764F2717E8D971B1537C23&newUi=true");

        ArvoreBinaria arvore = new ArvoreBinaria();
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

        /*arvore.inorder();
        System.out.println();*/

        arvore.remover(6);

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
