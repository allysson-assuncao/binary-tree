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

    private static int cont = 0;

    public ArvoreBinaria() {
        this.nodo = null;
    }

    public void inserir(int valor) {
        nodo = inserirRecursivo(this.nodo, valor);
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
        System.out.println("Cont: " + cont);
        cont = 0;
    }

    private void inorderRec(ArvoreBinaria.No nodo) {
        if(nodo != null) {
            inorderRec(nodo.esquerda);
            cont++;
            System.out.printf(nodo.valor + " ");
            inorderRec(nodo.direita);
        }
    }

}
