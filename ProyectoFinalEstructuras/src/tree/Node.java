/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import backend.Task;

/**
 *
 * @author alekc
 */
public class Node {
        
    private Task dato;
    private Node hijoIzq,hijoDer;

    public Node(Task dato) {
        this.dato = dato;
    }

    public Task getDato() {
        return dato;
    }

    public void setDato(Task dato) {
        this.dato = dato;
    }

    public Node getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Node hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Node getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Node hijoDer) {
        this.hijoDer = hijoDer;
    }

    @Override
    public String toString() {
        return " " + dato;
    }
}
