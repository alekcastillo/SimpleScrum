/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author alekc
 */
public class Node {
        
    private int dato;
    private Node hijoIzq,hijoDer;

    public Node(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
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
