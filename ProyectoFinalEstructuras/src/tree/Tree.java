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
public class Tree {
    private Node raiz;

    public void inserta(int num) {
        if (raiz == null) {
            raiz = new Node(num);
        } else {
            insertaRec(num, raiz);
        }
    }

    private void insertaRec(int num, Node n) {
        if (num < n.getDato()) {
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new Node(num));
            } else {
                insertaRec(num, n.getHijoIzq());
            }
        } else {
            if (n.getHijoDer() == null) {
                n.setHijoDer(new Node(num));
            } else {
                insertaRec(num, n.getHijoDer());
            }
        }

    }

    private void inOrdenRec(Node n) {
        if (n != null) {
            inOrdenRec(n.getHijoIzq());
            System.out.print(" " + n);
            inOrdenRec(n.getHijoDer());
        }
    }

    public void inOrden() {
        if (raiz != null) {
            inOrdenRec(raiz);
        }
    }

    private void postOrdenRec(Node n) {
        if (n != null) {
            postOrdenRec(n.getHijoIzq());
            postOrdenRec(n.getHijoDer());
            System.out.print(" " + n);

        }

    }

    public void postOrden() {
        if (raiz != null) {
            postOrdenRec(raiz);
        }

    }

    private void preOrdenRec(Node n) {
        if (n != null) {
            System.out.print(" " + n);
            preOrdenRec(n.getHijoIzq());
            preOrdenRec(n.getHijoDer());

        }
    }

    public void preOrden() {
        if (raiz != null) {
            preOrdenRec(raiz);
        }

    }
    
    public String[] getTaskNames() {
        String[] output = new String[this.length()];
        
        return output;
    }
}
