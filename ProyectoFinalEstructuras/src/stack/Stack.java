/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import backend.Sprint;


public class Stack {

    private Node top;
    // averiguamos el tamaño de la cola
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
    //obtiene un elemento con base al indice
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
    // elimina un numero con base al indice calculado con el length 
    public void delete(int index) {
        Node aux = top;
        Node last = null;
        int length = 0;
        while (aux != null) {
            length++;
            if (index == length) {
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
