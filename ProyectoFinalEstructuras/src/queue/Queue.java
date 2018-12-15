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
    private int maxLength = 0;
    
    //get del atributo maxLength
    public int maxLength() {
        return maxLength;
    }
    
    // metodo length para saber cuantos elementos estan almacenados en la cola
    public int length() {
        Node aux = first;
        int length = 0;
        
        while (aux != null) {
            length++;
            aux = aux.getPrevious();
        }
        
        return length;
    }

    //encola(agrega) elementos a la cola
    public void queue(User user) {
        Node node = new Node(user);
        user.setId(maxLength());
        maxLength++;
        
        if (first == null) {
            first = node;
        } else {
            last.setPrevious(node);
        }

        last = node;
    }

    // extrae el primer elemento de la cola
    public Node attend() {
        Node output = first;
        
        if (first != null) {
            last = (last == output ? null : last);
            first = output.getPrevious();
            output.setPrevious(null);
        }

        return output;
    }
    // saca un elemento de la cola con base al length podemos calcular su indice
    public Node get(int index) {
        Node aux = first;
        Node toGet = null;
        int length = 0;
        
        while (aux != null) {
            if (length == index) {
                toGet = aux;
            }
            
            length++;
            aux = aux.getPrevious();
        }
        
        return toGet;
    }

    // elimina un elemento de la cola con base al length podemos calcular su indice
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
    
    //Obtiene los nombres de los usuarios, es decir recorre la cola y obtiene un atributo y lo almacena en un vector
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
    // hace una busqueda en la cola para obtener los credenciales del usuario
    public Node find(String email, String password) {
        Node aux = first;
        Node output = null;
        
        while (aux != null) {
            if (aux.getObject().getEmail().equals(email)) {
                if (aux.getObject().getPassword().equals(password))
                    output = aux;
            
                break;
            }
            
            aux = aux.getPrevious();
        }
        
        return output;
    }
    // verifica si el email ingresado esta disponible
    public boolean emailAvailable(String email) {
        boolean output = true;
        Node aux = first;
        
        while (aux != null) {
            if (aux.getObject().getEmail().equals(email)) {
                output = false;
                break;
            }
            
            aux = aux.getPrevious();
        }
        
        return output;
    }
}
