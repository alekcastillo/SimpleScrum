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
public class Stack {
    private Node top;

    public int length() {
        int length = 0;
        Node aux = top;
        
        while (aux != null) {
            length++;
            aux = aux.getPrevious();
        }
        
        return length;
    }
    
    public void push(Sprint sprint) {
        Node node = new Node(sprint);
        
        if (top != null) {
            node.setPrevious(top);
        }

        top = node;
    }

    public Node pop() {
        Node output = top;

        if (output != null) {
            top = output.getPrevious();
            output.setPrevious(null);
        }
        
        return output;
    }
    
    public Node get(int index) {
        Node toGet = null;
        Node aux = top;
        int length = 0;
        
        while (aux != null) {
            if (index == length) {
                toGet = aux;
                break;
            }
            
            length++;
            aux = aux.getPrevious();
        }
        
        return toGet;
    }

    public void delete(int index) {
        Node aux = top;
        Node last =  null;
        int length = 0;
        
        while (aux != null) {
            length++;
            if (index == length) {
                if (last != null) {
                    last.setPrevious(aux.getPrevious());
                } else {
                    top = aux.getPrevious();
                }
            }

            aux = aux.getPrevious();
        }
    }
}
