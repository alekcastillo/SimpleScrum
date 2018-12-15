/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import backend.Project;

/**
 *
 * @author alekc
 */
// Nodo encargado de almacenar la informacion del objeto en la lista
public class Node {
    private Project object;
    private Node next, previous;
    
    public Node(Project object) {
        this.object = object;
    }
    
    public void clearPointers() {
        next = null;
        previous = null;
    }
    
    public Project getObject() {
        return object;
    }

    public void setObject(Project object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
