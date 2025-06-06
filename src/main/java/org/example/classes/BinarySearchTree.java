package org.example.classes;

public class BinarySearchTree {

    private static class Node {
        int key;
        Node left, right;
        int height;

        public Node(int item) {
            key = item;
            left = right = null;
            height = 1;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert a new key with balancing
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        } else {
            // Duplicates not allowed
            return node;
        }

        // Atualiza altura do nó atual
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Calcula fator de balanceamento
        int balance = getBalance(node);

        // LL Case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // LR Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RR e RL não implementados pois só pediu LL e LR

        return node;
    }

    // Calcula altura de um nó
    private int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    // Fator de balanceamento
    private int getBalance(Node node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    // Rotação simples à direita (LL)
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotação
        x.right = y;
        y.left = T2;

        // Atualiza alturas
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Retorna nova raiz
        return x;
    }

    // Rotação simples à esquerda (usada na LR)
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Rotação
        y.left = x;
        x.right = T2;

        // Atualiza alturas
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Retorna nova raiz
        return y;
    }

    // Métodos de travessia (iguais ao original)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.key + " ");
            inorderRec(node.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.key + " ");
        }
    }
}