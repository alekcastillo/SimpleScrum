package backend;

import data.JsonHandler;
import list.List;
import queue.Node;
import queue.Queue;

/**
 *
 * @author alekc
 */
public class BackEnd {
    public Queue users;
    public List projects;
    private User currentUser;
    
    public BackEnd() {
        users = new Queue();
        projects = new List();
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
    
    public boolean trySignUp(String firstName, String lastName, String email, String password) {
        addUser(firstName, lastName, email, password, 0);
        
        return true;
    }
}
