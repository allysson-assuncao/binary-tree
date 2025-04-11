package org.example.classes;

public class ArvoreBinaria {
    private static class No {
        int valor;
        No esquerda, direita;

        public No(int valor) {
            this.valor = valor;
            this.esquerda = this.direita = null;
        }
    }

    public No nodo;

    public ArvoreBinaria() {
        this.nodo = null;
    }

    public void inserir(int valor) {
        nodo = inserirRecursivo(nodo, valor);
    }

    private No inserirRecursivo(ArvoreBinaria.No arvore, int valor) {
        if (arvore == null) {
            arvore = new No(valor);
            return arvore;
        }

        if(valor < arvore.valor) {
            arvore.esquerda = inserirRecursivo(arvore.esquerda, valor);
        } else if (valor > arvore.valor) {
            arvore.direita = inserirRecursivo(arvore.direita, valor);
        }

        return arvore;
    }

    public void inorder() {
        inorderRec(nodo);
    }

    private void inorderRec(ArvoreBinaria.No root) {
        if (root != null) {
            inorderRec(root.esquerda);
            System.out.print(root.valor + " ");
            inorderRec(root.direita);
        }
    }

}
