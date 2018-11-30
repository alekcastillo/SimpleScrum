package tree;

import backend.Task;

/**
 *
 * @author alekc
 */
public class Tree {
    private Node raiz;
    private int length = 0;
  
    public void add(Task task) {
        if (raiz == null) {
            raiz = new Node(task);
        } else {
            insertaRec(task, raiz);
        }
    }

    private void insertaRec(Task task, Node n) {
        if (task.getPriority() < n.getDato().getPriority()) {
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new Node(task));
            } else {
                insertaRec(task, n.getHijoIzq());
            }
        } else {
            if (n.getHijoDer() == null) {
                n.setHijoDer(new Node(task));
            } else {
                insertaRec(task, n.getHijoDer());
            }
        }
    }

    private void inOrdenRec(Node n) {
        if (n != null) {
            this.length++;
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
 
    //public String[] getTaskNames() {
        //String[] output = new String[this.length()];
        
        //return output;
    //}
}
