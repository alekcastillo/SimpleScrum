/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import backend.Sprint;


public class Stack {
    private Node top;
    
    // averiguamos el tamaño de la pila
    public int length() {
        int length = 0;
        Node aux = top;

        while (aux != null) {
            length++;
            aux = aux.getPrevious();
        }

        return length;
    }
    // agrega un elemento a la pila
    public void push(Sprint sprint) {
        Node node = new Node(sprint);
        sprint.setId(length());

        if (top != null) {
            node.setPrevious(top);
        }

        top = node;
    }

    // saca el ultimo elemento de la pila
    public Node pop() {
        Node output = top;

        if (output != null) {
            top = output.getPrevious();
            output.setPrevious(null);
        }

        return output;
    }
    
    // obtiene un elemento con base a su id
    public Node get(int id) {
        Node toGet = null;
        Node aux = top;

        while (aux != null) {
            if (aux.getObject().getId() == id) {
                toGet = aux;
                break;
            }
            
            aux = aux.getPrevious();
        }

        return toGet;
    }
    
    // elimina un elemento con base a su id
    public void delete(int id) {
        Node aux = top;
        Node last = null;
        
        while (aux != null) {
            if (aux.getObject().getId() == id) {
                if (aux == top) {
                    top = null;
                } else if (last != null) {
                    last.setPrevious(aux.getPrevious());
                } else {
                    top = aux.getPrevious();
                }
            }

            aux = aux.getPrevious();
        }
    }
}
