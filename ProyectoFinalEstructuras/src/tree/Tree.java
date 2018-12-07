package tree;

import backend.Task;

/**
 *
 * @author alekc
 */
public class Tree {

    private Node raiz;

    public void add(Task task) {
        if (raiz == null) {
            raiz = new Node(task);
        } else {
            insertaRec(task, raiz);
        }
    }

    private void insertaRec(Task task, Node n) {
        if (task.getId() < n.getDato().getId()) {
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

    public Node get(int id) {
        return search(raiz, id);
    }

    private Node search(Node root, int key) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getDato().getId() == key) {
                return currentNode;
            } else if (key < currentNode.getDato().getId()) {
                currentNode = currentNode.getHijoIzq();
            } else {
                currentNode = currentNode.getHijoDer();
            }

        }
        return currentNode;
    }
}
