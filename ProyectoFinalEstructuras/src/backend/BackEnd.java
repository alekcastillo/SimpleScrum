/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import data.JsonHandler;
import list.List;
import queue.Node;
import queue.Queue;

// clase backedn que va ser la interfaz entre el front end y los models de las estructuras de las bases de datos
public class BackEnd {

    //Cola de usuarios
    public Queue users = new Queue();
    //lista de proyectos
    public List projects = new List();
    private User currentUser;
    private final JsonHandler datahelper = new JsonHandler();

    // mediante el constructor va a leer la " base de datos " que son los archivos JSON 
    public BackEnd() {
        //users = this.datahelper.readUsers();
        //projects = this.datahelper.readProjects();
    }
    // crea una instancia de un proyecto y lo agrega a la lista de proyectos
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
        //this.datahelper.save(projects);
    }

    public boolean trySignUp(String firstName, String lastName, String email, String password) {
        addUser(firstName, lastName, email, password, 0);
        //this.datahelper.save(users);

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
