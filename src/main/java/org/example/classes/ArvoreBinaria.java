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

    public void remover(int valor) {
        nodo = removerRec(this.nodo, valor);
    }

    private No removerRec(No arvore, int valor) {
        if (arvore == null) return arvore;

        if (valor < arvore.valor) {
            arvore.esquerda = removerRec(arvore.esquerda, valor);
        } else if (valor > arvore.valor) {
            arvore.direita = removerRec(arvore.direita, valor);
        } else {
            if (arvore.direita == null) return arvore.esquerda;
            else if (arvore.esquerda == null) return arvore.direita;

            arvore.valor = valorMaximo(arvore.esquerda);
            arvore.esquerda = removerRec(arvore.esquerda, arvore.valor);
        }

        return arvore;
    }

    private int valorMaximo(No arvore) {
        int valorM = arvore.valor;
        while(arvore.direita != null) {
            valorM = arvore.direita.valor;
            arvore = arvore.direita;
        }
        return valorM;
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

    public void preorder() {
        preorderRec(nodo);
        System.out.println("Cont: " + cont);
        cont = 0;
    }

    private void preorderRec(ArvoreBinaria.No nodo) {
        if(nodo != null) {
            cont++;
            System.out.printf(nodo.valor + " ");
            preorderRec(nodo.esquerda);
            preorderRec(nodo.direita);
        }
    }

    public void postorder() {
        postorderRec(nodo);
        System.out.println("Cont: " + cont);
        cont = 0;
    }

    private void postorderRec(ArvoreBinaria.No nodo) {
        if(nodo != null) {
            postorderRec(nodo.esquerda);
            postorderRec(nodo.direita);
            cont++;
            System.out.printf(nodo.valor + " ");
        }
    }
}
