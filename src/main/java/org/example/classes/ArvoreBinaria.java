package org.example.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

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
        System.out.println("\nCont: " + cont);
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
        System.out.println("\nCont: " + cont);
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
        System.out.println("\nCont: " + cont);
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

    public int retornaMenorValor(){
        if (this.nodo == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }
        No atual = this.nodo;
        while(atual.esquerda != null){
            atual = atual.esquerda;
        }
        return atual.valor;
    }

    public int retornaMaiorValor(){
        if (this.nodo == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }
        No atual = this.nodo;
        while(atual.direita != null){
            atual = atual.direita;
        }
        return atual.valor;
    }

    public int alturaIterativa() {
        if (nodo == null) {
            return -1;
        }

        Queue<No> fila = new LinkedList<>();
        fila.add(nodo);
        int altura = -1;

        while (!fila.isEmpty()) {
            int tamanhoNivel = fila.size();
            altura++;
            for (int i = 0; i < tamanhoNivel; i++) {
                No noAtual = fila.poll();
                if (noAtual.esquerda != null) {
                    fila.add(noAtual.esquerda);
                }
                if (noAtual.direita != null) {
                    fila.add(noAtual.direita);
                }
            }
        }
        return altura;
    }

    public List<String> caminhosParaFolhas() {
        List<String> todosOsCaminhos = new ArrayList<>();
        List<Integer> caminhoAtual = new ArrayList<>();
        encontrarCaminhosRec(nodo, caminhoAtual, todosOsCaminhos);
        return todosOsCaminhos;
    }

    private void encontrarCaminhosRec(No no, List<Integer> caminhoAtual, List<String> todosOsCaminhos) {
        if (no == null) {
            return;
        }

        caminhoAtual.add(no.valor);

        if (no.esquerda == null && no.direita == null) {
            String caminhoFormatado = caminhoAtual.stream()
                                                  .map(String::valueOf)
                                                  .collect(Collectors.joining(" -> "));
            todosOsCaminhos.add(caminhoFormatado);
        }

        encontrarCaminhosRec(no.esquerda, caminhoAtual, todosOsCaminhos);
        encontrarCaminhosRec(no.direita, caminhoAtual, todosOsCaminhos);

        caminhoAtual.remove(caminhoAtual.size() - 1);
    }

    public int contarNosNiveisImpares() {
        return contarNosNiveisImparesRec(nodo, 1);
    }

    private int contarNosNiveisImparesRec(No no, int nivel) {
        if (no == null) {
            return 0;
        }

        int contagemAtual = (nivel % 2 != 0) ? 1 : 0;

        int contagemEsquerda = contarNosNiveisImparesRec(no.esquerda, nivel + 1);
        int contagemDireita = contarNosNiveisImparesRec(no.direita, nivel + 1);

        return contagemAtual + contagemEsquerda + contagemDireita;
    }

    public int contarNosChavesPares() {
        return contarNosChavesParesRec(nodo);
    }

    private int contarNosChavesParesRec(No no) {
        if (no == null) {
            return 0;
        }

        int contagemAtual = (no.valor % 2 == 0) ? 1 : 0;

        int contagemEsquerda = contarNosChavesParesRec(no.esquerda);
        int contagemDireita = contarNosChavesParesRec(no.direita);

        return contagemAtual + contagemEsquerda + contagemDireita;
    }

    public int contarNosComUmFilho() {
        return contarNosComUmFilhoRec(nodo);
    }

    private int contarNosComUmFilhoRec(No no) {
        if (no == null) {
            return 0;
        }

        boolean temApenasUmFilho = (no.esquerda != null) ^ (no.direita != null);
        int contagemAtual = temApenasUmFilho ? 1 : 0;

        int contagemEsquerda = contarNosComUmFilhoRec(no.esquerda);
        int contagemDireita = contarNosComUmFilhoRec(no.direita);

        return contagemAtual + contagemEsquerda + contagemDireita;
    }
}