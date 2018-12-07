package data;

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
public class JsonHandler {

    Gson gson = new Gson();

    public JsonHandler() {
    }

    public void save(Queue queue) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jorer\\Desktop\\Proyecto Final\\proyecto_estructuras\\users.json"));
            this.gson.toJson(queue, writer);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(List list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jorer\\Desktop\\projects.json"));
            this.gson.toJson(list, writer);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Queue readUsers() {
        BufferedReader bufferedReader;
        Queue json = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\jorer\\Desktop\\Proyecto Final\\proyecto_estructuras\\users.json"));
            json = gson.fromJson(bufferedReader, Queue.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;

    }

    public List readProjects() {
        BufferedReader bufferedReader;
        List json = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\jorer\\Desktop\\projects.json"));
            json = gson.fromJson(bufferedReader, List.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;

    }

}
