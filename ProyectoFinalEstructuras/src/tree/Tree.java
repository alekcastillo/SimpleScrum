package tree;

import backend.Task;

/**
 *
 * @author alekc
 */
public class Tree {
    
    private Node root;
    private int length = 0;
    private Node toGet = null;
    
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
    
    private void search(Node n, int id) {
        if (n != null) {
            search(n.getLeftChild(), id);
            if (n.getObject().getId() == id) {
                toGet = n;
            }
            search(n.getRightChild(), id);
        }
    }
    
    public void inOrden() {
        
    }
    
    public Node get(int id) {
        if (root != null) {
            search(root, id);
        }
        return toGet;
    }
    
    public void delete(int id) {
        if (root != null) {
            deleteTask(root, id);
        }
    }
    
    public void deleteTask(Node n, int id) {
        if (n != null) {
            deleteTask(n.getLeftChild(), id);
            if (n.getObject().getId() == id) {
                n.getObject().setDeleted(true);
            }
            deleteTask(n.getRightChild(), id);
        }
    }
    
}
