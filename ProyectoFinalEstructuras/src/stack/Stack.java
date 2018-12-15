package stack;

import backend.Sprint;

public class Stack {

    private Node top;
    private int maxLength = 0;

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

    // get del atributo maxLength
    public int maxLength() {
        return maxLength;
    }

    // agrega un elemento a la pila
    public void push(Sprint sprint) {
        Node node = new Node(sprint);
        sprint.setId(maxLength());
        maxLength++;

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
        Node previous = null;
        while (aux != null) {
            if (aux.getObject().getId() == id) {
                if (previous != null) {
                    previous.setPrevious(aux.getPrevious());
                } else {
                    top = aux.getPrevious();
                }
            }
            previous = aux;
            aux = aux.getPrevious();
        }
    }
}
