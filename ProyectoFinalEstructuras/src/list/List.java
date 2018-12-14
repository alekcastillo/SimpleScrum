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
public class List {

    private Node head;

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

    public void delete(int index) {
        int length = 0;
        Node aux = head;
        if (length == index) {
            head = head.getNext();
        } else {
            while (aux != null) {
                if (length == index) {
                    if (aux.getNext()== null) {
                        aux.clearPointers();

                    } else {
                        aux.setNext(aux.getNext().getNext());
                    }

                }
                aux = aux.getNext();
                length++;

            }

        }
    }
}
