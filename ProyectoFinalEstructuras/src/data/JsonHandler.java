package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import list.List;
import queue.Queue;
import stack.Stack;
import tree.Tree;

/**
 *
 * @author jorer
 */
public class JsonHandler {

    public JsonHandler() {
    }

    public void save(List list) {
        try {
            Writer writer = new FileWriter("projects.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(list, writer);
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(Queue queue) {
        try {
            Writer writer = new FileWriter("users.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(queue, writer);
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(Stack stack) {
        try {
            Writer writer = new FileWriter("sprints.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(stack, writer);
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(Tree tree) {
        try {
            Writer writer = new FileWriter("tasks.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(tree, writer);
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Object read(String file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file + ".json"));
            Gson gson = new Gson();
            Object json = gson.fromJson(bufferedReader, Object.class);
            return json;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
