/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author alekc
 */
public class Node {
    private Object object;
    private Node previous;
    
    public Node(Object object) {
        this.object = object;
    }
    
    //@Override
    //public String toString() {
        //return "Nodo{" + "dato=" + dato + '}';
    //}
    
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
