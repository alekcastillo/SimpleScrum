/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import data.JsonHandler;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import list.List;
import queue.Node;
import queue.Queue;

/**
 *
 * @author alekc
 */
public class BackEnd {

    public Queue users = new Queue();
    public List projects = new List();
    private User currentUser;
    private final JsonHandler datahelper = new JsonHandler();

    public BackEnd() {
        //users = this.datahelper.readUsers();
        //projects = this.datahelper.readProjects();
    }

    public Project addProject(String title, String description) {
        Project project = new Project(title, description);
        projects.insert(project);
        return project;
    }

    public User addUser(String firstName, String lastName, String email, String password, int type) {
        User user = new User(firstName, lastName, email, password, type);
        users.queue(user);
        return user;
    }

    public boolean tryLogin(String email, String password) {
        Node found = users.find(email, password);

        if (found != null) {
            currentUser = found.getObject();
        }

        return found != null;
    }

    public void saveAll() {
        this.datahelper.save(projects);

    }

    public boolean trySignUp(String firstName, String lastName, String email, String password) {
        addUser(firstName, lastName, email, password, 0);
        this.datahelper.save(users);

        return true;
    }

    public static boolean isNumber(String string) {
        boolean output = true;

        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) {
                output = false;
                break;
            }
        }

        return output;
    }
}
