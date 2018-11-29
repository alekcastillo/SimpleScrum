/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author alekc
 */
public class List {
    private Node head, ultimo;

    @Override
    public String toString() {
        String output = "";
        Node a_revisar = head;
        
        do {
            output += a_revisar + " ";
            
            a_revisar = a_revisar.getNext();
        } while (a_revisar != head);
        
        return output;
    }
    
    public void insert(Project project) {
        Node toInsert = new Node(j);
        if (head == null) {
            head = new Node(j);
            ultimo = head;
        } else {
            if (j.getPrecio() <= head.getObject().getPrecio()) {
                head.setPrevious(new Node(j));
                head.getPrevious().setNext(head);
                head = head.getPrevious();

            } else {
                if (j.getPrecio() >= ultimo.getObject().getPrecio()) {
                    ultimo.setNext(new Node(j));
                    ultimo.getNext().setPrevious(ultimo);
                    ultimo = ultimo.getNext();
                } else {
                    Node aux = head;
                    
                    while (j.getPrecio() > aux.getNext().getObject().getPrecio()) {
                        aux = aux.getNext();
                    }
                    
                    Node temp = new Node(j);
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
    
    //Practica / Taller
    
    public boolean existe(String nombre, int year) {
        boolean output = false;
        Node a_revisar = head;
        
        do {
            Juego dato = a_revisar.getObject();
            
            if (dato.getNombre().equals(nombre) && dato.getYear() == year) {
                output = true;
                break;
            }
            
            a_revisar = a_revisar.getNext();
        } while (a_revisar != head);
        
        return output;
    }
    
    public void modificar(String nombre, int precio) {
        Node a_revisar = head;
        
        do {
            Juego dato = a_revisar.getObject();
            
            if (dato.getNombre().equals(nombre)) {
                dato.setPrecio(precio);
                break;
            }
            
            a_revisar = a_revisar.getNext();
        } while (a_revisar != head);
    }
    
    public void eliminar(String publisher) {
        Node a_revisar = head;
        Node head = head;
        
        do {
            head = head;
            Juego dato = a_revisar.getObject();
            Node previous = a_revisar.getPrevious();
            Node next = a_revisar.getNext();
            
            if (dato.getPublisher().equals(publisher)) {
                previous.setNext(next);
                next.setPrevious(previous);
                a_revisar.clearPointers();
                
                if (head == a_revisar)
                    head = next;
                if (ultimo == a_revisar)
                    ultimo = previous;
            }
            
            a_revisar = next;
        } while (a_revisar != head);
    }
}
