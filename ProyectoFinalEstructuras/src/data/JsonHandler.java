package data;

import backend.Project;
import backend.Sprint;
import backend.Task;
import backend.User;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorer
 */
public class JsonHandler {

    private final JsonHandler helper = new JsonHandler();

    private JsonHandler() {
    }

    public JsonHandler getHelper() {
        return helper;
    }

    public void save(User user) {
        try {
            Writer writer = new FileWriter("users.json");
            //Gson gson = new GsonBuilder().create();
            //gson.toJson(user, writer);
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(Project project) {
        try {
            Writer writer = new FileWriter("projects.json");
            //Gson gson = new GsonBuilder().create();
            //gson.toJson(project, writer);
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(Sprint sprint) {
        try {
            Writer writer = new FileWriter("sprints.json");
            //Gson gson = new GsonBuilder().create();
            //gson.toJson(sprint, writer);
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(Task task) {
        try {
            Writer writer = new FileWriter("tasks.json");
            //Gson gson = new GsonBuilder().create();
            //gson.toJson(task, writer);
        } catch (IOException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Object read(String file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file + ".json"));
            //Gson gson = new Gson();
            //Object json = gson.fromJson(bufferedReader, Object.class);
            //return json;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
