/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import queue.Node;

/**
 *
 * @author alekc
 */
public class Queue {
    private Node first, last;
    
    public void queue(Node node) {
        if (first == null) {
            first = node;
        } else {
            last.setPrevious(node);
        }
        
        last = node;
    }
    
    public Node attend() {
        Node output = first;
        
        if (first != null) {
            last = (last == output ? null : last);
            first = output.getPrevious();
            output.setPrevious(null);
        }
        
        return output;
    }
}
