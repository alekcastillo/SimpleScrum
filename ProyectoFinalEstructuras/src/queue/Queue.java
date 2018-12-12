/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import backend.User;
import queue.Node;

/**
 *
 * @author alekc
 */
public class Queue {
    private Node first, last;
    
    //Control
   
    public int length() {
        Node aux = first;
        int length = 0;
        
        while (aux != null) {
            length++;
            aux = aux.getPrevious();
        }
        
        return length;
    }

    public void queue(User user) {
        Node node = new Node(user);
        
        user.setId(length());
        
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
                if (previous != null)
                    previous.setPrevious(aux.getPrevious());
                else
                    first = aux.getPrevious();
            }
            
            previous = aux;
            aux = aux.getPrevious();
        }
    }
    
    //Other
    
    public String[] getUserNames() {
        String[] output = new String[this.length()];
        Node aux = first;
        int index = 0;
        
        while (aux != null) {
            output[index] = aux.getObject().getName();
            aux = aux.getPrevious();
            index++;
        }
        
        return output;
    }
    
    public Node find(String email, String password) {
        Node aux = first;
        Node output = null;
        
        while (aux != null) {
            if (aux.getObject().getEmail().equals(email) && aux.getObject().getPassword().equals(password)) {
                output = aux;
                break;
            }
            
            aux = aux.getPrevious();
        }
        
        return output;
    }
}
