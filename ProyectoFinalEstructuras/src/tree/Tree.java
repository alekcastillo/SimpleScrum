package tree;

import backend.Task;
// clase arbol data structure
public class Tree {
    private Node root;
    private Node toGet = null;
    private int maxLength = 0;
    
    // agrega un elemento al arbol 
    public void add(Task task) {
        if (root == null) {
            root = new Node(task);
        } else {
            insertaRec(task, root);
        }
        
        task.setId(maxLength());
        maxLength++;
    }
    
    // get del atributo maxLength
    public int maxLength() {
        return maxLength;
    }
    
    // inserta un nodo en e arbol con base al id asignado
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
    
    // busca recursivamente un nodo en el arbol
    private void search(Node n, int id) {
        if (n != null) {
            search(n.getLeftChild(), id);
            
            if (n.getObject().getId() == id) {
                toGet = n;
            }
            
            search(n.getRightChild(), id);
        }
    }
    
    // obtiene un nodo que es buscado con un metodo recursivo con base a su id
    public Node get(int id) {
        if (root != null) {
            search(root, id);
        }
        
        return toGet;
    }
    
    // elimina a nivel logico un elemento del arbol mediante un metodo recursivo
    public void delete(int id) {
        get(id).getObject().setDeleted(true);
    }
}
