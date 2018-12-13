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
    private Node head, last;

    public void insert(Project project) {
        Node toInsert = new Node(project);

        if (head == null) {
            head = toInsert;
            last = head;
        } else {
            if (project.getId() <= head.getObject().getId()) {
                head.setPrevious(toInsert);
                head.getPrevious().setNext(head);
                head = head.getPrevious();

            } else {
                if (project.getId() >= last.getObject().getId()) {
                    last.setNext(toInsert);
                    last.getNext().setPrevious(last);
                    last = last.getNext();
                } else {
                    Node aux = head;

                    while (project.getId() > aux.getNext().getObject().getId()) {
                        aux = aux.getNext();
                    }

                    Node temp = toInsert;
                    temp.setNext(aux.getNext());
                    temp.setPrevious(aux);
                    aux.setNext(temp);
                    temp.getNext().setPrevious(temp);
                }

            }
        }

        last.setNext(head);
        head.setPrevious(last);
    }

    public int length() {
        Node aux = head;
        int length = 0;

        if (aux != null) {
            do {
                length++;
                aux = aux.getNext();
            } while (aux != head);
        }

        return length;
    }

    public Node get(int index) {
        Node aux = head;
        Node toGet = null;
        int length = 0;

        do {
            length++;
            if (index == length) {
                toGet = aux;
            }
            aux = aux.getNext();
        } while (aux != head);

        return toGet;
    }

    public void delete(int index) {
        Node aux = head;
        Node last = null;
        int length = 0;
        do {
            length++;
            if (index == length) {
                if (aux == head) {
                    head = aux.getNext();
                    last.setNext(aux.getNext());
                    head.setPrevious(last);
                } else if (aux == last) {
                    last = aux.getPrevious();
                    last.setNext(head);
                    last.setPrevious(aux.getPrevious().getPrevious());
                } else {
                    last.setNext(aux.getNext());
                    Node temp;
                    temp = aux.getNext();
                    temp.setPrevious(last);
                }

            }
            last = aux;
            aux = aux.getNext();
        } while (aux != head);
    }
}
