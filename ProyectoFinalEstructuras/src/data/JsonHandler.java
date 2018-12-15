package data;

import backend.Project;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import list.List;
import queue.Queue;

/**
 *
 * @author jorer
 */

// clase que se encarga de guardar los datos y cargarlos al programa
public class JsonHandler {
    //objeto de la libreria gson de google para parsear y serializar
    Gson gson = new Gson();

    //metodo sobrecargado para poder guardar los dos objetos principales en archivos json
    public void save(Queue queue) {
        try {
            // buffer para abrir el archivo 
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jorer\\Desktop\\proyecto_estructuras\\users.json"));
            // serializa los objetos en la clase final
            this.gson.toJson(queue, writer);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //metodo sobrecargado para poder guardar los dos objetos principales en archivos json
    public void save(List list) {
        try {
            // buffer para abrir el archivo 
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jorer\\Desktop\\proyecto_estructuras\\projects.json"));
            // serializa los objetos en la clase final
            this.gson.toJson(list, writer);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //metodo sobrecargado para poder leer los dos objetos principales en archivos json
    public Queue readUsers() {
        BufferedReader bufferedReader;
        Queue json = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\jorer\\Desktop\\proyecto_estructuras\\users.json"));
            // extrae el archivo y lo parsea en un objeto de la clase destino en esta caso queue
            json = gson.fromJson(bufferedReader, Queue.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;

    }
     //metodo sobrecargado para poder leer los dos objetos principales en archivos json
    public List readProjects() {
        BufferedReader bufferedReader;
        List json = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\jorer\\Desktop\\proyecto_estructuras\\projects.json"));
            // extrae el archivo y lo parsea en un objeto de la clase destino en esta caso list
            json = gson.fromJson(bufferedReader, List.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;

    }

}
