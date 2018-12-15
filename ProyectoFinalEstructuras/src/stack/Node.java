/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import backend.Sprint;

/**
 *
 * @author alekc
 */
public class Node {
    private Sprint object;
    private Node previous;
    
    public Node(Sprint object) {
        this.object = object;
    }
    
    public void clearPointers() {
        previous = null;
    }
    
    public Sprint getObject() {
        return object;
    }

    public void setObject(Sprint object) {
        this.object = object;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
