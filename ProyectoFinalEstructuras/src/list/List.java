/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import backend.Project;


// clase list; estructura lista simple
public class List {
    private Node head;
    private int maxLength = 0;
    
    //metodo para insertar objetos en la lista
    public void insert(Project project) {
        Node toInsert = new Node(project);
        project.setId(maxLength());
        maxLength++;
        
        if (head == null) {
            head = new Node(project);
        } else {
            if (project.getId() <= head.getObject().getId()) {
                Node aux = new Node(project);
                aux.setNext(head);
                head = aux;

            } else {
                if (head.getNext() == null)
                    head.setNext(new Node(project));
                else {
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
    
    //get del atributo maxLength
    public int maxLength() {
        return maxLength;
    }
    
    // con este metodos podemos saber cuantos objetos hay en la lista
    public int length() {
        Node aux = head;
        int length = 0;

        while (aux != null) {
            length++;
            aux = aux.getNext();
        }

        return length;
    }
    // este metodo simula un arrayList para obtener un objeto con base a su indice
    public Node get(int id) {
        Node aux = head;
        Node toGet = null;

        while (aux != null) {
            if (aux.getObject().getId() == id) {
                toGet = aux;
                break;
            }
        
            aux = aux.getNext();
        }

        return toGet;
    }
    // elimina un objoet con el indice en la misma forma simulando un arraylist
    public void delete(int id) {
        Node aux = head;
        Node previous = null;
        
        if (head.getObject().getId() == id) {
            head = head.getNext();
        } else {
            while (aux != null) {
                if (aux.getObject().getId() == id) {
                    if (aux.getNext() == null) {
                        previous.setNext(null);
                    } else {
                        previous.setNext(aux.getNext());
                        aux.getNext().setPrevious(previous);
                    }
                    
                    aux.clearPointers();
                    
                    break;
                }
                
                previous = aux;
                aux = aux.getNext();
            }
        }
    }
}
