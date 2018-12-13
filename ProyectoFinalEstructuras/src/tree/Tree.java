package tree;

import backend.Task;

/**
 *
 * @author alekc
 */
public class Tree {
    private Node root;
    private int length = 0;

    public void add(Task task) {
        if (root == null) {
            root = new Node(task);
        } else {
            insertaRec(task, root);
        }
        
        task.setId(length);
        length++;
    }
    
    public int length() {
        return length;
    }

    private void insertaRec(Task task, Node n) {
        if (task.getId() < n.getObject().getId()) {
            if (n.getLeftChild() == null) {
                n.setLeftChild(new Node(task));
            } else {
                insertaRec(task, n.getLeftChild());
            }
        } else {
            if (n.getRightChild() == null) {
                n.setRightChild(new Node(task));
            } else {
                insertaRec(task, n.getRightChild());
            }
        }
    }

    private void inOrdenRec(Node n) {
        if (n != null) {
            inOrdenRec(n.getLeftChild());
            System.out.print(" " + n);
            inOrdenRec(n.getRightChild());
        }
    }

    public void inOrden() {
        if (root != null) {
            inOrdenRec(root);
        }
    }

    public Node get(int id) {
        Node currentNode = root;
        
        while (currentNode != null) {
            if (currentNode.getObject().getId() == id) {
                return currentNode;
            } else if (id < currentNode.getObject().getId()) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
        }
        
        return currentNode;
    }
}
