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

    private Node head, ultimo;

    public void insert(Project project) {
        Node toInsert = new Node(project);

        if (head == null) {
            head = toInsert;
            ultimo = head;
        } else {
            if (project.getId() <= head.getObject().getId()) {
                head.setPrevious(toInsert);
                head.getPrevious().setNext(head);
                head = head.getPrevious();

            } else {
                if (project.getId() >= ultimo.getObject().getId()) {
                    ultimo.setNext(toInsert);
                    ultimo.getNext().setPrevious(ultimo);
                    ultimo = ultimo.getNext();
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
        ultimo.setNext(head);
        head.setPrevious(ultimo);
    }

    public int length() {
        Node aux = head;
        int length = 0;
        do {
            length++;
            aux = aux.getNext();
        } while (aux != head);
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

}
