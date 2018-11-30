/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

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
    
    public void addProject() {
        
    }
    
    public void addUser(String firstName, String lastName, String email, String password, int type) {
        User user = new User(firstName, lastName, email, password, type);
        users.queue(user);
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
