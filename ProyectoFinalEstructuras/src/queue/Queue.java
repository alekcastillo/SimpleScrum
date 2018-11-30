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
    
    public String[] getUserNames() {
        String[] output = new String[this.length()];
        
        return output;
    }

    public int length() {
        Node aux = first;
        int length = 0;
        while (aux != null) {
            length++;
            aux = aux.getPrevious();
        }
        return length;
    }

    public Node get(int index) {
        Node aux = first;
        Node toGet = null;
        int length = 0;
        while (aux != null) {
            length++;
            if (length == index) {
                toGet = aux;
            }
            aux = aux.getPrevious();
        }
        return toGet;
    }

    public void delete(int index) {
        Node aux = first;
        Node previous = null;
        int length = 0;
        while (aux != null) {
            length++;
            if (length == index) {
                if (previous != null) {

                    previous.setPrevious(aux.getPrevious());
                } else {
                    first = aux.getPrevious();
                }
            }
            previous = aux;
            aux = aux.getPrevious();
        }
    }
}
