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
// clase list; estructura lista simple
public class List {
    
    private Node head;
    //metodo para insertar objetos en la lista
    public void insert(Project project) {
        Node toInsert = new Node(project);
        project.setId(length());
        if (head == null) {
            head = new Node(project);
        } else {
            if (project.getId() <= head.getObject().getId()) {
                Node aux = new Node(project);
                aux.setNext(head);
                head = aux;

            } else {
                if (head.getNext() == null) {
                    head.setNext(new Node(project));

                } else {
                    Node aux = head;
                    while (aux.getNext() != null && project.getId() > aux.getObject().getId()) {
                        aux = aux.getNext();
                    }
                    Node temp = new Node(project);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);

                }

            }

        }

    }
    // con este metodos podemos saber cuantos objetos hay en la lista
    public int length() {
        Node aux = head;
        int length = 0;

        if (aux != null) {
            while (aux != null) {
                length++;
                aux = aux.getNext();
            }
        }

        return length;
    }
    // este metodo simula un arrayList para obtener un objeto con base a su indice
    public Node get(int index) {
        Node aux = head;
        Node toGet = null;
        int length = 0;

        while (aux != null) {
            length++;
            if (index == length) {
                toGet = aux;
            }
            aux = aux.getNext();
        }

        return toGet;
    }
    // elimina un objoet con el indice en la misma forma simulando un arraylist
    public void delete(int index) {
        int length = 0;
        Node aux = head;
        Node previous = null;
        if (length == index) {
            head = head.getNext();
        } else {
            while (aux != null) {
                if (length == index) {
                    if (aux.getNext() == null) {
                        previous.setNext(null);
                    } else {
                        aux.setNext(aux.getNext().getNext());
                    }

                }
                previous = aux;
                aux = aux.getNext();
                length++;

            }

        }
    }
}
